package se.calc;

import android.widget.TextView;

public class CalcLogic {
	
	private TextView field = null;
	private int memory = 0;
	
	/** Create a new calculating device. 
	 * @param EditText field - So we can update/read value
	 */
	public CalcLogic(TextView inField) {
		this.field = inField;
	}

	/**
	 * Logic for addition.
	 */
	public void add(){
		int currentValue, newValue = 0;
	
		// read the current value
		currentValue = Integer.valueOf(field.getText().toString());
		
		// calculate new value and update memory
		newValue = currentValue + memory;
		memory = newValue;
		
		// write the new value
		field.setText(Integer.toString(newValue));
	}

	/**
	 * Clear the calculator.
	 */
	public void clear(){
		memory = 0;
		field.setText("0");
	}
	
	/**
	 * Push memory to screen
	 */
	public void update(){
		field.setText(Integer.toString(memory));
	}
	
}
