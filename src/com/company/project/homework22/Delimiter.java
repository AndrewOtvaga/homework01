package com.company.project.homework22;

public class Delimiter implements AppLogger
{
    private AppLogger logger;

    public Delimiter(AppLogger logger)
    {
        this.logger = logger;
    }

    @Override
    public void log(String message)
    {
        logger.log("[" + message + "]");
    }
}