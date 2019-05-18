package com.example.datepickercode;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private DatePickerDialog.OnDateSetListener onDateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);

               /* DatePickerDialog datePickerDialog= new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        textView.setText(String.valueOf(dayOfMonth)+"/"+ String.valueOf(month+1)+"/"+String.valueOf(year));//ay sifir degerinden basladigi icin ayi alirken bu sekilde aliyoruz
                    }
                },year,month,day);
                datePickerDialog.setTitle("Select the Date");
                datePickerDialog.setButton(TimePickerDialog.BUTTON_POSITIVE,"Select",datePickerDialog);
                datePickerDialog.setButton(TimePickerDialog.BUTTON_NEGATIVE,"Cancel",datePickerDialog);
                datePickerDialog.show();*/

              DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, AlertDialog.THEME_HOLO_LIGHT, new DatePickerDialog.OnDateSetListener() {
                  @Override
                  public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                  }
              }, year, month, day);
              datePickerDialog.show();


            }


        });
    }
}
