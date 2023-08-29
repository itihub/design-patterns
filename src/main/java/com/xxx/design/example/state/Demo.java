package com.xxx.design.example.state;

public class Demo {

    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();

    }
}
