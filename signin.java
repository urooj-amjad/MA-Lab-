package com.example.kiran.creativehub;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {

    ImageView sback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        sback = (ImageView)findViewById(R.id.sinb);
        sback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(signin.this,main.class);
                startActivity(it);
            }
        });
    }
}
