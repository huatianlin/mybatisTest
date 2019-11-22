package com.mybatis.entity;

import java.io.Serializable;

public class AbstractEntity implements Serializable {
	private static final long serialVersionUID = 8108484074038885026L;

	private Long id;
	private Long lastAccess;
	private Long version;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Long getLastAccess() {
		return lastAccess;
	}
	public void setLastAccess(Long lastAccess) {
		this.lastAccess = lastAccess;
	}
}
