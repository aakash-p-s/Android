package com.example.icecream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner) findViewById(R.id.spinnerid);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.icecreams, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }

    public void nextActivity(View view) {
        String flavor=sp.getSelectedItem().toString();

        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        i.putExtra("Result",flavor);
        startActivity(i);
    }
}
