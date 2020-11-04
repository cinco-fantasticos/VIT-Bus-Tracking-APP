package com.example.bus_tracking;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    int state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }
    public void onRadioButtonClicked(View view){
        boolean check = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.driver:
                if(check) state = 0;
                break;
            case R.id.Student:
                if(check) state = 1;
                break;
        }
        return;
    }
}