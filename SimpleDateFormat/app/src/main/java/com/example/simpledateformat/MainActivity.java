package com.example.simpledateformat;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
private Button button;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 /*TimePickerDialog timePickerDialog=new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Date date = null;
                        DateFormat format = new SimpleDateFormat("HH:mm");
                        try {
                            date=format.parse(hourOfDay+":"+minute);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        Toast.makeText(context,format.format(date),Toast.LENGTH_LONG).show();
                    }
                },8,0,true);
                timePickerDialog.show();*/
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        Toast.makeText(context,dayOfMonth+"/"+month+"/"+year,Toast.LENGTH_LONG).show();
                    }
                },2014,2,7);
                datePickerDialog.show();
            }

        });
    }
}
