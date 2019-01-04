package com.xxx.design.pattern.structural.composite;

/**
 * @Description: 组合模式测试类
 * @Author: Jimmy
 */
public class Test {

    public static void main(String[] args) {

        //构建课程
        CatalogComonent linuxCourse = new Course("Linux课程", 11);
        CatalogComonent windowsCourse = new Course("Windows课程", 11);

        //构建目录层级并向目录添加课程
        CatalogComonent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);
        javaCourseCatalog.add(new Course("Spring Boot",  23));
        javaCourseCatalog.add(new Course("Spring Cloud",  53));
        javaCourseCatalog.add(new Course("Java设计模式",  33));

        //构建父级目录聚合子目录
        CatalogComonent mainCourseCatalog = new CourseCatalog("主目录", 1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();

    }
}
