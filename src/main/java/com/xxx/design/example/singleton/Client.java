package com.xxx.design.example.singleton;

/**
 * 单例模式
 */
public class Client {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("两个对象是相同的实例。");
        }
    }
}
