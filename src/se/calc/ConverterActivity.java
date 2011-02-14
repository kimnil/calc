package se.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConverterActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter);
    }
    
    public void myClickHandler(View view) {
    	
    	if(view.getId() == R.id.btn_to_calculator) {
            Intent intent = new Intent();
            intent.putExtra("value", 666);
            setResult(RESULT_OK, intent);
            finish();
    	}
    	
    }
    
}
