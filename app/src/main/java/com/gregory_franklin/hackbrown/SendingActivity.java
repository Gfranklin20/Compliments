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
    public Button sendCompliment;
    public EditText writeCompliment;
    public String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sending);

        writeCompliment = findViewById(R.id.writeCompliment);
        sendCompliment = findViewById(R.id.sendCompliment);
        sendCompliment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(writeCompliment.getText()!=null) {
                    message = writeCompliment.getText().toString();
                }
                Intent intent = new Intent(SendingActivity.this, AfterSend.class);
                intent.putExtra("MESSAGE", message);
                startActivity(intent);
            }

        });




    }
}
