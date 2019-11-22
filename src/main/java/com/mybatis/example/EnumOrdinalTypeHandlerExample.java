package com.mybatis.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.dao.UserDAO;
import com.mybatis.entity.User;
import com.mybatis.enums.SexEnum;
import com.mybatis.utils.MyBatisUtils;

public class EnumOrdinalTypeHandlerExample {

	public static void main(String[] args) {
		User user = new User();
		user.setSexEnum(SexEnum.FEMALE);
		user.setUserName("王博");
		user.setMobile(18888888888L);
		user.setBirthday("5月6日");
		user.setEmail("wxy18888888888@163.com");
		user.setRemark("test EnumOrdinalTypeHandler！！！");
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtils.openSession();
			sqlSession.commit(true);
			UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
			userDAO.insert(user);
			
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(user));
			
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(userDAO.findById(1L)));
		} catch (Exception e) {
			Logger.getLogger(EnumOrdinalTypeHandlerExample.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
