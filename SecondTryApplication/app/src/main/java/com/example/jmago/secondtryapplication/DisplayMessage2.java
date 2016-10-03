package com.example.jmago.secondtryapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessage2 extends AppCompatActivity {
    public final static String NEW_MESSAGE = "com.example.secondtryapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(60);
        textView.setText(message);

        ViewGroup layout =(ViewGroup) findViewById(R.id.activity_display_message2);
        layout.addView(textView);
    }

    public void sendMessage4(View view) {
        Intent intent = new Intent(this, DisplayMessage4.class);
        EditText editText = (EditText) findViewById(R.id.suggestions);
        String message = editText.getText().toString();
        intent.putExtra(NEW_MESSAGE, message);
        startActivity(intent);
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
