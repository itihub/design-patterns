package com.xxx.design.pattern.creational.builder.v2;

/**
 * @author kichi
 * @description: 建造者演进版本 可以按需调用 链式调用
 *
 * StringBuild使用的也是此中建造者模式
 */
public class Test {


    public static void main(String[] args) {

        Course course = new Course.CourseBuilder().builderCourseName("Java设计模式")
                .builderCoursePPT("Java设计模式PPT")
                .builderCourseVideo("Java设计模式Video")
                .builderCourseArticle("Java设计模式手记")
                .build();

        System.out.println(course);

    }
}
