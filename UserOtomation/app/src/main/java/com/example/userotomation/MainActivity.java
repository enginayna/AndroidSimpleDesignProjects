package com.example.userotomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView textViewUserLogin;
private EditText editTextUserName;
private EditText editTextPassword;
private Button buttonSend;
private  Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUserLogin = findViewById(R.id.textViewUserLogin);
        editTextUserName = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSend = findViewById(R.id.buttonSend);
        buttonClear = findViewById(R.id.buttonClear);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextUserName.getText().toString().equals("admin")
                &&  editTextPassword.getText().toString().equals("1234")){
                    if (editTextUserName.getText().toString().isEmpty()
                    ||  editTextPassword.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext() , "Username or Password is empty" , Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext() , "Login Succesful" , Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext() , "Username or Password error" , Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPassword.setText("");
                editTextUserName.setText("");
            }
        });
    }
}
