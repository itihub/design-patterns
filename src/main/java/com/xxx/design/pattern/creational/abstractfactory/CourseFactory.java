package com.xxx.design.pattern.creational.abstractfactory;


/**
 * 产品族抽象接口（可以使用抽象类实现）
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticel();

}
