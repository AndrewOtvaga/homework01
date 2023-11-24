package com.company.project.homework21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// Конкретный класс, реализующий запись в файл
class AppFileWriter implements AppLogger
{
    private String fileName;

    public AppFileWriter(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void log(String mesage)
    {
        try
        {
            Files.writeString(Paths.get(fileName), mesage, StandardOpenOption.APPEND);
        }
        catch (IOException e)
        {
            System.out.println("Данные не были записаны");
        }
    }
}