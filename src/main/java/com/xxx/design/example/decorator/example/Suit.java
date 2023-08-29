package com.xxx.design.example.decorator.example;

public class Suit extends Finery {

    @Override
    public void show() {
        System.out.println("西装");
        super.show();
    }
}
