package com.angelralf.calculator;
import org.springframework.stereotype.Service;

/**
* Spring Application.
*/

@Service
public class Calculator {
	int sum(int a, int b) {
		return a + b;
	}
}
