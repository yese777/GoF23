package com.yese.factorymethod;

//生产工作流程
public class FactoryPattern {
    public static void main(String[] args) {

        //客户要产品A
        Product productA = new FactoryA().make();
        productA.show();

        //客户要产品B
        Product productB = new FactoryB().make();
        productB.show();
    }
}