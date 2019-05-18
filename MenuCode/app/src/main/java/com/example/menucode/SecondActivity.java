package com.example.menucode;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

public class SecondActivity extends MenuActivity {
private EditText editText;
private EditText editText1;
private Button button;
private TextView textView;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText1);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        this.registerForContextMenu(editText);//Context menusu oldugunu tanimladik ancak
        //hangi menuye sahip oldugunu belirtmedik
        this.registerForContextMenu(editText1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu= new PopupMenu(context,textView);
                popupMenu.getMenuInflater().inflate(R.menu.color,popupMenu.getMenu());
                popupMenu.show();
                //popup menu ile de menu yapilabilir tek tikla secenekler elde edilebilir.
            }
        });


    }
    

 /*   @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        switch (v.getId()){
            case R.id.editText:
                getMenuInflater().inflate(R.menu.color,menu);
                break;
            case R.id.editText1:
                getMenuInflater().inflate(R.menu.font_menu,menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_blue:
                editText.setTextColor(Color.BLUE);
                break;
            case R.id.action_green:
                editText.setTextColor(Color.GREEN);
                break;
            case R.id.action_red:
                editText.setTextColor(Color.RED);
                break;
            case R.id.action_Long:
               editText1.setTextSize(30);
                break;
            case R.id.action_middle:
                editText1.setTextSize(20);
                break;
            case R.id.action_small:
                editText1.setTextSize(10);
                break;

        }
        return super.onContextItemSelected(item);
    }*/
}
