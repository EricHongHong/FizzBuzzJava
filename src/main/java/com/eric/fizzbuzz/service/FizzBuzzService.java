package com.eric.fizzbuzz.service;

import java.util.List;

import com.eric.fizzbuzz.enumeration.FizzBuzzEnum;

public interface FizzBuzzService {

	/**
	 * 
	 * @param n A given integer
	 * @param integerToStringServiceList fizz and buzz case
	 * @param fizzBuzz result in ASC or DESC order
	 * @return
	 */
	public String output(int n, List<IntegerToStringService> integerToStringServiceList, FizzBuzzEnum fizzBuzz);
}
