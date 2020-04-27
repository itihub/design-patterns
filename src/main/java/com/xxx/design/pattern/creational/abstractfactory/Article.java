package com.xxx.design.pattern.creational.abstractfactory;

/**
 * @author kichi
 * @descriptiond: 抽象产品等级
 */
public abstract class Article {

    public abstract void produce();

    /**
     * @author kichi
     * @description: 具体实现产品等级
     */
    public static class JavaVideo extends Video{

        @Override
        public void produce() {
            System.out.println("Java 视频");
        }
    }
}
