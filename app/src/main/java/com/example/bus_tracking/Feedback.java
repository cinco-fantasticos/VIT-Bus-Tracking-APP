package com.example.bus_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Feedback extends AppCompatActivity {
    private EditText name, content;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        // Hooks
        name = findViewById(R.id.name);
        content = findViewById(R.id.feedback_form);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/html");
                intent.putExtra(Intent.EXTRA_EMAIL,new String("ujjwalpandey408@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback Form from Bus-Tracker");
                intent.putExtra(Intent.EXTRA_TEXT,"Name : " + name.getText() + "\n" + "Message : " + content.getText() + "\n");
                try {
                    startActivity(Intent.createChooser(intent, "Please Select Email"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Feedback.this, "Unable to send", Toast.LENGTH_SHORT);
                }

            }
        });
    }
}