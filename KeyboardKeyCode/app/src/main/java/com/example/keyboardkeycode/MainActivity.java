package com.example.keyboardkeycode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //editText uzerindeyken herhangi bir tusa bastigimizda yapilacak isleme karar verir.
                //Vieew v metotu kullanacagimiz editText
                if (event.getAction()==KeyEvent.ACTION_DOWN && keyCode==KeyEvent.KEYCODE_ENTER){
                    Toast.makeText(getApplicationContext(),"You clicked Enter" , Toast.LENGTH_LONG).show();
                    //event.getAction()==KeyEvent.ACTION_DOWN event action == tusa basildiginda asagida oldugunda anlamindadir.
                    //edittext e v ile mudahale edebiliriz.
                    return true;
                }
                return false;
            }
        });
    }
    //keyCode bastigimiz tusun kodu
    //KeyEvent kullanicinin klavye tuslari uzerinde yapacagi hareketleri yakalamak ve tepki vermek
    //icin yazilmis bir siniftir
     /*@Override
     public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:
                Toast.makeText(getApplicationContext() , "You clicked the back button" , Toast.LENGTH_LONG).show();
                break;
           //geri tusuna basildiginda toast mesajimiz aktif oluyor
        }
        return super.onKeyDown(keyCode, event);
    }*/

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext() , "You clicked the back button" , Toast.LENGTH_LONG).show();
        //bu metot ile geri tusunu islevsiz hale getiebiliriz.
    }
}
