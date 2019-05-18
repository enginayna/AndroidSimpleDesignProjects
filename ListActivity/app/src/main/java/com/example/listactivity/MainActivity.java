package com.example.listactivity;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
Context context=this;
ArrayAdapter<String> adapter;
String[] array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //Bu bir listactivity oldugu icin activity.main duzenine gerek yok gosterilecek duzen listActivity duzeni
        array=new String[]{"45","787","5132","464","878","121","45646","311","4854","132"};
        adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,android.R.id.text1,array);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(context,""+l.getItemAtPosition(position),Toast.LENGTH_LONG).show();
        //Toast.makeText(context,""+array[position],Toast.LENGTH_LONG).show();
        //ayni islemi yapar arrayden posizyonu almak ve getItemAtPosition(position)
    }
}
