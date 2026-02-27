package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_city);
        Button backButton = findViewById(R.id.button_back);

        // Get city name from intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("CITY_NAME");

        cityText.setText(cityName);

        // Back button
        backButton.setOnClickListener(v -> finish());
    }
}