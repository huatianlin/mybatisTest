package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.Role;

public interface RoleDAO {

	int insert(Role role);
	
	Role findById(Long id);
	
	Role findByUserId(Long userId);
	
	List<Role> queryByName(String name);
}
