package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<DataList> dataLists= new ArrayList<>();
    LayoutInflater inflater;


    public CustomAdapter(List<DataList> dataLists, Context context) {
        this.dataLists = dataLists;
        this.context = context;
    }

    @Override
    public int getCount() {//ListView de gosterilecek satir sayisi
        return dataLists.size();
    }

    @Override
    public Object getItem(int position) {//postion ile sirasi gelen eleman
        return position;
    }

    @Override
    public long getItemId(int position) {//niteleyici Id
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //position ile sirasi gelen eleman icin bir view dondurur
        inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.specialdesign,null);

        TextView textView=view.findViewById(R.id.textView);

        ImageView imageView=view.findViewById(R.id.picture);

        DataList dataList=dataLists.get(position);

        textView.setText(dataList.getName());

      switch (dataList.getName()){
          case "Apple":
              imageView.setImageResource(R.drawable.apple);
          break;
          case "Banana":
              imageView.setImageResource(R.drawable.banana);
              break;
          case "Cherry":
              imageView.setImageResource(R.drawable.cherry);
              break;
          case "Watermelon":
              imageView.setImageResource(R.drawable.watermelon);
              break;
          case "Peach":
              imageView.setImageResource(R.drawable.peach);
              break;
          case "Melon":
              imageView.setImageResource(R.drawable.melon);
              break;
          case "Lemon":
              imageView.setImageResource(R.drawable.lemon);
              break;
          case "Orange":
              imageView.setImageResource(R.drawable.orange);
              break;
          case "Grape":
              imageView.setImageResource(R.drawable.grape);
              break;
          case "Fig":
              imageView.setImageResource(R.drawable.fig);
              break;
          case "Apricot":
              imageView.setImageResource(R.drawable.apricot);
              break;
          case "Strawberry":
              imageView.setImageResource(R.drawable.strawberry);
              break;
          case "Pear":
              imageView.setImageResource(R.drawable.pear);
              break;
          case "Plum":
              imageView.setImageResource(R.drawable.plum);
              break;
          case "Quince":
              imageView.setImageResource(R.drawable.quince);
              break;

      }

        return view;
    }
}
