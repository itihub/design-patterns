package com.xxx.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 课程目录
 * @Author: Jimmy
 */
public class CourseCatalog extends CatalogComonent {

    private List<CatalogComonent> items = new ArrayList<CatalogComonent>();

    //目录名称
    private String name;

    //目录层级
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName(CatalogComonent catalogComonent) {
        return this.name;
    }

    @Override
    public void add(CatalogComonent catalogComonent) {
        items.add(catalogComonent);
    }

    @Override
    public void remove(CatalogComonent catalogComonent) {
        items.remove(catalogComonent);
    }

    @Override
    public void print() {
        System.out.println("目录名称：" + this.name);
        //遍历目录下的课程
        for (CatalogComonent item : items) {
            //判断目录层级
            if (this.level != null){

                for (int i = 0; i < this.level; i++){
                    //几次层级输出几次
                    System.out.print("  ");
                }
            }
            item.print();
        }
    }
}
