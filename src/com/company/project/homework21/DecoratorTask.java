package com.company.project.homework21;

public class DecoratorTask
{
    public static void main(String[] args)
    {
        // Цепочки декораторов для вывода сообщения в консоль с преобразованием в верхний регистр и добавлением разделителя
        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));
        logger01.log("сообщение");

        // Создание цепочки декораторов для записи сообщения в файл с преобразованием в верхний регистр и добавлением разделителя
        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter("file.txt")));
        logger02.log("сообщение");

        // Использование основного класса ConsoleWriter для вывода данных в консоль
        ConsoleWriter console = new ConsoleWriter();
        console.log("данные"); // данные будут выведены в консоль

        // Использование основного класса AppFileWriter для записи данных в файл
        AppFileWriter file = new AppFileWriter("file.txt");
        file.log("данные"); // данные будут записаны в файл
    }
}