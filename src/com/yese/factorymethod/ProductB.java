package com.yese.factorymethod;

//具体产品B类
public class ProductB implements Product {
    @Override
    public void show() {
        System.out.println("生产出了产品B");
    }
}