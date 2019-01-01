package com.xxx.design.pattern.creational.singleton;

/**
 * @author kichi
 * @description: 线程类
 */
public class T implements Runnable {

    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);

    }
}
