package com.example.bus_tracking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Calender extends AppCompatActivity {
    private static final String TAG = "CalenderActivity";
    private CalendarView mcalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        mcalView = (CalendarView) findViewById(R.id.CalenderView);
        mcalView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String data = year + "/" + month + "/" + dayOfMonth;
                Intent intent = new Intent(Calender.this,UserDashboard.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });


    }
}