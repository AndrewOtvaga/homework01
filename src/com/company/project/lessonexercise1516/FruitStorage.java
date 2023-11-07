package com.company.project.lessonexercise1516;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage
{
    private int numberOfSlots;
    private List<Fruit>fruits;


    public FruitStorage(int numberOfSlots)
    {
        this.numberOfSlots = numberOfSlots;
        this.fruits = new ArrayList<>();
    }
    public boolean addToStorage(Fruit fruit) {
        if (fruit == null) {
            return false; // Нельзя добавить null в хранилище
        }

        if (fruits.size() >= numberOfSlots) {
            return false; // Нельзя добавить больше фруктов, чем numberOfSlots
        }

        for (Fruit storedFruit : fruits) {
            if (storedFruit.equals(fruit)) {
                storedFruit.setCount(storedFruit.getCount() + fruit.getCount()); // Увеличиваем значение свойства count фрукта в коллекции
                return true;
            }
        }

        if (fruits.size() + fruit.getCount() > numberOfSlots) {
            return false; // Нельзя добавить фрукты, превышающие numberOfSlots
        }

        return fruits.add(fruit); // Добавляем fruit в коллекцию
    }
}


