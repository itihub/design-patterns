package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 懒汉式单例测试
 */
public class SingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("主线程结束");

    }
}
