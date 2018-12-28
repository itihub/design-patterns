package com.xxx.design.principles.dependencyinversion;

/**
 * @Description: 依赖倒置设计原则测试
 * @Author: Jimmy
 */
public class Test {

        //v1 面向实现编程
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//    }

    /**v2 依赖倒置原则 面向接口编程 方法注入**/
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new FECourse());
//    }

    /**V3 依赖倒置原则 面向接口编程 构造器注入**/
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyCourse();
//    }

    /**V4 依赖倒置原则 面向接口编程 成员变量注入**/
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyCourse();
        geely.setiCourse(new PythonCourser());
        geely.studyCourse();
    }


}
