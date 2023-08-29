package com.xxx.design.example.builder;

/**
 * 建造者模式
 * 将复杂对象的构建与它的表面分离，使用同样的构建过程可以创建不同的表示
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder b1 = new ConcreteBuilder();

        director.construct(b1);
        Product product = b1.getResult();
        product.show();
    }
}
