package com.xxx.design.pattern.creational.factorymethod;

/**
 * @author kichi
 * @description: TODO
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
