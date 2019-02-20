package com.lzx.element;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//@MappedTypes(Integer.class)
//@MappedJdbcTypes(jdbcType.VARCHAR)
public class MyTypeHandler implements TypeHandler<Integer> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Integer integer, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public Integer getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public Integer getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Integer getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
    // ...重写方法

}
