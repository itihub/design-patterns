package com.xxx.design.pattern.structural.adapter.classadapter;

/**
 * @Description: 适配者 继承被适配者 实现目标接口 将被设配这间接实现目标接口
 * @Author: Jimmy
 */
public class Adapter extends Adaptee implements Target {


    public void request() {
        super.adapteeRequest();
    }
}
