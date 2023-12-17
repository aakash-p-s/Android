package com.example.icecream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView p1;
    TextView p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        p1 = findViewById(R.id.imgview);
        p2=findViewById(R.id.txtview);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String flavor = extras.getString("Result");

            if ("Chocolate".equals(flavor)) {
                p1.setImageResource(R.drawable.c);
                p2.setText("Price:120$");
            }
            if ("Vanila".equals(flavor)) {
                p1.setImageResource(R.drawable.v);
                p2.setText("Price:110$");
            }
            if ("Strawberry".equals(flavor)) {
                p1.setImageResource(R.drawable.s);
                p2.setText("Price:100$");
            }
        }
    }


            public void previous (View view){
                Intent j = new Intent(this, MainActivity.class);
                startActivity(j);
            }

}
