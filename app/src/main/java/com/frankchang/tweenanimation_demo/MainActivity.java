package com.frankchang.tweenanimation_demo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.showImage);
    }

    public void rotateOnClick(View view) {
        setAminationRec(this, R.anim.anim_rotate);
    }

    public void translateOnClick(View view) {
        setAminationRec(this, R.anim.anim_translate);
    }

    public void scaleOnClick(View view) {
        setAminationRec(this, R.anim.anim_scale);
    }

    public void alphaOnClick(View view) {
        setAminationRec(this, R.anim.anim_alpha);

        // 另一種採用程碼控制的方法
        /*AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.1f);
        alphaAnimation.setDuration(5000);
        show.startAnimation(alphaAnimation);*/
    }

    private void setAminationRec(Context context, int rec) {
        Animation anim = AnimationUtils.loadAnimation(context, rec);
        show.startAnimation(anim);
    }
}
