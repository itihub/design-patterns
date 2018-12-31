package com.xxx.design.pattern.creational.abstractfactory;

/**
 * @author kichi
 * @description: 抽象产品族实现
 */
public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticel() {
        return new JavaArticle();
    }
}
