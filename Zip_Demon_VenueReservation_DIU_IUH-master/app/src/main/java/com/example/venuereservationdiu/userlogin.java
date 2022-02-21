package com.example.venuereservationdiu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userlogin extends AppCompatActivity {

    Button userBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        userBtn = findViewById(R.id.userLoginBtn);
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userlogin.this, venueOption.class);
                startActivity(intent);
            }
        });
    }
}