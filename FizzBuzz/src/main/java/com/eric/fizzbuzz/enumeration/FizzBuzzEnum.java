package com.eric.fizzbuzz.enumeration;

public enum FizzBuzzEnum {

	/**
	 * append all IntegerToStringService transfer result in ASC order
	 */
	ALL_ASC("ALL_ASC"),
	
	/**
	 * append all IntegerToStringService transfer result in DESC order
	 */
	ALL_DESC("ALL_DESC");
	
	private String code;
	
	private FizzBuzzEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
