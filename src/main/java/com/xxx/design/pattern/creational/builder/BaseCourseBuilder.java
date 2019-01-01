package com.xxx.design.pattern.creational.builder;

/**
 * @author kichi
 * @description: 抽象类
 */
public abstract class BaseCourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course nakeCourse();
}
