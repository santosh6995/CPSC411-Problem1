package com.example.problem1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenbActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_screenb);
        String l1;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                l1= null;
            } else {
                l1= extras.getString("level");
            }
        } else {
            l1= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }


        int count = Integer.parseInt(l1);
        Button btn;
        LinearLayout ll = (LinearLayout)findViewById(R.id.ly1);


        String temp = "";
        TextView pattern = (TextView) findViewById(R.id.text1);

        for(int i=0; i<count; i++)
        {
            String t = "";
            for(int j=0; j<=i; j++)
            {
                t = t + "*";
            }
            temp = temp + t + "\n";
        }

        pattern.setText(temp);




    }
}
