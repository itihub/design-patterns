package com.xxx.design.pattern.creational.simplefactory;

/**
 * 简单工厂测试
 */
public class SimpleFactoryDemo {


    public static void main(String[] args) {
        BaseVideo video = null;
        VideoFactory factory = new VideoFactory();

        /** 方式一 不符合开闭原则 **/
//        video = factory.getVideo("java");
//        if (video == null){
//            return;
//        }
//        video.produce();

        /** 方式二 符合开闭原则 **/
        video = factory.getVideo2(JavaVideo.class);
        video.produce();
    }
}
