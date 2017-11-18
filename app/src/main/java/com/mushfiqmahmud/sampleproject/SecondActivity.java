package com.mushfiqmahmud.sampleproject;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.common.api.Response;

import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {

    TextView fajrTime;
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcome = (TextView)findViewById(R.id.txtWelcome);
        fajrTime = (TextView)findViewById(R.id.fajrTimeText);

        //(urlPre) + (timeStamp) + ? + latitude= (latlong/latitude) + &longitude=(latlong/longitude) + &method=2
        String urlPre = "http://api.aladhan.com/timings/";
        String timeStamp = "http://api.aladhan.com/currentTimestamp?zone=America/New_York";
        String latlong = "http://api.aladhan.com/cityInfo?city=Tampa&country=US";
    }
}
