package com.xxx.design.pattern.creational.singleton.container;

/**
 * @author kichi
 * @description: TODO
 */
public class ContainerT implements Runnable {

    public void run() {
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + instance);
    }
}
