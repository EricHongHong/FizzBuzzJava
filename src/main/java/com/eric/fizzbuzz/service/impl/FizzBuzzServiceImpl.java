package com.eric.fizzbuzz.service.impl;

import java.util.List;

import com.eric.fizzbuzz.enumeration.FizzBuzzEnum;
import com.eric.fizzbuzz.exception.FizzBuzzException;
import com.eric.fizzbuzz.service.IntegerToStringService;
import com.eric.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzServiceImpl implements FizzBuzzService {

	public String output(int n, List<IntegerToStringService> integerToStringServiceList,
			FizzBuzzEnum fizzBuzz) {

		StringBuffer result = new StringBuffer();

		if (FizzBuzzEnum.ALL_ASC.getCode().equals(fizzBuzz.getCode())) {
			for (IntegerToStringService iService : integerToStringServiceList) {
				if (iService.support(n)) {
					result.append(iService.transfer(n));
				}
			}

			if (0 == result.length()) {
				result.append(String.valueOf(n));
			}
		} else {
			throw new FizzBuzzException(
					String.format("Unsupported FizzBuzzEnum(%s)", fizzBuzz.getCode()));
		}

		return result.toString();
	}
}
