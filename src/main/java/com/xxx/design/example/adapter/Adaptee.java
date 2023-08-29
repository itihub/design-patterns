package com.xxx.design.example.adapter;

/**
 * 实际的接口方法与期待的不一样
 * 需要适配的类
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("特殊的请求!");
    }

}
