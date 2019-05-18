package com.example.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main Activity" , "Hello World"); //d(debug ayiklama onarma): Günlük mesajını filtrelemek için kullanılan DebugLog seviyesi ayarı Logcat bölmesinde görüntülenir.
        Log.e("Main Activity" , "Hata Mesaji"); //e(error hata): Hata icin kullanilir
        Log.w("Main Activity" , "Uyari"); //w(warn uyari): Uyari mesajlari icin kullanilir
        Log.i("Main Activity" , "Bilgi mesaji"); //i(info bilgi): Bilgi mesajlari icin kullanilir
        //"MainActivity": İlk argüman, Logcat bölmesindeki mesajları filtrelemek için kullanılabilecek bir etikettir.
        //"Hello world": İkinci argüman gerçek mesajdır.
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("selam canim");

            }
        });
    }


}
