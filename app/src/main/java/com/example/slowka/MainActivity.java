package com.example.slowka;

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


    private ArrayList<Word> words =  new ArrayList<>();

    private TextView text;
    private Button enBtn;
    private Button esBtn;
    private Button deBtn;
    private Button plBtn;
    private Button generateBtn;




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

        enBtn = findViewById(R.id.btnEnglish);
        esBtn = findViewById(R.id.btnSpanish);
        deBtn = findViewById(R.id.btnDeuth);
        plBtn = findViewById(R.id.btnPolski);
        enBtn = findViewById(R.id.generate);



    }
}