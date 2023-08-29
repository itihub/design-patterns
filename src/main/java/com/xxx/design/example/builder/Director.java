package com.xxx.design.example.builder;

/**
 * 指挥者类
 * 是构建一个使用Builder接口的对象
 */
public class Director {

    /**
     * 指挥建造过程
     * @param builder
     */
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
