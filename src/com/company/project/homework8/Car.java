package com.company.project.homework8;

public class Car extends Vehicles implements Colour

{
    private String colour = "Белый";
    private int maxSpeed = 240;

    public Car(String number, int maxSpeed, String colour)
    {
        super(number, maxSpeed);
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }
    public void changeColour(String newColour)
    {
        colour = newColour;
    }

    public void repair()
    {
        if (damage >= 2) damage -= 2;
        else
        {
            super.repair();
        }
    }

    public void defaultColour()
    {

    }
}
