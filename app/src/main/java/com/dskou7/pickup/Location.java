package com.dskou7.pickup;

/**
 * Created by Donny on 3/25/2019.
 */


public class Location {
/* {
      "latitude": "82.5000",
      "longitude": "-61.6667",
      "city": "Alert",
      "country": "Canada"
    },*/

    @Override
    public String toString() {
        return "Location [latitude=" + latitude + ", longitude=" + longitude + ", city=" + city + ", country=" + country
                + "]";
    }

    double latitude;
    double longitude;
    String city;
    String country;

    public Location(){}

    public Location(double latitude, double longitude, String city, String country) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.country = country;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
