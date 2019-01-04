package com.xxx.design.pattern.structural.composite;

/**
 * @Description: 课程
 * @Author: Jimmy
 */
public class Course extends CatalogComonent {

    //名称
    private String name;

    //价格
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComonent catalogComonent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComonent catalogComonent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
