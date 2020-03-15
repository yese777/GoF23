package com.yese.factorymethod;

//工厂B类 - 生产B类产品
public class FactoryB implements Factory {
    @Override
    public Product make() {
        return new ProductB();
    }
}