package com.example.design.pattern;

public class OperationContext {
	private Operation strategy;

	public OperationContext(Operation strategy) {
		this.strategy = strategy;
	}

	public int executeOperation(int num1, int num2) {
		return strategy.execute(num1, num2);
	}
}
