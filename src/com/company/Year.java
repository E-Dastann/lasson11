package com.company;

public class Year  extends Model {
    private int YearCar;
    private int mileage;


    public Year(String honda, String characteristic, EnumColor enumColor, String civicName, String factoryName, int yearCar, int mileage) {
        super(honda, characteristic, enumColor, civicName, factoryName);
        YearCar = yearCar;
        this.mileage = mileage;
    }

    public int getYearCar() {
        return YearCar;
    }

    public int getMileage() {
        return mileage;
    }



}
