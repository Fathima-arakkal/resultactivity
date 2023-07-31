package com.example.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayResultActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        textViewResult = findViewById(R.id.textViewResult);

        // Get the result passed from the first activity
        int result = getIntent().getIntExtra("result", 0);

        // Display the result
        textViewResult.setText("Result: " + result);
    }
}
