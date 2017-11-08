package com.mushfiqmahmud.sampleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {

    TextView btnClick; // Create button and textview objects to be used later
    TextView btnReset;
    TextView btnNewScreen;
    TextView textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This connects the main activity view xml file to this java file

        btnClick = (TextView) findViewById(R.id.btnClick);
        btnReset = (TextView) findViewById(R.id.btnReset);
        btnNewScreen = (TextView) findViewById(R.id.btnNewScreen);
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

        btnNewScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
