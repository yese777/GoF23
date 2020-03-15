package com.yese.simplefactory;

public class CarFactory {
    public static Car getCar(String car) {
        if ("CarA".equals(car)) {
            return new CarA();
        } else if ("CarB".equals(car)) {
            return new CarB();
        } else {
            return null;
        }

    }
}