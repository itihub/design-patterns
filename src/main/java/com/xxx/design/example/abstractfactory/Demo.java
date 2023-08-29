package com.xxx.design.example.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        IFactory factory = new SqlserverFactory(); // 切换Access数据库 只需改具体实例即可 缺点切换数据源需要修改客户端代码

        IUser iu = factory.createUser();
        iu.insert(new User());
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(new Department());
        id.getDepartment(1);

        // 使用简单工厂创建， 切换数据源也无需修改客户端代码
        iu = DataAccess.createUser();
        id = DataAccess.createDepartment();
    }
}
