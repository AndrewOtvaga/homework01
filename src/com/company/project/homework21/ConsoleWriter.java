package com.company.project.homework21;

// Конкретный класс, реализующий вывод в консоль
class ConsoleWriter implements AppLogger
{
    @Override
    public void log(String mesage)
    {
        System.out.println(mesage);
    }
}