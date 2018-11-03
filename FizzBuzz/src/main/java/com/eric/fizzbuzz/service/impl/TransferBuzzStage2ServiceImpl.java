package com.eric.fizzbuzz.service.impl;

import com.eric.fizzbuzz.constant.Constant;
import com.eric.fizzbuzz.service.IntegerToStringService;

/**
 * IntegerToStringService implementation for BUZZ case.
 * @author Eric
 */
public class TransferBuzzStage2ServiceImpl implements IntegerToStringService {

	public String transfer(int n) {
		return Constant.BUZZ;
	}

	public boolean support(int n) {
		return 0 == n%5 || String.valueOf(n).contains("5");
	}

}
