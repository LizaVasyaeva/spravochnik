package com.example.spravochnik;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    String[] SightsNames = {"Эйфелева башня", "Статуя Свободы","Пирамида Хеопса", "Тадж-Махал","Большой каньон"};
    String[] SightsDescriptions = {
            "Эйфелева башня — знаменитая железная башня в Париже, символ Франции.",
            "Статуя Свободы — символ свободы и демократии в Нью-Йорке, США.",
            "Пирамида Хеопса — древняя египетская пирамида в Гизе, одно из чудес света.",
            "Тадж-Махал — мавзолей в Индии, символ любви и красоты.",
            "Большой каньон — природное чудо в США, впечатляющая глубокая ущелье."
    };
    int[] planetImages = {
            R.drawable.bashnya,
            R.drawable.statua,
            R.drawable.piramida,
            R.drawable.tadj,
            R.drawable.kanion,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameText = findViewById(R.id.nameText);
        TextView descriptionText = findViewById(R.id.descriptionText);
        ImageView imageView = findViewById(R.id.imageView);

        String name = getIntent().getStringExtra("name");
        int index = -1;
        for (int i=0; i<SightsNames.length; i++) {
            if (SightsNames[i].equals(name)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            nameText.setText(SightsNames[index]);
            descriptionText.setText(SightsDescriptions[index]);
            imageView.setImageResource(planetImages[index]);
        }
    }
}