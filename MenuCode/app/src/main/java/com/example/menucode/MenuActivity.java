package com.example.menucode;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    Context context=this;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,1,"add").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //icon ekleme yapabiliriz vb durumalri kontrol edebiliriz.
                Toast.makeText(context,item.getTitle(),Toast.LENGTH_LONG).show();
                return true;
            }
        });
        menu.add(2,2,2,"edit");
        menu.add(1,3,3,"exit");
        menu.addSubMenu(1,1,1,"update");//sub menu item belirtebilir ve dunzeleyebilirz.
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupEnabled(1,true);
        menu.setGroupVisible(0,false);//menudeki gorunurlugunu kontrol edebiliriz.
        menu.setGroupEnabled(2,false);//menude gorunur halde gelir ancak tiklanamaz
        return super.onPrepareOptionsMenu(menu);
    }

}
