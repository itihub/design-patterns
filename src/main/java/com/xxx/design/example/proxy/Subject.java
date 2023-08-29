package com.xxx.design.example.proxy;

/**
 * Subject定义了RealSubject个Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy
 */
public abstract class Subject {

    abstract void request();

}
