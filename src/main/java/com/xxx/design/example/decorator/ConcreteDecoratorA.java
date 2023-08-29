package com.xxx.design.example.decorator;

public class ConcreteDecoratorA extends Decorator {

    // 本类特有的特征
    private String addedState;

    @Override
    void operation() {
        /**
         * 首先运行原Component的operation()方法
         * 再执行本类的功能
         * 相当于对原Component进行了装饰
         */
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
