package com.xxx.design.pattern.structural.composite;

/**
 * @Description: 组合模式抽象类（课程跟目录组合）
 * @Author: Jimmy
 */
public abstract class CatalogComonent {

    public void add(CatalogComonent catalogComonent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComonent catalogComonent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComonent catalogComonent){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public double getPrice(CatalogComonent catalogComonent){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
