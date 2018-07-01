package com.apptheism.cycleoflife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends LoggingActivity {

    Button btnOpaque;
    Button btnTransparent;

    public MainActivity() {
        setActivityName("MainActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpaque = findViewById(R.id.btnOpaque);
        btnTransparent = findViewById(R.id.btnTransparent);

        btnOpaque.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), OpaqueActivity.class);
            startActivity(intent);
        });

        btnTransparent.setOnClickListener((v) -> {
            Intent intent = new Intent(getApplicationContext(), TransparentActivity.class);
            startActivity(intent);
        });
    }
}


