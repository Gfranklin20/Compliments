package com.gregory_franklin.hackbrown;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SendingActivity extends Activity {
    private Button sendCompliment;
    private EditText writeCompliment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending);
        sendCompliment = findViewById(R.id.sendCompliment);
        writeCompliment = findViewById(R.id.writeCompliment);
        sendCompliment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(sendCompliment, writeCompliment.getText(), Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
