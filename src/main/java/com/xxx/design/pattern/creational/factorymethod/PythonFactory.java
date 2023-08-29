package com.xxx.design.pattern.creational.factorymethod;

/**
 *
 */
public class PythonFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
