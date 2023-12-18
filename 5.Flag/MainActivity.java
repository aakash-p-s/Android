package com.example.flag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ImageView i1;

    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.imgview);
        sp=findViewById(R.id.spin);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.flags, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String s=parent.getItemAtPosition(position).toString();

                if(s.equals("India"))
                {
                    i1.setImageResource(R.drawable.ind);
                } else if (s.equals("England")) {
                    i1.setImageResource(R.drawable.eng);

                } else if (s.equals("Japan")) {
                    i1.setImageResource(R.drawable.jpn);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            //Do Nothing
            }
        });
    }
}
