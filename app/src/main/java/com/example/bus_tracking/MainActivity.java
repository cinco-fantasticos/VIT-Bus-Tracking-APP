package com.example.bus_tracking;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    private final static int SPLASH_SCREEN = 3000;

    // variables
   Animation topAnim,bottomAnim;
   ImageView imageBus,imageVit;
   TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        imageBus = findViewById(R.id.iv_bus);
        imageVit = findViewById(R.id.iv_vit);
        logo = findViewById(R.id.textView2);

        imageBus.setAnimation(topAnim);
        imageVit.setAnimation(bottomAnim);
        logo.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =  new Intent(MainActivity.this,Login_page.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(imageBus,"logo_image");
                pairs[1] = new Pair<View,String>(logo,"logo_text");

                ActivityOptions options  = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,options.toBundle());
                finish();

            }
        }, SPLASH_SCREEN);

    }
}