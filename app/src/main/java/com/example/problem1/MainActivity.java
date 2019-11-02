package com.example.problem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen1);







    }

    public void goToActivity (View view){
        EditText a =(EditText) findViewById(R.id.edittext);
        Intent i = new Intent(MainActivity.this,ScreenbActivity.class);
        i.putExtra("level", a.getText().toString());
        startActivity(i);
    }
}
