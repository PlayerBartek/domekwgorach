package com.example.domek;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button pszycisk_POLUB;
    private Button pszycisk_USUN;
    private Button pszycisk_ZAPISZ;
    private TextView text_POLUB;
    private int licz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pszycisk_POLUB = findViewById(R.id.pszycisk_polub);
        pszycisk_USUN = findViewById(R.id.pszycisk_usun);
        pszycisk_ZAPISZ = findViewById(R.id.pszycisk_zapisz);
        text_POLUB = findViewById(R.id.licz_polub);

        pszycisk_POLUB.setOnClickListener(v -> {    //inkrementacja
                licz++;
            text_POLUB.setText(licz + " polubień");
        });

        pszycisk_USUN.setOnClickListener(v -> {     // dekrementacja
                if(licz > 0) {
                    licz--;
                    text_POLUB.setText(licz + " polubień");
                }
        });
    };
}