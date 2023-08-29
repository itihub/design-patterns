package com.xxx.design.example.adapter;

/**
 * 适配器 将Adaptee适配为Target接口的形式
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 通过重写方法调用需要适配类的方法
        adaptee.specificRequest();
    }
}
