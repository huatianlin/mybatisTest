package com.mybatis.example;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.dao.ContractDAO;
import com.mybatis.entity.Contract;
import com.mybatis.utils.MyBatisUtils;

public class MyBatisExample {

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.openSession();
//			sqlSession = SqlSessionUtils.openSession();
			ContractDAO contractDAO = sqlSession.getMapper(ContractDAO.class);
			Contract contract = contractDAO.getById(1L);
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(contract));
			
			List<Contract> contracts = contractDAO.queryByCode("GY181225YF000007-046");
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(contracts));
		} catch (Exception e) {
			Logger.getLogger(JdbcExample.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
