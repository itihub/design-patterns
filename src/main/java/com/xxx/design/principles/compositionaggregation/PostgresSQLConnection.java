package com.xxx.design.principles.compositionaggregation;

/**
 * postgresql连接
 */
public class PostgresSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgresSQL数据库连接";
    }
}
