package com.xxx.design.pattern.creational.factorymethod;

/**
 * 子类
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }

}
