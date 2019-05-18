package com.example.datepicteruse;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView;
private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=findViewById(R.id.datePicker);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                java.util.Calendar presentTense = java.util.Calendar.getInstance();
                int year = presentTense.get(Calendar.YEAR);//simdiki zaman yil
                int month=presentTense.get(Calendar.MONTH);//simdiki zaman ay
                int day = presentTense.get(Calendar.DAY_OF_MONTH);//simdiki zaman gun
                StringBuilder stringBuilder= new StringBuilder();
                stringBuilder.append(String.valueOf(day)).append("/").append(String.valueOf(month+1)).append("/").append(String.valueOf(year));
                //month degerine arti 1 ekleme sebebimiz ay degerinin sifirdan basliyor olmasi.
                //textView.setText(stringBuilder);//simdiki zaman gun ay ve yilin string builder ile birlestirilerek gosterilmesi

                textView.setText(datePicker.getDayOfMonth()+"/"+datePicker.getMonth()+"/"+datePicker.getYear());
                //date picker uzerinde secilen gun ay ve yilin alinip textView e yerlestirilmesi

                datePicker.init(year,month,day,null);//Baslangicta date picker ta gorunmesini istedigimiz tarih
                // ve tiklama islemi yapildiktan sifirlanip gelecegi nokta

                //diger tarih gorunumu icin  android:datePickerMode="spinner" calendar olarak degistirilebilir
            }
        });
    }
}
