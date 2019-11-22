package com.mybatis.entity;

/**
 * 角色
 * @author Administrator
 *
 */
public class Role extends AbstractEntity {
	private static final long serialVersionUID = -788784002929899310L;

	/** 角色名称 */
	private String name;
	/** 用户ID */
	private Long userId;
	/** 是否禁用 (0-正常 1-禁用) */
	private Boolean disabled;
	/** 创建时间 */
	private Long createTime;
	/** 备注 */
	private String remark;
	
	private User user;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Boolean getDisabled() {
		return disabled;
	}
	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [name=" + name + ", userId=" + userId + ", disabled=" + disabled + ", createTime=" + createTime
				+ ", remark=" + remark + ", user=" + user + "]";
	}
}
