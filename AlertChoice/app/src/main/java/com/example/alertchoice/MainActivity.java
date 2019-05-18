package com.example.alertchoice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button buttonChoice;
private TextView textView;
private Button buttonCagdas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        buttonChoice=findViewById(R.id.buttonChoice);
        buttonChoice=findViewById(R.id.buttonCagdas);
        buttonChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView.setText("Amcik");
                Intent intent=new Intent(getApplicationContext(),Cagdas.class);
                startActivity(intent);
            }
        });
    }
}
