package com.xxx.design.example.decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    void operation() {
        /**
         * 首先运行原Component的operation()方法
         * 再执行本类的功能 addedBehavior
         * 相当于对原Component进行了装饰
         */
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior() {

    }
}
