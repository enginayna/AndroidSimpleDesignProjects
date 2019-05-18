package com.example.alert;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private Button buttonMessage;
private Button buttonWrite;
private TextView textView;
private Button buttonChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMessage=findViewById(R.id.buttonMessage);
        buttonWrite=findViewById(R.id.buttonWrite);
        textView=findViewById(R.id.textView);
        buttonChoice=findViewById(R.id.buttonChoice);

       // choice=new boolean{false,false,false,false};
        //choice= new boolean[listItems.length];

        buttonMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Message")
                        .setTitle("Welcome")
                        .setCancelable(false)//pencere disina tiklanamaz true olursa tiklanabilir
                        .setIcon(R.mipmap.ic_launcher_round)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
            }
        });

        buttonWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view =getLayoutInflater().inflate(R.layout.message , null);
                final EditText editText=view.findViewById(R.id.editText);
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setView(view)
                        .setIcon(R.drawable.ic_edit_black_24dp)
                        .setTitle("Welcome")
                        .setCancelable(false)
                        .setPositiveButton("Write", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                textView.setText(editText.getText().toString());
                            }
                        });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
            }
        });

         buttonChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] Items=new String[]{"a","b","c","d"};
                final boolean[] choice=new boolean[]{false,false,false,false};
                final List<String> listItems= Arrays.asList(Items);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Make Your Choice");
                builder.setMultiChoiceItems(Items,choice, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        choice[which]=isChecked;
                        String currentItem = listItems.get(which);
                        Toast.makeText(getApplicationContext(), currentItem + " " + isChecked, Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        textView.setText("Your selected character.../n");
                        for (int i=0; i<choice.length; i++){
                            boolean checked = choice[i];
                            if(checked){
                                textView.setText(textView.getText() +listItems.get(i) + "/n" );
                            }

                        }

                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });


    }
}
