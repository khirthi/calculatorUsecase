package com.usecase.calculator.calculatorUsecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class CalculatorUsecaseApplication {

	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();
		int num1 = 20;
		int num2 = 10;
		System.out.println("Sum = " + myCalculator.add(num1, num2));
		System.out.println("Difference = " + myCalculator.subtract(num1, num2));
		System.out.println("Product = " + myCalculator.multiply(num1, num2));
		System.out.println("Quotient = " + myCalculator.divide(num1, num2));

		num2 = 0;
		System.out.println("Quotient = " + myCalculator.divide(num1, num2)); //throws ArithmeticExceptionError
	}

}
