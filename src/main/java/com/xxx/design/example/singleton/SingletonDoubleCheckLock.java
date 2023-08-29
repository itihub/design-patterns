package com.xxx.design.example.singleton;

/**
 * 单例模式(线程安全的)
 * 双重锁定
 */
public class SingletonDoubleCheckLock {

    private static SingletonDoubleCheckLock instance;

    // 创建一个静态只读的辅助对象
    private static final Object syncRoot = new Object();

    // 私有构造器。避免外界利用new创建此类实例的可能
    private SingletonDoubleCheckLock() {

    }


    /**
     * 此方法是获得本类实例的唯一全局访问点
     *
     * 与工具类提供静态方法的区别
     *      实用类仅提供一些静态方法或者静态属性不能保存状态，而单例是有状态的
     *      实用类不能继承多态，单例虽然实例唯一但是可以继承
     *      实用类是一些方法属性的集合，单例是唯一对象的实例
     */
    public static SingletonDoubleCheckLock getInstance() {
        // 先判断实例是否存在，存在直接返回
        if (instance == null) {
            // 不存在加锁处理
            synchronized (syncRoot) {
                // Q:为什么锁里面还需要再判断一次实例是否存在？
                // A:当多线程环境下实例未被创建时，此时多个线程都通过了第一次判断后进入锁代码块，
                // 由于锁的存在只有一个线程可以进入并出来后 其他线程才能进入
                // 由于第一个进入的线程已将实例初始化好了，如果没有再次判断后续线程(指和第一个线程同时通过第一次判断的线程)进入后会再次实例化没有达到单例的目的
                if (instance == null) {
                    instance = new SingletonDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
