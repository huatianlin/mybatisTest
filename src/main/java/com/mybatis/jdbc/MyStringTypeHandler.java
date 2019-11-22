package com.mybatis.jdbc;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.apache.log4j.Logger;

@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String> {
	private static final Logger logger = Logger.getLogger(MyStringTypeHandler.class);

	public String getResult(ResultSet rs, String arg1) throws SQLException {
		logger.info("使用我的TypeHandler，ResultSet 列名【"+arg1+"】获取字符串！");
		return rs.getString(arg1);
	}

	public String getResult(ResultSet rs, int arg1) throws SQLException {
		logger.info("使用我的TypeHandler，ResultSet 下标获取字符串！");
		return rs.getString(arg1);
	}

	public String getResult(CallableStatement cs, int arg1) throws SQLException {
		logger.info("使用我的TypeHandler，CallableStatement 下标获取字符串！");
		return cs.getString(arg1);
	}

	public void setParameter(PreparedStatement ps, int arg1, String arg2, JdbcType arg3) throws SQLException {
		logger.info("使用我的TypeHandler");
		ps.setString(arg1, arg2);
	}
}
