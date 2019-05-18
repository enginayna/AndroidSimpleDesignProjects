package com.example.simpleuseintent;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.drm.DrmStore;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {
    private EditText editTextWebsite;
    private Button buttonWebsite;
    private TextView textView;
    private EditText editTextCall;
    private Button buttonCall;
    private Button buttonChange;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextWebsite = findViewById(R.id.editTextWebsite);
        buttonWebsite = findViewById(R.id.buttonWebsite);
        textView = findViewById(R.id.textView);
        editTextCall = findViewById(R.id.editTextCall);
        buttonCall = findViewById(R.id.buttonCall);
        buttonChange = findViewById(R.id.buttonChange);

        final Intent intent = getIntent();
        String name = intent.getStringExtra("UserName");
        textView.setText("Hosgeldin" + name);
        buttonWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                if (editTextWebsite.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter WebSite" , Toast.LENGTH_LONG).show();
                }else{
                    intent.setData(Uri.parse(editTextWebsite.getText().toString()));
                    startActivity(intent);
                }
                //Action_DIAL arama islemi icin
                //Action_VIEW goruntuleme ile ilgili
                //Action_CAll arama islemleri icin
            }
        });

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editTextCall.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter Phone Number",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:"+editTextCall.getText().toString()));
                  /*  if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        return;
                    }*/
                    startActivity(intent);
                }
            }
        });

       /* buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.password,null);
                final EditText editText=view.findViewById(R.id.editTextFistPass);
                final EditText editText1=view.findViewById(R.id.editTextSecondPass);
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setMessage("Change Password");
                        builder.setView(view);
                        builder.setPositiveButton("Change", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(),"password changed successfully",Toast.LENGTH_LONG).show();
                            }
                        });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Cancel",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.create().show();
            }
        });*/

    }
}
