package com.example.timepickerdialogxml;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private Button button;
private TimePicker timePicker;
private TextView textView;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
        timePicker=findViewById(R.id.timePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int hour=calendar.get(Calendar.HOUR);
                int minute=calendar.get(Calendar.MINUTE);
                int second=calendar.get(Calendar.SECOND);
                String hourS=""+String.valueOf(hour+3);
                String minuteS=""+String.valueOf(minute);
                String secondS=""+String.valueOf(second);
                textView.setText((hourS) + ":"+minuteS+":"+secondS );
                timePicker.setCurrentHour(5);
                timePicker.setCurrentMinute(45);
                timePicker.setIs24HourView(false);//24 saatlik gorunumu kapattik
              timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
                  @Override
                  public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                      textView1.setText((hourOfDay+3) + ":" + minute);
                  }
              });
              timePicker.isShown();

            }
        });
    }
}
