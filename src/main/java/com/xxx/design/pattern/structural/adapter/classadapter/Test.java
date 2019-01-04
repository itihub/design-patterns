package com.xxx.design.pattern.structural.adapter.classadapter;

/**
 * @Description: 类适配器
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {

        //直接实现
        Target target = new ConcreteTarget();
        target.request();

        //间接实现 适配器
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
