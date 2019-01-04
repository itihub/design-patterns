package com.xxx.design.principles.compositionaggregation;

/**
 * 合成复用原则 测试
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
