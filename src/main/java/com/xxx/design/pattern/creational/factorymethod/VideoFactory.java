package com.xxx.design.pattern.creational.factorymethod;

/**
 * @author kichi
 * @description: 抽象工厂（可以用抽象类实现也可以用接口实现） 只定义规范契约 实现有子类进行实现
 */
public abstract class VideoFactory {

    /**
     * 抽象工厂方法
     */
    public abstract Video getVideo();

}
