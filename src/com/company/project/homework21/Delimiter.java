package com.company.project.homework21;

// Декоратор, добавляющий функциональность добавления разделителя к сообщению
class Delimiter implements AppLogger
{
    private AppLogger logger;

    public Delimiter(AppLogger logger)
    {
        this.logger = logger;
    }

    @Override
    public void log(String mesage)
    {
        logger.log("===" + mesage + "===");
    }
}