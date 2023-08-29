package com.xxx.design.pattern.creational.factorymethod;


/**
 * 子类
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }

}
