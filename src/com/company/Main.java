package com.company;

public class Main {

    public static void main(String[] args) {
Car car = new Car("honda","veryGood",EnumColor.BROWN);
Car car1 =new Car("lexus ","notBad",EnumColor.RED);

Model model=new Model("Honda","notBad",EnumColor.YELLOW,"HondaCivik","Germany");

        System.out.println(car.getInfo());
        System.out.println(car1.getInfo());
        System.out.println( model.getInfo1());


    }
}
