package com.example.alice.animation_graphics;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * Frame by frame animation
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        final ImageView imgRunner =(ImageView) findViewById(R.id.imgVRunner);
//        imgRunner.setBackgroundResource(R.drawable.my_frame_animation);
//        imgRunner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("runner", "click");
//                AnimationDrawable animationDrawable = (AnimationDrawable) imgRunner.getBackground();
//                if (animationDrawable!=null) {
//                    animationDrawable.start();
//                }else
//                    Log.e("runner","error");
//            }
//        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView iv = (ImageView) findViewById(R.id.imgVRunner);
        iv.setBackgroundResource(R.drawable.my_frame_animation);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable anim = (AnimationDrawable) iv.getBackground();
                anim.start();
            }
        });
    }
}
