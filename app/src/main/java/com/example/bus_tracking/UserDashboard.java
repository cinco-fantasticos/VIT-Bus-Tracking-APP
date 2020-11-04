package com.example.bus_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class UserDashboard extends AppCompatActivity {
    Button tracker, schedule, profile_setting, calender, help_desk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        // Hooks
        tracker = findViewById(R.id.tracker);
        schedule = findViewById(R.id.schedule);
        profile_setting = findViewById(R.id.profile_setting);
        calender = findViewById(R.id.calender);
        help_desk = findViewById(R.id.help_desk);

        tracker.setOnClickListener((View) -> {
             // tracker page google map API
        });

        schedule.setOnClickListener( (View) -> {
            // schedule page
        });

        profile_setting.setOnClickListener( (View) -> {
            Intent intent = new Intent(UserDashboard.this,Profile_setting.class);
            startActivity(intent);
        });

        calender.setOnClickListener( (View) -> {
            Intent intent = new Intent(UserDashboard.this,Calender.class);
            startActivity(intent);
        });

        help_desk.setOnClickListener( (View) -> {
            Intent intent = new Intent(UserDashboard.this,Help_Desk.class);
            startActivity(intent);
        });

    }
}