package com.xxx.design.pattern.creational.abstractfactory;

/**
 * @author kichi
 * @description: 抽象产品族实现
 */
public class PythonCourseFactory implements CourseFactory {


    public Video getVideo() {
        return new PythonVideo();
    }


    public Article getArticel() {
        return new PythonArticle();
    }
}
