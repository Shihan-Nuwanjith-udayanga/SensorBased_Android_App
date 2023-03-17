package com.example.demosenserpractical01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SensorManager sensorManager;
    private List<Sensor> deviceSensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);

//        textView.setText(deviceSensors.toString());
        printListOfSensors();
    }

    private void printListOfSensors(){
        for (Sensor sensor:deviceSensors){
            textView.setText(textView.getText()+"\n"+sensor.getName());
        }
    }
}