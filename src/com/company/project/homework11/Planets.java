//Всегда теперь сверху буду прописывать задание, чтобы потом можно было глянуть, что делал, а не вспоминать :3
//Задание на enum
//Написать перечисление с планетами солнечной системы. Для каждой планеты необходимо задать название, массу и радиус.
package com.company.project.homework11;

public enum Planets
{
    MERCURY("Меркурий", 1231212314L, 23123123123L),
     VENERA("Венера", 1231212314L, 23123123123L),
     EARTH("Земля", 1231212314L, 23123123123L),
    MARS("Марс", 1231212314L, 23123123123L),
    JUPITER("Юпитер", 1231212314L, 23123123123L),
    SATURN("Сатурн", 1231212314L, 23123123123L),
    URAN("Уран", 1231212314L, 23123123123L),
    NEPTUN("Нептун", 1231212314L, 23123123123L),
    PLUTON("Плутон", 1231212314L, 23123123123L);

    private String name;
    private long radius;
    private long mass;

    Planets(String name, long radius, long mass)
    {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName()
    {
        return name;
    }

    public long getRadius()
    {
        return radius;
    }

    public long getMass()
    {
        return mass;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRadius(long radius)
    {
        this.radius = radius;
    }

    public void setMass(long mass)
    {
        this.mass = mass;
    }
}





