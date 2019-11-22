package com.example.testappliaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Reveiver extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveiver);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.textView2);
        messageView.setText(messageText);

    }

    public void onSendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        //TextView t = (TextView)findViewById(R.id.editText);
        //String mess = (String)t.getText().toString();
        //intent.putExtra(Reveiver.EXTRA_MESSAGE,mess);
        startActivity(intent);
    }

}
