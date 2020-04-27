package com.xxx.design.pattern.creational.abstractfactory.course;

import com.xxx.design.pattern.creational.abstractfactory.Article;

/**
 * @author kichi
 * @description: TODO
 */
public class PythonArticle extends Article {


    @Override
    public void produce() {
        System.out.println("Python 手记");
    }
}
