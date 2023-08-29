package com.xxx.design.example.bridge;

/**
 * 抽象
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    // 桥接调用
    public void operation() {
        implementor.operation();
    }


}
