package com.company.project.homework7;

public class Cat
{
    private String name = "Cнежок";
    private int weight;
    private int numberOfWins;

    public Cat(int weight )
    {
        this.name = "Cнежок";
        this.weight = weight;
    }

    public Cat(String name, int weight)
    {
        setName(name);
        setWeight(weight);
    }

    public void setName(String name)
    {
        if (name != null && name.replace(" ", "").length() >= 3)
        {
            this.name = name;
        }
    }

    public void setWeight(int weight)
    {
        if (weight >= 1 && weight < 9)
        {
            this.weight = weight;
        }
    }

    public int getNumberOfWins()
    {
        return numberOfWins;
    }

    public boolean attack(Cat opponent)
    {
        if (opponent == null)
        {
            throw new IllegalArgumentException("Opponent cannot be null");
        }

        if (this.weight > opponent.weight)
        {
            this.numberOfWins++;
            return true;
        }
        else
        {
            opponent.numberOfWins++;
            return false;
        }
    }
}