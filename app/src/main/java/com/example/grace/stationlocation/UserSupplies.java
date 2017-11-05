package com.example.grace.stationlocation;

/**
 * Created by Grace on 11/5/2017.
 */

public class UserSupplies {

    private boolean food;
    private boolean water;
    private boolean shelter;
    private boolean electricity;

    public UserSupplies(boolean food, boolean water, boolean shelter, boolean electricity){
        this.food = food;
        this.water = water;
        this.electricity = electricity;
    }
}
