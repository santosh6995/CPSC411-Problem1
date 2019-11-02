package com.example.problem1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ScreenAactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen1);







    }

    public void goToActivity (View view){
        /* Page navigation*/
        /*Event Handling from XML file*/
        EditText a =(EditText) findViewById(R.id.edittext);
        Intent i = new Intent(ScreenAactivity.this,ScreenbActivity.class);
        i.putExtra("level", a.getText().toString());
        startActivity(i);
    }
}
