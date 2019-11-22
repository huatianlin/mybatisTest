package com.mybatis.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSONObject;
import com.mybatis.dao.UserDAO;
import com.mybatis.entity.User;
import com.mybatis.utils.MyBatisUtils;

/**
 * 缓存example
 * @author Administrator
 *
 */
public class CacheExample {
	private static final Logger logger = Logger.getLogger(CacheExample.class.getName());

	public static void main(String[] args) {
		SqlSession sqlSession = null;
		SqlSession sqlSession2 = null;
		try {
			sqlSession = MyBatisUtils.openSession();
			UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
			
			User user = userDAO.findById(1L);
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(user));
			logger.info("使用同一个sqlSession再执行一次！");
			User user1 = userDAO.findById(1L);
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(user1));
			sqlSession.commit();
			logger.info("现在创建一个新的sqlSession！");
			sqlSession2 = MyBatisUtils.openSession();
			UserDAO userDAO2 = sqlSession2.getMapper(UserDAO.class);
			logger.info("用新的sqlSession再执行一次！");
			User user2 = userDAO2.findById(1L);
			Logger.getLogger(JdbcExample.class.getName()).log(Level.INFO, JSONObject.toJSONString(user2));
			sqlSession2.commit();
		} catch (Exception e) {
			Logger.getLogger(EnumOrdinalTypeHandlerExample.class.getName()).log(Level.SEVERE, null, e);
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
			if (sqlSession2 != null) {
				sqlSession2.close();
			}
		}
	}
}
