package com.yese.singleton;

// 懒汉式单例
public class SingletonDemo02 {

    // 1.私有构造函数
    private SingletonDemo02() {
    }

    // 2.类初始化的时候,不立即加载该对象
    private static SingletonDemo02 instance;

    // 3.对外提供获取该对象的方法,有synchronized关键字,效率较低
    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }
        return instance;
    }
}

class SingletonDemo02Test {
    public static void main(String[] args) {
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();
        System.out.println(instance1 == instance2);
    }
}