package com.example.optionmenu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button button;
private ImageView imageView;
private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             count++;
             if (count==1){
                 imageView.setImageResource(R.drawable.picture1);
             }
                if (count==2){
                    imageView.setImageResource(R.drawable.picture2);
                }
                if (count==3){
                    imageView.setImageResource(R.drawable.picture3);
                }
                if (count==4){
                    imageView.setImageResource(R.drawable.picture4);
                }
                if (count==5){
                    imageView.setImageResource(R.drawable.picture5);
                }
                if (count==6){
                    imageView.setImageResource(R.drawable.picture6);
                    count=-1;
                }
                if (count==0){
                    imageView.setImageResource(R.drawable.smile);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_Search :
                Toast.makeText(MainActivity.this, "Clicked Search Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Edit:
                View view = getLayoutInflater().inflate(R.layout.changetext,null);
                final EditText editText = view.findViewById(R.id.editText);
                AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Change Text");
                        builder.setCancelable(false);
                        builder.setView(view);
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
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
                        break;
            case R.id.sub_changePicture:
               Toast.makeText(MainActivity.this,"Buttondan yap ",Toast.LENGTH_LONG).show();
               break;
            case R.id.action_Exit:
                finish();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
