package com.xxx.design.example.abstractfactory;

/**
 * 抽象数据库操作层
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
