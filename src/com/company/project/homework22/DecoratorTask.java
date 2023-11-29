package com.company.project.homework22;

public class DecoratorTask
{
    public static void main(String[] args)
    {
        AppLogger logger01 = new Delimiter(new Upper(new ConsoleWriter()));
        logger01.log("сообщение");

        AppLogger logger02 = new Upper(new Delimiter(new AppFileWriter("file.txt")));
        logger02.log("сообщение");

        ConsoleWriter console = new ConsoleWriter();
        console.log("данные");

        AppFileWriter file = new AppFileWriter("file.txt");
        file.log("данные");
    }
}