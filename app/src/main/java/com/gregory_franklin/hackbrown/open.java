package com.gregory_franklin.hackbrown;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.file.OpenOption;

public class open extends AppCompatActivity {

    public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        message = getIntent().getStringExtra("MESSAGE");

        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(message);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(open.this, Read.class);
                startActivity(intent);
            }

        });

    }

}
