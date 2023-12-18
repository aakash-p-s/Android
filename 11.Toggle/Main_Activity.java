package com.example.toggle;


import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView stateTextView;

    RelativeLayout myRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        stateTextView = findViewById(R.id.stateTextView);
        myRelativeLayout = findViewById(R.id.idv);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    stateTextView.setText("Toggle State: ON");
                    myRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Red));
                    //myRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.Red));
                } else {stateTextView.setText("Toggle State: OFF");
                    myRelativeLayout.setBackgroundResource(R.drawable.female_image);
                }
            }
        });
    }
}
