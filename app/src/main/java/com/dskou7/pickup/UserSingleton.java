package com.dskou7.pickup;

import java.util.ArrayList;

/**
 * Created by Donny on 3/25/2019.
 */

public class UserSingleton {

    private static UserSingleton instance;

    private String userID;
    private String password;
    private ArrayList<Listing> userListings;

    private UserSingleton(){
        userListings = new ArrayList<>();
    }

    public static UserSingleton Instance(){
        if(instance == null){
            instance = new UserSingleton();
        }
        return instance;
    }



    public void addListing(Listing newListing){
        userListings.add(newListing);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Listing> getUserListings() {
        return userListings;
    }

    public void setUserListings(ArrayList<Listing> userListings) {
        this.userListings = userListings;
    }
}