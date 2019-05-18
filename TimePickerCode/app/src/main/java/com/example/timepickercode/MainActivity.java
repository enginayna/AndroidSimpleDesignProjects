package com.example.timepickercode;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private EditText editTextHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editTextHour=findViewById(R.id.editTextHour);
       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                int hour=calendar.get(Calendar.HOUR_OF_DAY);
                int minute=calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textView.setText(hourOfDay + ":"+minute);
                    }
                },hour,minute,true);
                timePickerDialog.setTitle("Saati seciniz");
                timePickerDialog.setButton(TimePickerDialog.BUTTON_POSITIVE,"Ayarla" , timePickerDialog);
                timePickerDialog.setButton(TimePickerDialog.BUTTON_NEGATIVE,"Iptal",timePickerDialog);
                timePickerDialog.show();
            }
        });




     /*  editTextHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                int minute = c.get(Calendar.MINUTE);

                TimePickerDialog timePicker;
                timePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        editTextHour.setText(hourOfDay + " : " + minute);
                    }
                },hour , minute , true);
                timePicker.setButton(TimePickerDialog.BUTTON_POSITIVE , "Ayarla" , timePicker);
                timePicker.setButton(TimePickerDialog.BUTTON_NEGATIVE , "Iptal" , timePicker);
                timePicker.show();


            }
        });*/
    }
}
