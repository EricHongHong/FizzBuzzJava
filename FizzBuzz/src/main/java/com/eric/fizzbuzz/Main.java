package com.eric.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.eric.fizzbuzz.enumeration.FizzBuzzEnum;
import com.eric.fizzbuzz.service.FizzBuzzService;
import com.eric.fizzbuzz.service.IntegerToStringService;
import com.eric.fizzbuzz.service.impl.FizzBuzzServiceImpl;
import com.eric.fizzbuzz.service.impl.TransferBuzzServiceImpl;
import com.eric.fizzbuzz.service.impl.TransferBuzzStage2ServiceImpl;
import com.eric.fizzbuzz.service.impl.TransferFizzServiceImpl;
import com.eric.fizzbuzz.service.impl.TransferFizzStage2ServiceImpl;

public class Main {

	public static void main(String[] args) {

		int n = 100;
		
		List<IntegerToStringService> integerToStringServiceList = new ArrayList<IntegerToStringService>();
		integerToStringServiceList.add(new TransferFizzServiceImpl());
		integerToStringServiceList.add(new TransferBuzzServiceImpl());
		
		FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl();
		
		for(int i=1; i<=n; i++) {
			String result = fizzBuzzService.output(i, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
			System.out.println(result);
		}
		
	}
	
	@Test
	public void stage2() {

		int n = 100;
		
		List<IntegerToStringService> integerToStringServiceList = new ArrayList<IntegerToStringService>();
		integerToStringServiceList.add(new TransferFizzStage2ServiceImpl());
		integerToStringServiceList.add(new TransferBuzzStage2ServiceImpl());
		
		FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl();
		
		for(int i=1; i<=n; i++) {
			String result = fizzBuzzService.output(i, integerToStringServiceList, FizzBuzzEnum.ALL_ASC);
			System.out.println(result);
		}
		
	}

}
