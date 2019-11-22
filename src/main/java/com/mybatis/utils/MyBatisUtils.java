package com.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static final Class<MyBatisUtils> CLASS_LOCK = MyBatisUtils.class;
	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			String resource = "mybatis_config.xml";
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream(resource);
			} catch (IOException e) {
				Logger.getLogger(MyBatisUtils.class.getName()).log(Level.SEVERE, null, e);
			}
			
			synchronized (CLASS_LOCK) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		}

		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		if (sqlSessionFactory == null) {
			getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
}
