package com.company.project.homework22;

import java.io.IOException;
import java.nio.file.*;

public class AppFileWriter implements AppLogger
{
    private String fileName;

    public AppFileWriter(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void log(String message)
    {
        try
        {
            Files.writeString(Paths.get(fileName), message, StandardOpenOption.APPEND);
        }
        catch (IOException e)
        {
            System.out.println("Данные не были записаны");
        }
    }
}