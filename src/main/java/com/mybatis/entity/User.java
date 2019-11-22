package com.mybatis.entity;

import java.util.List;

import com.mybatis.enums.SexEnum;

public class User extends AbstractEntity {
	private static final long serialVersionUID = -4571380585204565116L;

	private String userName;
	private String birthday;
	private SexEnum sexEnum;
	private String email;
	private Long mobile;
	private String remark;
	
	private Role role;
	private List<Contract> contracts;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public SexEnum getSexEnum() {
		return sexEnum;
	}
	public void setSexEnum(SexEnum sexEnum) {
		this.sexEnum = sexEnum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public List<Contract> getContracts() {
		return contracts;
	}
	public void setContracts(List<Contract> contracts) {
		this.contracts = contracts;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", birthday=" + birthday + ", sexEnum=" + sexEnum + ", email=" + email
				+ ", mobile=" + mobile + ", remark=" + remark + ", role=" + role + ", contracts=" + contracts + "]";
	}
}
