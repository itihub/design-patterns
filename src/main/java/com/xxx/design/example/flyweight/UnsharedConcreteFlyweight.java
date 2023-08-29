package com.xxx.design.example.flyweight;

/**
 * 不需要共享的Flyweight子类。因为Flyweight接口共享称为可能，但是它不强制共享
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight：" + extrinsicState);
    }
}
