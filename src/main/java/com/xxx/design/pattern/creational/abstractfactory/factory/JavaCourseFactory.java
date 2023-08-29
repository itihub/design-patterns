package com.xxx.design.pattern.creational.abstractfactory.factory;

import com.xxx.design.pattern.creational.abstractfactory.Article;
import com.xxx.design.pattern.creational.abstractfactory.CourseFactory;
import com.xxx.design.pattern.creational.abstractfactory.Video;
import com.xxx.design.pattern.creational.abstractfactory.course.JavaArticle;
import com.xxx.design.pattern.creational.abstractfactory.course.JavaVideo;

/**
 * 抽象产品族实现
 */
public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticel() {
        return new JavaArticle();
    }
}
