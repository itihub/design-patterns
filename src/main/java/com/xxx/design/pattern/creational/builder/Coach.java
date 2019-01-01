package com.xxx.design.pattern.creational.builder;

/**
 * @author kichi
 * @description: 中间类（非必需）
 */
public class Coach {

    //具体实现类
    private BaseCourseBuilder courseBuilder;

    public void setCourseBuilder(BaseCourseBuilder builder){
        this.courseBuilder = builder;
    }

    public Course makeCourse(String courseName, String coursePPT
                            , String courseVideo, String courseArticle
                            , String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.nakeCourse();
    }
}
