package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.Contract;

public interface ContractDAO {
//	@Select("select id, code, business_code businessCode from purchase_contract where id = #{id}")
	Contract getById(Long id);
	
	List<Contract> queryByCode(String code);
	List<Contract> query(Long creatorId);
}
