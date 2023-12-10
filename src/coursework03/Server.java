package coursework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//Этот класс представляет серверную часть приложения.
//В методе start() сервер создает серверный сокет и начинает считывать входящие подключения.
//Когда клиент подключился, сервер создает новый поток для обработки соединения с клиентом.
public class Server
{
    private static final int SERVER_PORT = 12345;
    private static final int MAX_FILE_DESCRIPTION_LENGTH = 100;
    private static final int MAX_FILE_CONTENT_SIZE = 10 * 1024 * 1024;

    private List<Connection> connections = new ArrayList<>();
    private static List<FileData> files = new ArrayList<>();

    public static void main(String[] args)
    {
        new Server().start();
    }

    public void start()
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Сервер запущен и ожидает подключений.");

            while (true)
            {
                //Соединение от клиента
                Socket socket = serverSocket.accept();
                System.out.println("Подключился новый клиент.");

                // Создание нового соединения и добавление его в список активных соединений
                Connection connection = new Connection(socket);
                connections.add(connection);

                // Запуск потока для обработки соединения
                Thread connectionThread = new Thread(connection);
                connectionThread.start();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    //Рассылка сервером сообщения всем активным клиентам.
    private void broadcastMessage(Message message)
    {
        for (Connection connection : connections)
        {
            connection.sendMessage(message);
        }
    }

    private void removeConnection(Connection connection)
    {
        connections.remove(connection);
    }

    // Класс Connection представляет соединение клиент-сервер.
    // Он реализует интерфейс Runnable, чтобы можно было запустить его в отдельном потоке.
    private class Connection implements Runnable
    {
        private final Socket socket;
        private ObjectInputStream inputStream;
        private ObjectOutputStream outputStream;

        public Connection(Socket socket)
        {
            this.socket = socket;
        }

        //В методе run соединение читает сообщения от клиента и выполняет действия в зависимости от содержимого сообщения.
        //Если получено сообщение с описанием файла, сервер сохраняет файл на сервере и рассылает информацию о новом файле всем клиентам.
        //Если получен запрос на получение файла, сервер отправляет информацию о файле и его содержимое клиенту.
        @Override
        public void run()
        {
            try
            {
                inputStream = new ObjectInputStream(socket.getInputStream());
                outputStream = new ObjectOutputStream(socket.getOutputStream());

                while (true)
                {
                    // Получение сообщения от клиента
                    Message message = (Message) inputStream.readObject();

                    // Если получено сообщение с описанием файла - сохранение файла и рассылка информации о нем
                    if (message.getContent().startsWith("FILE_DESCRIPTION:"))
                    {
                        String fileDescription = message.getContent().substring(17);
                        if (fileDescription.length() <= MAX_FILE_DESCRIPTION_LENGTH)
                        {
                            // Получаем содержимое файла
                            message = (Message) inputStream.readObject();
                            byte[] fileContent = message.getContent().getBytes();

                            // Если размер файла не превышает максимально допустимый - сохранение
                            if (fileContent.length <= MAX_FILE_CONTENT_SIZE)
                            {
                                // Генерируем уникальное имя файла
                                String fileName = generateFileName();

                                // Создание файла на сервере и запись в него содержимого
                                File file = new File(fileName);
                                try (FileOutputStream fileOutputStream = new FileOutputStream(file))
                                {
                                    fileOutputStream.write(fileContent);
                                }

                                // Добавление информации о файле в список
                                files.add(new FileData(fileName, fileDescription));

                                // Рассылка информации о загруженном файле всем клиентам
                                broadcastMessage(new Message("Новый файл: " + fileDescription));
                            }
                            else
                            {
                                System.out.println("Превышен максимальный размер файла.");
                            }
                        }
                        else
                        {
                            System.out.println("Превышена максимальная длина описания файла.");
                        }
                    }
                    else if (message.getContent().startsWith("REQUEST_FILE:"))
                    {
                        String requestedFileName = message.getContent().substring(13);
                        for (FileData fileData : files)
                        {
                            if (fileData.getFileName().equals(requestedFileName))
                            {
                                // Отправка клиенту информации о файле
                                sendMessage(new Message("FILE_DESCRIPTION:" + fileData.getDescription()));

                                // Отправка клиенту содержимого файла
                                File file = new File(fileData.getFileName());
                                byte[] fileContent = new byte[(int) file.length()];
                                try (FileInputStream fileInputStream = new FileInputStream(file))
                                {
                                    fileInputStream.read(fileContent);
                                }
                                sendMessage(new Message(new String(fileContent)));

                                break;
                            }
                        }
                    }
                    else
                    {
                        // Рассылка полученного сообщения всем клиентам
                        broadcastMessage(message);
                    }
                }
            }
            catch (IOException | ClassNotFoundException e)
            {
                // В случае ошибки, разрыв соединения
                removeConnection(this);
                System.out.println("Соединение с клиентом разорвано.");
            }
        }

        public void sendMessage(Message message)
        {
            try
            {
                outputStream.writeObject(message);
                outputStream.flush();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Класс для представления информации о загруженном файле
    private static class FileData
    {
        private final String fileName;
        private final String description;

        public FileData(String fileName, String description)
        {
            this.fileName = fileName;
            this.description = description;
        }

        public String getFileName()
        {
            return fileName;
        }

        public String getDescription()
        {
            return description;
        }
    }
    //Метод генерирует уникальное имя файла на основе текущего времени.
    private static String generateFileName()
    {
        return "file_" + System.currentTimeMillis();
    }
}