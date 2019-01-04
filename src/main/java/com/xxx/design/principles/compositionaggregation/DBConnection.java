package com.xxx.design.principles.compositionaggregation;

/**
 * 数据了连接抽象类
 */
public abstract class DBConnection {
    /**
     * 获取连接
     * @return
     */
    public abstract String getConnection();

}
