package com.eric.fizzbuzz.service.impl;

import com.eric.fizzbuzz.constant.Constant;
import com.eric.fizzbuzz.service.IntegerToStringService;

/**
 * IntegerToStringService implementation for FIZZ case.
 * @author Eric
 */
public class TransferFizzStage2ServiceImpl implements IntegerToStringService {

	public String transfer(int n) {
		return Constant.FIZZ;
	}

	public boolean support(int n) {
		return 0 == n%3 || String.valueOf(n).contains("3");
	}

}
