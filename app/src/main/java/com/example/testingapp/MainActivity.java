package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String Message="com.example.testingapp.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageView rocketImage = (ImageView) findViewById(R.id.imageView11);

        rocketImage.setBackgroundResource(R.drawable.rocket);

        Drawable rocketAnimation = rocketImage.getBackground();
        if (rocketAnimation instanceof Animatable) {
            ((Animatable)rocketAnimation).start();
        }
    }

    public void sendMessage(View view)
    {

        Intent intent=new Intent(this,DisplayMessageActivity.class);
        EditText editText=findViewById(R.id.txtMessage);
        String msg=editText.getText().toString();
        intent.putExtra(Message,msg);
        startActivity(intent);



    }
}