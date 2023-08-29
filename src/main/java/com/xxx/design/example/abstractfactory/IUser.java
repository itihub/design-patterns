package com.xxx.design.example.abstractfactory;

/**
 * 抽象数据库操作层
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
