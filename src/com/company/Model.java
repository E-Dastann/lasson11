package com.company;

public class Model  extends Car {
    private String civicName;
    private String factoryName;

    public Model(String honda, String characteristic, EnumColor enumColor, String civicName, String factoryName) {
        super(honda, characteristic, enumColor);
        this.civicName = civicName;
        this.factoryName = factoryName;
    }

    public String getCivicName() {
        return civicName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public String getInfo1(){
        return civicName+" "+factoryName;

    }
}