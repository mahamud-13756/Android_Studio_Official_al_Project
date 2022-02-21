package com.example.venuereservationdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirm extends AppCompatActivity {

    Button confirmedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        confirmedBtn = findViewById(R.id.confirmedBtn);
        confirmedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm.this, finallayout.class);
                startActivity(intent);
            }
        });

    }
}