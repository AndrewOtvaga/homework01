package coursework02;

import java.io.*;
import java.util.*;
// Класс главного меню
class MainMenu
{
    private Scanner scanner;
    private Map<String, Command> commands;
    private GameSession session;

    public MainMenu(Scanner scanner, GameSession session)
    {
        this.scanner = scanner;
        this.session = session;
        commands = new LinkedHashMap<>();
    }

    public void addCommand(String name, Command command)
    {
        commands.put(name, command);
    }

    public void show()
    {
        while (true)
        {
            System.out.println("\nГлавное меню:");
            for (String commandName : commands.keySet())
            {
                System.out.println(commandName);
            }
            System.out.print("Выберите опцию: ");
            String option = scanner.nextLine();
            Command command = commands.get(option);
            if (command != null)
            {
                command.execute();
            }
            else
            {
                System.out.println("Неизвестная команда, попробуйте снова.");
            }
            if (!session.isGameRunning())
            {
                break;
            }
        }
    }
}