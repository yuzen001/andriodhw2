package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText)findViewById(R.id.height);
        weight = (EditText)findViewById(R.id.weight);
        Button submit = (Button)findViewById(R.id.calculation);


        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                if ( !("".equals(height.getText().toString())
                        || "".equals(weight.getText().toString())) )
                {
                    float fh = Float.parseFloat(height.getEditableText().toString());
                    float fw = Float.parseFloat(weight.getEditableText().toString());
                    float fresult;
                    TextView result = (TextView)findViewById(R.id.result);
                    fh = fh/100;
                    fh = fh*fh;

                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
                    fresult = fw/fh;
                    result.setText(nf.format(fw/fh) +"");

                }
            }
        });
    }
}