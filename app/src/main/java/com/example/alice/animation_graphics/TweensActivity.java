package com.example.alice.animation_graphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class TweensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweens);
    }

    public void animateMe(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.tweens_animation);
        view.startAnimation(animation);
    }
}
