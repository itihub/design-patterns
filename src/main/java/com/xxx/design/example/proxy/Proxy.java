package com.xxx.design.example.proxy;

public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
