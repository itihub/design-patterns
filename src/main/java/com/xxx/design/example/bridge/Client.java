package com.xxx.design.example.bridge;

/**
 * 桥接模式
 * 将抽象部分与它的实现部分分离
 * 实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合
 */
public class Client {

    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();

        // 设置具体实现
        ab.setImplementor(new ConcreteImplementorA());
        // 桥接调用，通过调用Abstraction类中operation方法来间接的调用ConcreteImplementorA类的operation方法
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
