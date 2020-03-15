package com.yese.singleton;

// 饿汉式单例
public class SingletonDemo01 {

    // 1.私有构造函数
    private SingletonDemo01() {
    }

    // 2.类初始化的时候,立即加载该对象
    private static SingletonDemo01 instance = new SingletonDemo01();

    // 3.对外提供获取该对象的方法
    public static SingletonDemo01 getInstance() {
        return instance;
    }
}

class SingletonDemo01Test{
    public static void main(String[] args) {
        SingletonDemo01 instance1 = SingletonDemo01.getInstance();
        SingletonDemo01 instance2 = SingletonDemo01.getInstance();
        System.out.println(instance1==instance2);
    }
}