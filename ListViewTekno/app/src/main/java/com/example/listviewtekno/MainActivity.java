package com.example.listviewtekno;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
private ListView listView;
String[] fruits = new String[]{"Apple","Banane","Cherry","Watermelon","Peach","Melon","Lemon","Orange","Grape","Fig","Apricot","Strawberry","Pear","Plum","Quince"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
       // ArrayAdapter<String>  adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,fruits);
      /*  ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,R.layout.fruitdesign,fruits);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Info");
                alertDialog.setIcon(R.drawable.picture);
                alertDialog.setCancelable(false);
                alertDialog.setMessage(fruits[position] + " clicked");
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.show();
            }
        });*/


    }

}
