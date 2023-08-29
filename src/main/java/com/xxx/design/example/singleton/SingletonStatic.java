package com.xxx.design.example.singleton;

/**
 * 单例模式(饿汉模式 线程安全)
 * 类使用final声明 组织发生派生，而派生可能会增加实例
 */
public final class SingletonStatic {

    // static声明，在第一次引用类的任何成员时就会被创建实例
    // 这种静态初始化的方式是在自己被加载时就将自己实例化所以被称为饿汉式单例类
    // 原先的单例模式是在第一次被引用时，才会将自己实例化所以被称为懒汉式单例类
    private static final SingletonStatic instance = new SingletonStatic();

    // 私有构造器。避免外界利用new创建此类实例的可能
    private SingletonStatic() {

    }


    /**
     * 此方法是获得本类实例的唯一全局访问点
     */
    public static SingletonStatic getInstance() {
        return instance;
    }
}
