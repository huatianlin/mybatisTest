package com.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Base64;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtils {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static final Class<SqlSessionUtils> CLASS_LOCK = SqlSessionUtils.class;
	private static final Base64.Decoder decoder = Base64.getDecoder();
//	private static final Base64.Encoder encoder = Base64.getEncoder();

	public static SqlSessionFactory initSqlSessionFactory() {
		if (sqlSessionFactory == null) {
			InputStream inputStream = null;
			Reader reader = null;
			Reader proReader = null;
			Properties properties = null;
			try {
				// 读入配置文件流
				inputStream = Resources.getResourceAsStream("mybatis_config.xml");
				reader = new InputStreamReader(inputStream);
				// 读入属性文件
				InputStream proInputStream = Resources.getResourceAsStream("jdbc.properties");
				proReader = new InputStreamReader(proInputStream);
				
				properties = new Properties();
				properties.load(proReader);
				
//				byte[] text = properties.getProperty("username").getBytes("UTF-8");
//				String word = encoder.encodeToString(text);
//				String username = new String(decoder.decode(word), "UTF-8");
				// 解密为明文
				String username = new String(decoder.decode(properties.getProperty("username")), "UTF-8");
				String password = new String(decoder.decode(properties.getProperty("password")), "UTF-8");
				properties.setProperty("password", password);
				properties.setProperty("username", username);
			} catch (IOException e) {
				Logger.getLogger(SqlSessionUtils.class.getName()).log(Level.SEVERE, null, e);
			}
			
			synchronized (CLASS_LOCK) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, properties);
			}
		}

		return sqlSessionFactory;
	}

	public static SqlSession openSession() {
		if (sqlSessionFactory == null) {
			initSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
}
