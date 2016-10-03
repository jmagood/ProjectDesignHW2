package com.example.jmago.secondtryapplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**Called when the user clicks the Send button*/
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessage1.class);
        EditText editText = (EditText) findViewById(R.id.edit_message1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        //Do something in response to button
    }
    public void sendMessage2(View view) {
        Intent intent = new Intent(this, DisplayMessage2.class);
        startActivity(intent);
    }
    public void sendMessage3(View view) {
        Intent intent = new Intent(this, DisplayMessage3.class);
        startActivity(intent);
    }

    public void skipLogin(View view) {
        Intent intent = new Intent(this, NoLogin.class);
        startActivity(intent);
    }
    public void gotoLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}