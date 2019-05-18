package com.example.alertchoice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cagdas extends AppCompatActivity {
private EditText editTextCagdas;
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cagdas);
        button=findViewById(R.id.button);
        editTextCagdas=findViewById(R.id.editTextCagdas);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),""+editTextCagdas.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
