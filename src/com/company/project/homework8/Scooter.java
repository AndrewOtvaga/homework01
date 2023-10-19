package com.company.project.homework8;

public class Scooter extends Bicycle implements Colour {
    protected int numberOfWheels = 2;
    protected String type = "Городской";

    protected boolean isElectric;

    public Scooter(String number, int maxSpeed, int numberOfWheels, String type, boolean isElectric) {
        super(number, maxSpeed, numberOfWheels, type);
        this.isElectric = isElectric;
    }

    public void repair() {
        if (isElectric) {
            damage = -2;
        } else {
            damage = -3;
            super.repair();
        }

    }

    public void changeColour(String colour) {

    }

    public void defaultColour() {

    }
}
