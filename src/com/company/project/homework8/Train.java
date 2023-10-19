package com.company.project.homework8;

public class Train extends Vehicles
{
    private int vagons;
    private boolean climateControl;

    public Train(String number, int maxSpeed, int vagons, boolean climateControl)
    {
        super(number, maxSpeed);
        this.vagons = vagons;
        this.climateControl = climateControl;
    }

    public void changeClimateControl()
    {
        climateControl = !climateControl;
    }

    public boolean isClimateControl()
    {
        return climateControl;
    }

    public int getVagons()
    {
        return vagons;
    }
    @Override
    public void repair()
    {
        if(vagons < 7 && vagons > 0)
        {
            if(damage >= 2) damage -= 2;

            else
            {
                super.repair();
            }
        }
    }
}
