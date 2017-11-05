package com.example.grace.stationlocation;

/**
 * Created by Grace on 11/5/2017.
 */

public class User {
    // TODO: 11/5/2017 change address to an Adress object class
    private String address;
    private String name;
    private String id;
    private UserSupplies supplies;
    private String additionalComments;

    public User(String name, String address, String id, UserSupplies supplies, String additionalComments){
        this.address = address;
        this.name = name;
        this.id = id;
        this.supplies = supplies;
        this.additionalComments = additionalComments;
    }


//    public User(String homeAddress, String name, UserSupplies supplies, String id) {
//        address = Geocoder.getFromLocationName(homeAddress, 5);
//    }
}
