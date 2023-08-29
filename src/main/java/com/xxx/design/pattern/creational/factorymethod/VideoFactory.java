package com.xxx.design.pattern.creational.factorymethod;

/**
 * 抽象工厂（可以用抽象类实现也可以用接口实现） 只定义规范契约 实现有子类进行实现
 */
public abstract class VideoFactory {

    /**
     * 抽象工厂方法
     * 适用于：
     *  创建对象需要大量重复的代码
     *  客户端（应用层）不依赖于产品类实例如何被创建、实现的细节
     *  一个类通过其子类来指定创建哪个对象
     */
    public abstract Video getVideo();

}
