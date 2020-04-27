package com.xxx.design.pattern.creational.abstractfactory.factory;

import com.xxx.design.pattern.creational.abstractfactory.Article;
import com.xxx.design.pattern.creational.abstractfactory.CourseFactory;
import com.xxx.design.pattern.creational.abstractfactory.Video;
import com.xxx.design.pattern.creational.abstractfactory.course.PythonArticle;
import com.xxx.design.pattern.creational.abstractfactory.course.PythonVideo;

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
