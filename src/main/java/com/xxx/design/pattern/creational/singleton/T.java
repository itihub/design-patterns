package com.xxx.design.pattern.creational.singleton;

import com.xxx.design.pattern.creational.singleton.StaticInnerClassSingleton;

/**
 * @author kichi
 * @description: 线程类
 */
public class T implements Runnable {

    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + instance);

    }
}
