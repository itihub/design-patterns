package com.xxx.design.example.flyweight;

import java.util.Hashtable;
import java.util.Map;

/**
 * 享元工厂，用来创建和管理Flyweight对象。
 * 它主要是确保合理地共享Flyweight，当用户请求一个Flyweight时，FlyweightFactory对象提供一个已创建的实例或者创建一个
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
