package com.eric.fizzbuzz.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.eric.fizzbuzz.service.impl.FizzBuzzServiceImplTest;
import com.eric.fizzbuzz.service.impl.TransferBuzzServiceImplTest;
import com.eric.fizzbuzz.service.impl.TransferBuzzStage2ServiceImplTest;
import com.eric.fizzbuzz.service.impl.TransferFizzServiceImplTest;
import com.eric.fizzbuzz.service.impl.TransferFizzStage2ServiceImplTest;

@RunWith(Suite.class)
@SuiteClasses({
	TransferFizzStage2ServiceImplTest.class,
	TransferFizzServiceImplTest.class,
	TransferBuzzStage2ServiceImplTest.class,
	TransferBuzzServiceImplTest.class,	
	FizzBuzzServiceImplTest.class
})
public class FizzBuzzSuiteTest {

}
