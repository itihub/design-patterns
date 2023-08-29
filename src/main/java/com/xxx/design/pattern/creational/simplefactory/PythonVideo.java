package com.xxx.design.pattern.creational.simplefactory;


/**
 * 子类
 */
public class PythonVideo extends BaseVideo {
    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }
}
