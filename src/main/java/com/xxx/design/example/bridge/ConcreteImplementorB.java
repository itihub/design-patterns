package com.xxx.design.example.bridge;

/**
 * Implementor的派生类
 */
public class ConcreteImplementorB extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现B方法执行");
    }
}
