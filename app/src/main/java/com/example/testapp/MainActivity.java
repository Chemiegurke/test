package com.example.testapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        TextView text = new TextView(this);
        text.setText("Zähler: 0");
        text.setTextSize(32);
        text.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setText("Klick mich");
        button.setOnClickListener(v -> {
            count++;
            text.setText("Zähler: " + count);
        });

        layout.addView(text);
        layout.addView(button);
        setContentView(layout);
    }
}
