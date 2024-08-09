package com.rozogar.englishsongs.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.rozogar.englishsongs.R;

public class MainActivity extends AppCompatActivity {
    private Button btnSong;
    private Button btnAbout;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();

        btnSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(song);
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Programer: Ahmad Rozogar 1403/5/17 ", Toast.LENGTH_SHORT).show();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


    }

    private void setupView() {
        btnSong = findViewById(R.id.btnSong);
        btnAbout = findViewById(R.id.btnAbout);
        btnExit = findViewById(R.id.btnEixt);
    }
}