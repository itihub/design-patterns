package com.xxx.design.example.adapter;

/**
 * 客户端使用适配器调
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();

    }
}
