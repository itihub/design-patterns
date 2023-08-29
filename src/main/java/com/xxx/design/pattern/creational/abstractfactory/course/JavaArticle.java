package com.xxx.design.pattern.creational.abstractfactory.course;

import com.xxx.design.pattern.creational.abstractfactory.Article;

/**
 * 抽象产品等级实现
 */
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("Java 手记");
    }
}
