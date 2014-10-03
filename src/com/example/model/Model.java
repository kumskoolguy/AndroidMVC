package com.example.model;

import android.util.Log;

import com.example.design.pattern.Operation;
import com.example.design.pattern.OperationAdd;
import com.example.design.pattern.OperationContext;
import com.example.design.pattern.OperationDivision;
import com.example.design.pattern.OperationFindMaximum;
import com.example.design.pattern.OperationFindMinimum;
import com.example.design.pattern.OperationMultiply;
import com.example.design.pattern.OperationSubtraction;

public class Model {

	int operation, param1, param2;
	OperationContext context;
	Operation arithmethicsOpn;

	public Model() {
		this(1, -1, -1);
	}

	public Model(int Operation, int param1, int param2) {
		this.operation = Operation;
		this.param1 = param1;
		this.param2 = param2;
	}

	public int execute() {
		int returnValue = -1;
		switch (operation) {
		case 0:
			arithmethicsOpn = new OperationAdd();
			break;
		case 1:
			arithmethicsOpn = new OperationSubtraction();
			break;
		case 2:
			arithmethicsOpn = new OperationMultiply();
			break;
		case 3:
			arithmethicsOpn = new OperationDivision();
			break;
		case 4:
			arithmethicsOpn = new OperationFindMaximum();
			break;
		case 5:
			arithmethicsOpn = new OperationFindMinimum();
			break;
		default:
			break;
		}
		context = new OperationContext(arithmethicsOpn);
		returnValue = context.executeOperation(this.param1, this.param2);

		return returnValue;
	}
}
