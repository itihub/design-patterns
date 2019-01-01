package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 容器单例模式测试
 */
public class ContainerTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();

    }
}
