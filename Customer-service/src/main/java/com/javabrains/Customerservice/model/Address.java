package com.javabrains.Customerservice.model;

public class Address {

    private String country;
    private String state;
    private String city;
    private String district;
    private int zipcode;

    public Address(String country, String state, String city, String district, int zipcode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
