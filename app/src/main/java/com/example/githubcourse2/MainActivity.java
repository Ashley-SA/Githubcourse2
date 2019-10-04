package com.example.githubcourse2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {


    //Declaration Button
    Button Lerato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intialization Button

       Lerato = (Button) findViewById(R.id.button);

        Lerato.setOnClickListener(MainActivity.this);
        //Here MainActivity.this is a Current Class Reference (context)
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Lerato.class);
        startActivity(intent);
    }
}

