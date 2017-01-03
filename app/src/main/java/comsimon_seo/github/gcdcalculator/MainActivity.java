package comsimon_seo.github.gcdcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnCalculate;
    TextView textOutput;
    EditText editInt1, editInt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = (Button)findViewById(R.id.btnCalculate);
        textOutput = (TextView)findViewById(R.id.textOutput);
        editInt1 = (EditText)findViewById(R.id.editInt1);
        editInt2 = (EditText)findViewById(R.id.editInt2);

        btnCalculate.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnCalculate:
                int int1 = Integer.parseInt(editInt1.getText().toString());
                int int2 = Integer.parseInt(editInt2.getText().toString());

                while (int2!=0) {
                    int temp = int2;
                    int2 = int1%temp;
                    int1 = temp;
                }
                textOutput.setText(String.valueOf(int1));
                break;
        }
    }
}
