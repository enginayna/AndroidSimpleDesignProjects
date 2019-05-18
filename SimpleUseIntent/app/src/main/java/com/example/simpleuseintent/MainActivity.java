package com.example.simpleuseintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText editTextUser;
private EditText editTextPass;
private Button buttonSend;
private Button buttonClear;
private TextView textView;
private String UserName="Admin";
private String Password="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonSend.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

    }
    public void init(){
        editTextPass = findViewById(R.id.editTextPass);
        editTextUser = findViewById(R.id.editTextUser);
        buttonSend = findViewById(R.id.buttonSend);
        buttonClear = findViewById(R.id.buttonClear);
        textView = findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {//v tiklanan buton

        switch (v.getId()){
            case R.id.buttonSend:


                if (editTextUser.getText().toString().equals(UserName)
                        && editTextPass.getText().toString().equals(Password)){

                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("UserName" , editTextUser.getText().toString());
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"UserName or Password error",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.buttonClear:
                editTextPass.setText("");
                editTextUser.setText("");
                editTextUser.requestFocus();
                break;
        }

    }
}
