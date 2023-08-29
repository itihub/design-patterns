package com.xxx.design.example.bridge;

/**
 * Implementor的派生类
 */
public class ConcreteImplementorA extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A方法执行");
    }
}
