package com.yese.simplefactory;

public class Test {
    public static void main(String[] args) {
        Car carA = CarFactory.getCar("CarA");
        carA.name();

        Car carB = CarFactory.getCar("CarB");
        carB.name();
    }
}