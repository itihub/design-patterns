package com.xxx.design.example.abstractfactory;

public class DataAccess {

    private static final String assemblyName = "";
    private static final String db = "sqlserver";

    /**
     * 简单工厂
     * 优点：切换数据源时客户端代码不需要更改
     * 缺点：扩展需要修改switch逻辑 (利用反射技术可以解决此问题)
     * @return
     */
    public static IUser createUser() {
        IUser result = null;
        switch (db){
            case "sqlserver":
                result = new SqlserverUser();
                break;
            case "access":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db){
            case "sqlserver":
                result = new SqlserverDepartment();
                break;
            case "access":
                result = new AccessDepartment();
                break;
        }
        return result;
    }
}
