package com.company.project.lessonexercise1516;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;// тут я подсматривал как с Object делать- ну синтаксический сахар эдакий - не использовано, но оставлю
import java.util.Set;

public class FruitsStorage
{
    private int numberOfSlots;//определяет максимальное количество фруктов в хранилище
    private List<Fruit> fruits;

    public FruitsStorage(int numberOfSlots)
    {
        this.numberOfSlots = numberOfSlots;
        this.fruits = new ArrayList<>();//коллекция фруктов
    }


    public boolean addToStorage(Fruit fruit)//метод добавляет фрукты в хранилище в соответствии с заданием
    {
        if (fruit == null)
        {
            return false; // Нельзя добавить null в хранилище
        }

        if (fruits.contains(fruit))
        {
            for (Fruit storedFruit : fruits)
            {
                if (storedFruit.equals(fruit))
                {
                    storedFruit.setCount(storedFruit.getCount() + fruit.getCount());
                    numberOfSlots -= fruit.getCount();
                    return true;
                }
            }
        }
        else
        {
            if (numberOfSlots >= fruit.getCount())
            {
                fruits.add(fruit);
                numberOfSlots -= fruit.getCount();
                return true;
            }
        }
        return false;
    }

    public int getNumberOfFruitsByType(Fruit.FruitType fruitType)//количество свободных слотов
    {
        int count = 0;
        for (Fruit fruit : fruits)
        {
            if (fruit.getType() == fruitType)
            {
                count += fruit.getCount();
            }
        }
        return count;
    }

    public int getNumberOfEmptySlots()
    {
        return numberOfSlots;
    }

    public void increasePrice(int value)//увеличивает цену всех фруктов на заданное кол-во процентов
    {
        if (value >= 10 && value < 30)
        {
            for (Fruit fruit : fruits)
            {
                double newPrice = fruit.getPrice() * (1 + (value / 100.0));
                fruit.setPrice(newPrice);
            }
        }
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice)//спиок тип цена
    {
        List<Fruit> result = new ArrayList<>();
        if (maxPrice > 0 && fruitType != null)
        {
            for (Fruit fruit : fruits)
            {
                if (fruit.getType() == fruitType && fruit.getPrice() <= maxPrice)
                {
                    result.add(fruit);
                }
            }
        }
        return result;
    }

    public Set<Fruit.FruitType> getFruitTypes()
    {
        Set<Fruit.FruitType> types = new HashSet<>();
        for (Fruit fruit : fruits)
        {
            types.add(fruit.getType());
        }
        return types;
    }

    public double getMinPriceByType(Fruit.FruitType fruitType)//минимальная цена фрукта с заданынм типом
    {
        double minPrice = Double.MAX_VALUE;
        for (Fruit fruit : fruits)
        {
            if (fruit.getType() == fruitType && fruit.getPrice() < minPrice)
            {
                minPrice = fruit.getPrice();
            }
        }
        return minPrice;
    }
}