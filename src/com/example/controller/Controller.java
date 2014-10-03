package com.example.controller;

import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.model.Model;
import com.example.view.View;

public class Controller implements OnClickListener, OnCheckedChangeListener {

	public Controller(View view, Model model) {
		super();
		this.view = view;
		this.model = model;
	}

	public void control() {
		view.getCalculateButton().setOnClickListener(this);
		view.getSelectionGroup().setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// Log.i("LOG", "Clicked " + view.getSelectedOperationCode(checkedId));

		view.setSelectedOperationCode(checkedId);
	}

	@Override
	public void onClick(android.view.View v) {
		String value1 = view.getField1().getText().toString();
		String value2 = view.getField2().getText().toString();
		int selection = view.getSelectedOperation();

		this.model = new Model(selection, Integer.parseInt(value1),
				Integer.parseInt(value2));
		result = this.model.execute();
		view.displayResult(result);
	}

	// ///////// Variable decleration /////////

	View view;
	Model model;
	int result;
}
