package com.xxx.design.example.singleton;

/**
 * 单例模式(线程安全的)
 */
public class SingletonLock {

    private static SingletonLock instance;

    // 创建一个静态只读的辅助对象
    private static final Object syncRoot = new Object();

    // 私有构造器。避免外界利用new创建此类实例的可能
    private SingletonLock() {

    }


    /**
     * 此方法是获得本类实例的唯一全局访问点
     *
     * 与工具类提供静态方法的区别
     *      实用类仅提供一些静态方法或者静态属性不能保存状态，而单例是有状态的
     *      实用类不能继承多态，单例虽然实例唯一但是可以继承
     *      实用类是一些方法属性的集合，单例是唯一对象的实例
     */
    public static SingletonLock getInstance() {
        // Q:为什么不直接锁定instance对象而需要创建一个辅助对象实例来呢？
        // A:加锁时instance实例还没被创建
        // 缺点：每次调用getInstance()方法都有锁影响性能，锁粒度太大即使获取实例也需要被锁
        synchronized (syncRoot) {
            if (instance == null) {
                instance = new SingletonLock();
            }
            return instance;
        }
    }
}
