package com.example.design.pattern;

public class OperationSubtraction implements Operation {

	@Override
	public int execute(int num1, int num2) {
		return Math.abs((num1 - num2));
	}
}
