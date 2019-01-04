package com.xxx.design.pattern.structural.adapter.objectdapter;


/**
 * @Description: 目标接口直接实现
 * @Author: Jimmy
 */
public class ConcreteTarget implements Target {


    public void request() {
        System.out.println("ConcreteTarget 目标方法");
    }
}
