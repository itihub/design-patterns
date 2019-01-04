package com.xxx.design.pattern.structural.adapter.objectdapter;

/**
 * @Description: 适配者 实现目标接口 ，组合被适配者为成员变量
 * @Author: Jimmy
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();

    }
}
