package com.example.view;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.androidmvc.home.Main;

public class View {

	public View(Main smain) {
		super();
		this.smain = smain;

		this.calculate = smain.calculate;
		this.param1 = smain.param1;
		this.param2 = smain.param2;
		this.mRadioGroup = smain.mRadioGroup;
		this.add = smain.add;
		this.sub = smain.sub;
		this.multi = smain.multi;
		this.division = smain.division;
		this.max = smain.max;
		this.min = smain.min;

		this.result = smain.result;
	}

	public Button getCalculateButton() {
		return this.calculate;
	}

	public EditText getField1() {
		return this.param1;
	}

	public EditText getField2() {
		return this.param2;
	}

	public RadioGroup getSelectionGroup() {
		return this.mRadioGroup;
	}

	public void setCalculationResult(String result) {
		this.result.setText(result);
	}

	public void setSelectedOperationCode(int checkedId) {
		if (this.add.getId() == checkedId)
			selection = 0;
		else if (this.sub.getId() == checkedId)
			selection = 1;
		else if (this.multi.getId() == checkedId)
			selection = 2;
		else if (this.division.getId() == checkedId)
			selection = 3;
		else if (this.max.getId() == checkedId)
			selection = 4;
		else if (this.min.getId() == checkedId)
			selection = 5;
	}

	public int getSelectedOperation() {
		return this.selection;
	}

	public void displayResult(int result) {
		this.result.setText("" + result);
	}

	private enum Operation {
		ADD("A"), SUBSTRACTION("S"), MULTIPLICATION("M"), DIVISION("D"), MAXNUM(
				"X"), MINNUM("N");

		private String statusCode;

		private Operation(String s) {
			statusCode = s;
		}

		public String getOperationCode() {
			return statusCode;
		}
	}

	////////////// Variable Decleration ///////////////
	
	Main smain;
	private Button calculate;
	private EditText param1, param2, result;
	private RadioGroup mRadioGroup;
	private RadioButton add, sub, multi, division, max, min;
	int selection;
}