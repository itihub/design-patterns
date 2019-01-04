package com.xxx.design.pattern.structural.adapter.objectdapter;

/**
 * @Description: 对象适配器测试
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
