package com.example.slowka;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rand = new Random();
    private ArrayList<Slowo> slowa =  new ArrayList<>();
    private Slowo aktualneSlowo;

    private TextView text;
    private Button enBtn;
    private Button esBtn;
    private Button deBtn;
    private Button plBtn;
    private Button generateBtn;


    private Slowo generateWord() {
        int rozmiar = slowa.size();
        int random = rand.nextInt(0, rozmiar-1);
        return slowa.get(random);
    }

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
        generateBtn = findViewById(R.id.generate);
        text = findViewById(R.id.text);

        slowa.add(new Slowo("Hola", Jezyk.HISZPANSKI));
        slowa.add(new Slowo("Czesc", Jezyk.POLSKI));
        slowa.add(new Slowo("Hi", Jezyk.ANGIELSKI));
        slowa.add(new Slowo("Halo", Jezyk.NIEMIECKI));
        slowa.add(new Slowo("Manzana", Jezyk.HISZPANSKI));
        slowa.add(new Slowo("Jablko", Jezyk.POLSKI));
        slowa.add(new Slowo("Apfel", Jezyk.NIEMIECKI));
        slowa.add(new Slowo("Apple", Jezyk.ANGIELSKI));

        generateBtn.setOnClickListener(view -> {
            aktualneSlowo = generateWord();
            text.setText(aktualneSlowo.getWord());
        });
    }
}