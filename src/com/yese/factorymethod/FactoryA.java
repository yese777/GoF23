package com.yese.factorymethod;

//工厂A类 - 生产A类产品
public class FactoryA implements Factory {
    @Override
    public Product make() {
        return new ProductA();
    }
}