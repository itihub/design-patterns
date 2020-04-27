package com.xxx.design.pattern.creational.builder.v1;

/**
 * @author kichi
 * @description: 建造者模式测试类
 */
public class Test {

    public static void main(String[] args) {

        //new一个子类的实现
        BaseCourseBuilder builder = new CourseActualBuilder();

        Coach coach = new Coach();
        coach.setCourseBuilder(builder);

        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT"
                , "Java设计模式视频", "Java设计模式手记"
                , "Java设计模式QA");

        System.out.println(course);
    }
}
