package com.xxx.design.pattern.creational.abstractfactory.course;

import com.xxx.design.pattern.creational.abstractfactory.Video;

/**
 *
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("Python 视频");
    }
}
