package com.xxx.design.pattern.creational.factorymethod;

/**
 * @author kichi
 * @description: 工厂方法测试类
 * 工厂方法针对产品等级结构
 */
public class Test {

    public static void main(String[] args) {

        /** 静态方法使用，子类实现调用父类方法 **/
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        videoFactory = new PythonFactory();
        Video pythonVideo = videoFactory.getVideo();
        pythonVideo.produce();
    }
}
