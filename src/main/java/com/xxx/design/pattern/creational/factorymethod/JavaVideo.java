package com.xxx.design.pattern.creational.factorymethod;

/**
 * @author kichi
 * @description: 子类
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }

}
