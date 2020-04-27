package com.xxx.design.pattern.creational.singleton.container;

/**
 * @author kichi
 * @description: 容器单例模式测试
 */
public class ContainerTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ContainerT());
        Thread t2 = new Thread(new ContainerT());
        t1.start();
        t2.start();

        /**
         * 测试结果
         *  向容器放入两个Key相同的实例，只有一个会被存放到容器中，多次获取这个key的实例，实例地址也是相同的
         */

    }
}
