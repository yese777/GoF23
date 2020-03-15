package com.yese.singleton;

// DCL懒汉式(双重检查)
public class SingletonDemo03 {

    // 1.私有构造函数
    private SingletonDemo03() {
    }

    // 2.类初始化的时候,不立即加载该对象.volatile保证 instance 在所有线程中同步
    private volatile static SingletonDemo03 instance;

    // 3.对外提供获取该对象的方法
    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo03.class) {
                if (instance == null) {
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }
}

class SingletonDemo03Test {
    public static void main(String[] args) {
        SingletonDemo03 instance1 = SingletonDemo03.getInstance();
        SingletonDemo03 instance2 = SingletonDemo03.getInstance();
        System.out.println(instance1 == instance2);
    }
}