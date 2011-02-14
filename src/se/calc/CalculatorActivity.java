package se.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends Activity {

	// Handle for the "calculator brain".
	private CalcLogic cl;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        
        cl = new CalcLogic((TextView)findViewById(R.id.result));
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //TODO handle here. 
        
        if(requestCode == 0){
        TextView field = (TextView)findViewById(R.id.result);
        field.setText("från konverteraren");
        }
        
    }
    
    /** This is the onClickHandler that takes care of Button clicks. */
    public void myClickHandler(View view) {
    
    	// Retrieve the result field
    	TextView field = (TextView)findViewById(R.id.result);
    
    	// Handle the different buttons
    	switch(view.getId()) {
    	
    	case R.id.btn_to_converter:
    		Intent convIntent = new Intent(view.getContext(), ConverterActivity.class);
    		startActivityForResult(convIntent, 0);
    		break;
    	
    	
    	case R.id.btn_0:
    		field.append(this.getText(R.string.btn_0));
    		break;
    		
    	case R.id.btn_1:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_1));
    		else
				field.append(this.getText(R.string.btn_1));
		break;
    		
    	case R.id.btn_2:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_2));
    		else
				field.append(this.getText(R.string.btn_2));
		break;
    		
    	case R.id.btn_3:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_3));
    		else
				field.append(this.getText(R.string.btn_3));
		break;
    		
    	case R.id.btn_4:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_4));
    		else
				field.append(this.getText(R.string.btn_4));
		break;
    		
    	case R.id.btn_5:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_5));
    		else
				field.append(this.getText(R.string.btn_5));
		break;
    		
    	case R.id.btn_6:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_6));
    		else
				field.append(this.getText(R.string.btn_6));
		break;
    		
    	case R.id.btn_7:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_7));
    		else
				field.append(this.getText(R.string.btn_7));
		break;
		
    	case R.id.btn_8:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_8));
    		else
				field.append(this.getText(R.string.btn_8));
		break;
    		
    	case R.id.btn_9:
    		// If the text field is 0, don't append, just set the value
    		if (field.getText().toString().compareTo(
    								(this.getText(R.string.btn_0).toString())) == 0)
    			field.setText(this.getText(R.string.btn_9));
    		else
				field.append(this.getText(R.string.btn_9));
		break;
    		
    	case R.id.btn_clr:
    		cl.clear();
		break;
    		
    	case R.id.btn_ok:
    		cl.update();
		break;
		
    	case R.id.btn_plus:
    		cl.add();
		break;
    		
    	default:
		break;
    	}
    }
}