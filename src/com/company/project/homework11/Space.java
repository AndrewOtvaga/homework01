package com.company.project.homework11;

public class Space
{
    public static void main(String[] args)
    {

    }
    private Planets planets;

    public Space(Planets planets)
    {
        this.planets = planets;
    }

    public Planets getPlanets()
    {
        return planets;
    }

    public void setPlanets(Planets planets)
    {
        this.planets = planets;
    }
}
