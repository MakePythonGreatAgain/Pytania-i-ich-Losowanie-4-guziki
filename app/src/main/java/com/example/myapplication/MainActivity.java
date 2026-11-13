package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonLosuj;
    private Button odp1;
    private Button odp2;
    private Button odp3;
    private Button odp4;

    private TextView Pytanie;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buttonLosuj = findViewById(R.id.buttonLosuj);
        odp1 = findViewById(R.id.button1);
        odp2 = findViewById(R.id.button2);
        odp3 = findViewById(R.id.button3);
        odp4 = findViewById(R.id.button4);
        Pytanie = findViewById(R.id.textView);
        Pytanie.setText("Kliknij Guzik Losuj aby zacząć: ");

        //RoznePytania = new ArrayList<>();


    }


}