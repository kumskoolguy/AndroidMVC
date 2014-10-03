package com.example.androidmvc.home;

import com.example.androidmvc.R;
import com.example.controller.Controller;
import com.example.model.Model;
import com.example.view.View;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		calculate = (Button) this.findViewById(R.id.calculate);
		param1 = (EditText) this.findViewById(R.id.value1);
		param2 = (EditText) this.findViewById(R.id.value2);
		result = (EditText) this.findViewById(R.id.result);

		mRadioGroup = (RadioGroup) this.findViewById(R.id.radioGroup1);
		add = (RadioButton) this.findViewById(R.id.add);
		sub = (RadioButton) this.findViewById(R.id.sub);
		multi = (RadioButton) this.findViewById(R.id.multi);
		division = (RadioButton) this.findViewById(R.id.division);
		max = (RadioButton) this.findViewById(R.id.max);
		min = (RadioButton) this.findViewById(R.id.min);

		view = new View(this);
		mainController = new Controller(view, model);
		mainController.control();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// ///////// Variable Decleration ///////////////
	public Button calculate;
	public EditText param1, param2, result;
	public RadioGroup mRadioGroup;
	public RadioButton add, sub, multi, division, max, min;

	View view;
	Model model;
	Controller mainController;

}
