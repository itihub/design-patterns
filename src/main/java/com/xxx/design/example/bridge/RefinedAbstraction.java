package com.xxx.design.example.bridge;

/**
 * 被提炼的抽象
 */
public class RefinedAbstraction extends Abstraction {

    public void operation() {
        implementor.operation();
    }

    
}
