package com.example.design.pattern;

public class OperationAdd implements Operation {
	@Override
	public int execute(int num1, int num2) {
		return num1 + num2;
	}
}
