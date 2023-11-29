package com.company.project.homework22;

public class ConsoleWriter implements AppLogger
{
    @Override
    public void log(String message)
    {
        System.out.println(message);
    }
}