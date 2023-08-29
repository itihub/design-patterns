package com.xxx.design.example.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 * 由多个部件组成
 */
public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println(parts.toString());
    }
}
