package com.example.listviewandspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
private Spinner spinner1;
private ListView listView;
String[] sList= {"Turkiye","Istanbul","Esenler"};
String[] tr={"Tokat","Mus","Sivas","Yozgat","Antalya","Izmir","Diayarbakir"};
String[] ist={"Mecidiyekoy","Bakirkoy","Esenler","Gungoren","Bagcilar"};
String[] es={"davutpasa","fevzi cakmak","mimar sinan","nine hatun","menderes","Terazidere"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        spinner1=findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,sList);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,
                           android.R.layout.simple_list_item_1,tr);
                   listView.setAdapter(adapter1);
                   break;
                   case 1: ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this,
                           android.R.layout.simple_list_item_1,ist);
                       listView.setAdapter(adapter2);
                       break;
                   case 2: ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this,
                           android.R.layout.simple_list_item_1,es);
                       listView.setAdapter(adapter3);
                       break;

               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}
