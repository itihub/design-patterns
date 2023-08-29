package com.xxx.design.example.decorator;

public class Demo {

    public static void main(String[] args) {

        // 实例化对象
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        // 使用d1包装c
        d1.setComponent(c);
        // 使用d2包装d1
        d2.setComponent(d1);
        // 执行d2 operation()
        d2.operation();

    }
}
