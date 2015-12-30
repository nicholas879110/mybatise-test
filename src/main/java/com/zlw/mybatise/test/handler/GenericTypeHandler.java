package com.zlw.mybatise.test.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Title
 * @Package com.zlw.mybatise.test.handler
 * @Description:
 * @Author zlw
 * @Date 2015/12/23
 * @Version v1.0
 */
public class GenericTypeHandler<E extends MyObject> extends BaseTypeHandler<E> {
    private Class<E> type;

    public GenericTypeHandler(Class<E> type) {
        if (type == null) throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
