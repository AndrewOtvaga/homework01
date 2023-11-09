package com.company.project.lessonexercise1516;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Fruit
{
    private final FruitType type;
    private double price;
    private int count;

    public Fruit(FruitType type, double price, int count)
    {
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public FruitType getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }

    public int getCount()
    {
        return count;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Fruit fruit)) return false;
        return Double.compare(getPrice(), fruit.getPrice()) == 0 && getCount() == fruit.getCount() && getType() == fruit.getType();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getType(), getPrice(), getCount());
    }

    @Override
    public String toString()
    {
        return "Fruit{" +
                "type=" + type +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public enum FruitType
    {
        APPLE, PEAR, BANANA, APRICOT;
    }
}
