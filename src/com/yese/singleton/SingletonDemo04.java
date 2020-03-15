package com.yese.singleton;

import java.lang.reflect.Constructor;

// 静态内部类
public class SingletonDemo04 {

    private SingletonDemo04() {
    }

    private static class InnerClass {
        private static final SingletonDemo04 instance = new SingletonDemo04();
    }

    public static SingletonDemo04 getInstance() {
        return InnerClass.instance;
    }
}

// 如果使用反射机制创建对象,还是会破坏单例
class SingletonDemo04Test {
    public static void main(String[] args) throws Exception {
        SingletonDemo04 instance1 = SingletonDemo04.getInstance();

        Constructor<SingletonDemo04> declaredConstructor = SingletonDemo04.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        SingletonDemo04 instance2 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}