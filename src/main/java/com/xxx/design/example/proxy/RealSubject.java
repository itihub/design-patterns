package com.xxx.design.example.proxy;

public class RealSubject extends Subject {

    @Override
    void request() {
        System.out.println("真实的请求");
    }

}
