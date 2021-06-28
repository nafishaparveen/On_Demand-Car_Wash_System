package com.javabrains.Customerservice.model;

public class CarDetails {

    private String CarManufacturer;
    private String CarModel;
    private String CarNumber;

    public CarDetails(String carManufacturer, String carModel, String carNumber) {
        CarManufacturer = carManufacturer;
        CarModel = carModel;
        CarNumber = carNumber;
    }

    public String getCarManufacturer() {
        return CarManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        CarManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }
}
