package com.company.project.homework8;

//транспортное средство
public class Vehicles {
    protected String number;
    protected int damage;
    protected int maxSpeed = 120;

    public Vehicles(String number) {
        this.number = number;
    }

    public Vehicles(String number, int maxSpeed) {
        this.number = number;
        this.maxSpeed = maxSpeed;
    }

    public String getNumber() {
        return number;
    }

    public int getDamage() {
        return damage;
    }

    public void increaseWearLevel(int value) {
        if (value < 0) return;
        damage += value;
    }

    public void repair() {
        if (damage > 0) {
            damage--;
        }
    }

    public int setMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
