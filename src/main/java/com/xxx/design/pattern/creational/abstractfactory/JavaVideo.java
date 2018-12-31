package com.xxx.design.pattern.creational.abstractfactory;

/**
 * @author kichi
 * @description: 具体实现产品等级
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("Java 视频");
    }
}
