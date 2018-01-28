package com.gregory_franklin.hackbrown;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AfterSend extends AppCompatActivity {

    public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_send);

        message = getIntent().getStringExtra("MESSAGE");


        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AfterSend.this, HomeActivity.class);
                intent.putExtra("MESSAGE", message);
                startActivity(intent);
            }
        });

        Button sendanother = findViewById(R.id.sendanother);
        sendanother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AfterSend.this, Swipe.class);
                startActivity(intent);
            }

        });
    }

}
