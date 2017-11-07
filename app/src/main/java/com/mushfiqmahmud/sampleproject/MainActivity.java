package com.mushfiqmahmud.sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnReset;
    TextView textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button)findViewById(R.id.btnClick);
        btnReset = (Button)findViewById(R.id.btnReset);
        textCounter = (TextView)findViewById(R.id.textViewCounter);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String countValue = textCounter.getText().toString();
                int count = Integer.parseInt(countValue);
                count++;
                textCounter.setText(String.valueOf(count));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textCounter.setText(String.valueOf(0));
            }
        });
    }
}
