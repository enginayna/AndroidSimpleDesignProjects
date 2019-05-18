package com.example.customlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<DataList> dataLists= new ArrayList<>();
ListView list;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        String[] fruits = new String[]{"Apple","Banana","Cherry","Watermelon","Peach","Melon",
                "Lemon","Orange","Grape","Fig","Apricot","Strawberry","Pear","Plum","Quince"};
        for (int i=0; i<fruits.length; i++){
            dataLists.add(new DataList(fruits[i]));

        }
        CustomAdapter adapter= new CustomAdapter(dataLists,context);
        list.setAdapter(adapter);


    }
}
