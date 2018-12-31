package com.xxx.design.pattern.creational.abstractfactory;

/**
 * @author kichi
 * @description: 抽象工厂测试类
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getArticel().produce();
        courseFactory.getVideo().produce();
    }
}
