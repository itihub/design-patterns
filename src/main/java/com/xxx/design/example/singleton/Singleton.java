package com.xxx.design.example.singleton;

/**
 * 单例模式
 */
public class Singleton {

    private static Singleton singleton;

    // 私有构造器。避免外界利用new创建此类实例的可能
    private Singleton() {

    }


    /**
     * 此方法是获得本类实例的唯一全局访问点
     *
     * 与工具类提供静态方法的区别
     *      实用类仅提供一些静态方法或者静态属性不能保存状态，而单例是有状态的
     *      实用类不能继承多态，单例虽然实例唯一但是可以继承
     *      实用类是一些方法属性的集合，单例是唯一对象的实例
     */
    public static Singleton getInstance() {
        // 若实例不存在，则new一个新实例，否则返回已有实例
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
