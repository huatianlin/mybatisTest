package com.mybatis.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.dao.RoleDAO;
import com.mybatis.dao.UserDAO;
import com.mybatis.entity.Role;
import com.mybatis.entity.User;
import com.mybatis.utils.MyBatisUtils;

/**
 * 级联test
 * @author Administrator
 *
 */
public class JiLianExample {

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		try {
			// 用户与角色一对一；用户与合同一对多
			sqlSession = MyBatisUtils.openSession();
			UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
//			RoleDAO roleDAO = sqlSession.getMapper(RoleDAO.class);
			
			User user = userDAO.findById(1L);
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(user));
//			Role role = roleDAO.findById(1L);
//			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(role));
		} catch (Exception e) {
			Logger.getLogger(EnumOrdinalTypeHandlerExample.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	}
}
