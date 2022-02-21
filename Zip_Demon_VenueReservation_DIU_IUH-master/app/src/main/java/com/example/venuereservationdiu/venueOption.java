package com.example.venuereservationdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class venueOption extends AppCompatActivity {

    Button venueConf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_option);

        venueConf = findViewById(R.id.venueConfirmBtn);
        venueConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(venueOption.this, confirm.class);
                startActivity(intent);
            }
        });
    }
}