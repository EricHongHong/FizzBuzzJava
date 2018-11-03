package com.eric.fizzbuzz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.eric.fizzbuzz.constant.Constant;
import com.eric.fizzbuzz.enumeration.FizzBuzzEnum;
import com.eric.fizzbuzz.exception.FizzBuzzException;
import com.eric.fizzbuzz.service.FizzBuzzService;
import com.eric.fizzbuzz.service.IntegerToStringService;

public class FizzBuzzServiceImplTest {

	private static FizzBuzzService fizzBuzzService;
	private static List<IntegerToStringService> integerToStringServiceList;

	@BeforeClass
	public static void beforeClass() {
		fizzBuzzService = new FizzBuzzServiceImpl();
		
		integerToStringServiceList = new ArrayList<IntegerToStringService>();
		integerToStringServiceList.add(new TransferFizzServiceImpl());
		integerToStringServiceList.add(new TransferBuzzServiceImpl());
	}

	@Test
	public void outputNumber() {
		int n = 1;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
		Assert.assertArrayEquals(new String[] {String.valueOf(n)}, new String[] {result});
	}
	
	@Test
	public void outputFizz() {
		int n = 3;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
		Assert.assertArrayEquals(new String[] {Constant.FIZZ}, new String[] {result});
	}
	
	@Test
	public void outputBuzz() {
		int n = 5;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
		Assert.assertArrayEquals(new String[] {Constant.BUZZ}, new String[] {result});
	}
	
	@Test
	public void outputFizzBuzz() {
		int n = 15;
		String expected = (Constant.FIZZ + Constant.BUZZ);
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
		Assert.assertArrayEquals(new String[] {expected}, new String[] {result});
	}
	
	@Test(expected=FizzBuzzException.class)
	public void outputException() {
		int n = 1;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzEnum.ALL_DESC);
		Assert.assertArrayEquals(new String[] {String.valueOf(n)}, new String[] {result});
	}
}
