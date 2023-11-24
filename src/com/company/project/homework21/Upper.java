package com.company.project.homework21;

// преобразование текста в верхний регистр
class Upper implements AppLogger
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