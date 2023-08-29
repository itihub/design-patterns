package com.xxx.design.example.meidator;

/**
 * 抽象中介类
 */
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);
}
