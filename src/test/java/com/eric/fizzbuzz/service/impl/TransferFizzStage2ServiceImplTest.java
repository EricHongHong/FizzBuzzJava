package com.eric.fizzbuzz.service.impl;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.eric.fizzbuzz.constant.Constant;
import com.eric.fizzbuzz.service.IntegerToStringService;

public class TransferFizzStage2ServiceImplTest {
	
	private static IntegerToStringService integerToStringService;
	
	@BeforeClass
	public static void beforeClass() {
		integerToStringService = new TransferFizzStage2ServiceImpl();
	}

	@Test
	public void supportTrue() {
		int n = 3;
		Assert.assertTrue(integerToStringService.support(n));
	}
	
	@Test
	public void supportTrueStage2() {
		int n = 31;
		Assert.assertTrue(integerToStringService.support(n));
	}
	
	@Test
	public void supportFalse() {
		int n = 5;
		Assert.assertFalse(integerToStringService.support(n));
	}
	
	@Test
	public void transfer() {
		int n = 5;
		String result = integerToStringService.transfer(n);
		Assert.assertArrayEquals(new String[] {Constant.FIZZ}, new String[] {result});
	}
}
