package com.mybatis.dao;

import com.mybatis.entity.User;

public interface UserDAO {

	int insert(User user);

	User findById(Long id);
}
