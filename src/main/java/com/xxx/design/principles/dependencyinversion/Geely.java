package com.xxx.design.principles.dependencyinversion;

/**
 * @Description: 这是依赖实现编程
 * @Author: Jimmy
 */
public class Geely {

    private ICourse iCourse;

    public Geely() {
    }

    //构造器注入
    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }

    //方法注入
    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

    /**这是依赖实现编程*/
    @Deprecated
    public void studyJavaCourse(){
        System.out.println("Geely study Java Course");
    }

    /**这是依赖实现编程*/
    @Deprecated
    public void studyFECourse(){
        System.out.println("Geely study FE Course");
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
