package com.xxx.design.principles.compositionaggregation;

/**
 * postgresql连接
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
