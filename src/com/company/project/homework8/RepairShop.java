package com.company.project.homework8;

public class RepairShop
{
    private Vehicles[] vehicles;
    private String[] colours = {"красный", "жёлтый", "оранжевый", "чёрный"};

    public void addVehicle(Vehicles vehicle)

    {
        // Проверяем, пустой ли массив vehicles, и если да, создаю новый массив размером 1
        if (vehicles == null)
        {
            vehicles = new Vehicles[1];
            vehicles[0] = vehicle;
        }
        else
        {
            // Создаю новый массив размером vehicles.length + 1
            Vehicles[] newVehicles = new Vehicles[vehicles.length + 1];

            // Копирую существующие vehicles в новый массив
            for (int i = 0; i < vehicles.length; i++)
            {
                newVehicles[i] = vehicles[i];
            }

            // Добавляю новое vehicles в последний индекс нового массива
            newVehicles[newVehicles.length - 1] = vehicle;

            // Обновляем ссылку на массив vehicles на новый массив
            vehicles = newVehicles;
        }
    }

    public void repairAll()
    {
        for (Vehicles vehicle : vehicles)
        {
            vehicle.repair();
            //vehicle.colours(getRandomColor()); <-тупняк
            if (vehicle instanceof Colour c1)
            {
                c1.changeColour(getRandomColor());
            }
            vehicle = null;
        }
    }

    private String getRandomColor()
    {
        int randomIndex = (int) (Math.random() * colours.length);
        return colours[randomIndex];
    }


}
