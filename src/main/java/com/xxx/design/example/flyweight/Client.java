package com.xxx.design.example.flyweight;

public class Client {

    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicState);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--extrinsicState);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);
    }
}
