package com.xxx.design.principles.compositionaggregation;

/**
 * Created by geely
 */
public class ProductDao{

    /**
     * 获取连接
     */
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
