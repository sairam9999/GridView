package com.example.sairam.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class Message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView result = (TextView) findViewById(R.id.textView1);

        Intent intent = getIntent();
        result.setText(intent.getStringExtra("data"));

        Button gridbutton = (Button) findViewById(R.id.gridbutton);
        gridbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gridbutton = new Intent(Message.this, com.example.sairam.finalproject.GridView1.class);
                startActivity(gridbutton);
            }
        });

        Button listbutton = (Button) findViewById(R.id.listbutton);
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent listbutton = new Intent(Message.this, com.example.sairam.finalproject.ListViewActivity.class);
                startActivity(listbutton);
            }
        });

        Button homebutton = (Button) findViewById(R.id.homebutton);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homebutton = new Intent(Message.this, com.example.sairam.finalproject.MainActivity.class);
                startActivity(homebutton);
            }
        });
    }
}