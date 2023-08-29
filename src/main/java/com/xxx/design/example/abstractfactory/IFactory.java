package com.xxx.design.example.abstractfactory;

/**
 * 抽象工厂接口
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
