package com.example.battery;

import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int view = R.layout.activity_main;
    TextView textView;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
        textView = findViewById(R.id.text);
        BatteryManager bm = (BatteryManager) getSystemService(BATTERY_SERVICE);
        if (android.os.Build.VERSION.SDK_INT>= android.os.Build.VERSION_CODES.JELLY_BEAN)
        {
            int percentage = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
            textView.setText("Battery perecntage = "+percentage+"%");
        }
    }
}