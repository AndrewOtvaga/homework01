package com.company.project.homework22;

public class Upper implements AppLogger
{
    private AppLogger logger;

    public Upper(AppLogger logger)
    {
        this.logger = logger;
    }

    @Override
    public void log(String message)
    {
        logger.log(message.toUpperCase());
    }
}