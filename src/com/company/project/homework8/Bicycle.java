package com.company.project.homework8;

public class Bicycle extends Vehicles
{
    private int numberOfWheels = 2;
    private String type = "Городской";

    public Bicycle(String number, int maxSpeed, int numberOfWheels) {
        super(number, maxSpeed);
        this.numberOfWheels = numberOfWheels;
    }

    public Bicycle(String number, int maxSpeed) {
        super(number, maxSpeed);
    }

    public Bicycle(String number, String type) {
        super(number);
        this.type = type;
    }

    public Bicycle(String number, int maxSpeed, int numberOfWheels, String type) {
        super(number, maxSpeed);
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getType() {
        return type;
    }
}
