package com.xxx.design.example.flyweight;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体Flyweight：" + extrinsicState);
    }
}
