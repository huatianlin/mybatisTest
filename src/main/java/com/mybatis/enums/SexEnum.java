package com.mybatis.enums;

public enum SexEnum {
	MALE(1, "男"),
	FEMALE(2, "女");
	
	private int value;
	private String desc;
	
	private SexEnum (int value, String desc){
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}
	public String getDesc() {
		return desc;
	}
	
	public static SexEnum getSexEnum(int value) {
		SexEnum[] array = SexEnum.values();
		for (SexEnum sexEnum : array) {
			if (sexEnum.getValue() == value) {
				return sexEnum;
			}
		}
		return null;
	}
}
