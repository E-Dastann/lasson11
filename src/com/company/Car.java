package com.company;

public class Car {
    private String honda;
    private  String characteristic ;
    private EnumColor enumColor;

    public Car(String honda, String characteristic, EnumColor enumColor) {
        this.honda = honda;
        this.characteristic = characteristic;
        this.enumColor = enumColor;
    }

    public String getHonda() {
        return honda;
    }

    public String getCharacteristic() {
        return characteristic;
    }
    public String getInfo(){
        return honda + " " + characteristic+" "+enumColor ;
    }
}
