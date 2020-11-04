package com.example.bus_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Help_Desk extends AppCompatActivity {
    private Button contact, feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help__desk);

        // Hooks

        contact = findViewById(R.id.contact);
        feedback = findViewById(R.id.feedback);

        contact.setOnClickListener( (View) -> {
            // save the contact registry here
        });

        feedback.setOnClickListener( (View) -> {
            Intent intent = new Intent(Help_Desk.this,Feedback.class);
            startActivity(intent);
        });
    }

}