package com.example.bus_tracking;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class Profile_setting extends AppCompatActivity {
    private Button update;
    private TextInputEditText name, email, password, phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setting);

        //Hooks
        update = findViewById(R.id.update);
        name = findViewById(R.id.pro_name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phone = findViewById(R.id.P_NO);

        update.setOnClickListener( (View) -> {
            if(isEmpty(name) || isEmpty(email) || isEmpty(password) || isEmpty(phone)){
                // Toast is not working.
                Toast.makeText(getApplicationContext(), "Empty Feild Not accepted", Toast.LENGTH_SHORT);
            } else {
                // save the data to the database.
            }
        });

    }
    private boolean isEmpty(TextInputEditText etext){
        System.out.println(Objects.requireNonNull(etext.getText()).toString());
        return Objects.requireNonNull(etext.getText()).toString().trim().length() == 0;
    }
}