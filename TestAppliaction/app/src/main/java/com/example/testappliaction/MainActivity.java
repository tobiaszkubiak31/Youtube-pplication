package com.example.testappliaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int seconds=0;
    boolean running=true;
    boolean wasRun=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRun = savedInstanceState.getBoolean("wasRun");

        }
        runTimer();
    }

    private void runTimer() {

        final TextView timeView = (TextView)findViewById(R.id.editText);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }


    // Metoda onSendMessage() jest wywoływana po kliknięciu przycisku
    public void onSendMessage(View view) {
        Intent intent = new Intent(this, Reveiver.class);


        //String mess = (String)t.getText().toString();
        //intent.putExtra(Reveiver.EXTRA_MESSAGE,mess);

        startActivity(intent);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRun", wasRun);
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRun=running;
        running = false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(wasRun)
        running = true;
    }
}
