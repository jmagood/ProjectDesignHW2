package com.example.jmago.secondtryapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message1);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(60);
        textView.setText(message);

        ViewGroup layout =(ViewGroup) findViewById(R.id.activity_display_message1);
        layout.addView(textView);

    }
    @Override
    protected void onResume() {
        //TODO auto-generated method stub
        super.onResume();
    }
    @Override
    protected void onStart() {
        //TODO auto-generated method stub
        super.onStart();
    }
    @Override
    protected void onPause() {
        //TODO auto-generated method stub
        super.onPause();
    }
    @Override
    protected void onStop() {
        //TODO auto-generated method stub
        super.onStop();
    }
    @Override
    protected void onRestart() {
        //TODO auto-generated method stub
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        //TODO auto-generated method stub
        super.onDestroy();
    }

}

