package com.mybatis.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.entity.Contract;

public class JdbcExample {
//	private static final Logger logger = LoggerFactory.getLogger(JdbcExample.class);

	private Connection getConnction() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://192.168.201.120:3306/erp_purchase?zeroDateTimeBeHavior=convertToNull";
			String user = "xuduo";
			String passwor = "000000";
			connection = DriverManager.getConnection(url, user, passwor);
		} catch (Exception e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return connection;
	}
	
	private void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		}
		try {
			if (ps != null && !ps.isClosed()) {
				ps.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		}
		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
	public Contract getContract(Long id) {
		Connection connection = getConnction();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement("select * from purchase_contract where id = ?");
			ps.setLong(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				Contract contract = new Contract();
				contract.setId(rs.getLong("id"));
				contract.setCode(rs.getString("code"));
				contract.setBusinessCode(rs.getString("business_code"));
				
				return contract;
			}
		} catch (Exception e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			this.close(connection, ps, rs);
		}
		return null;
	}
	
	public static void main(String[] args) {
		JdbcExample jdbcExample = new JdbcExample();
		Contract contract = jdbcExample.getContract(21617L);
		System.err.println(JSONObject.toJSONString(contract));
	}
}
