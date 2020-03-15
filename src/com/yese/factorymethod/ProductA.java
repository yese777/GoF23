package com.yese.factorymethod;

//具体产品A类
public class ProductA implements Product {
    @Override
    public void show() {
        System.out.println("生产出了产品A");
    }
}