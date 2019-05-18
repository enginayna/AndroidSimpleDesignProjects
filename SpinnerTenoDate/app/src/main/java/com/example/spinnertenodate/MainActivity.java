package com.example.spinnertenodate;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner Spinner1;
TextView textView;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        Spinner1=findViewById(R.id.Spinner1);
        ArrayList<String> list =new ArrayList<>();
        list.add("Engin");
        list.add("ahmet");
        list.add("zeynep");
        list.add("sevgi");
        list.add("gamze");

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(MainActivity.this
                ,android.R.layout.simple_list_item_1,android.R.id.text1,list);
        Spinner1.setAdapter(adapter);

        Spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Secilen kisi " + parent.getItemAtPosition(position),
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
