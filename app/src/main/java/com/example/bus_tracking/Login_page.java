package com.example.bus_tracking;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;

@SuppressWarnings("ALL")
public class Login_page extends AppCompatActivity {
    Button callSignUp, login_btn;
    ImageView image;
    TextView logoText, sloganText;
    TextInputLayout username, password;
    int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_page);

        // Hooks
        image = findViewById(R.id.logo_image);
        logoText = findViewById(R.id.logo_name);
        sloganText = findViewById(R.id.slogan);
        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        login_btn = findViewById(R.id.login_btn);

        callSignUp = findViewById(R.id.signup_screen); // This is taken from the button( id : signup_screen form the xml file)
        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Login_page.this,SignUp.class);
                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(image,"logo_image");
                pairs[1] = new Pair<View,String>(logoText,"logo_text");
                pairs[2] = new Pair<View,String>(sloganText,"logo_desc");
                pairs[3] = new Pair<View,String>(username,"username_tran");
                pairs[4] = new Pair<View,String>(password,"password_tran");
                pairs[5] = new Pair<View,String>(login_btn,"button_tran");
                pairs[6] = new Pair<View,String>(callSignUp,"login_signup_tran");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login_page.this,pairs);
                startActivity(intent,options.toBundle());

            }

        });

        login_btn.setOnClickListener((view) -> {
                System.out.println(status);
                if(status == 2){
                    Intent intent = new Intent(Login_page.this,UserDashboard.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Login_page.this, DriverDashboard.class);
                    startActivity(intent);
                }
        });

    }
    public void onRadioButtonClicked(View view){
        boolean check = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.driver:
                if(check) status = 1;
                break;
            case  R.id.Student:
                if(check) status = 2;
                break;

        }
        return ;
    }
}