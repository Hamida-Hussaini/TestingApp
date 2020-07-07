package com.example.testingapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class DisplayMessageActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();
        String msg=intent.getStringExtra(MainActivity.Message);

        TextView textView=findViewById(R.id.textView);

        Locale primaryLocale = this.getResources().getConfiguration().getLocales().get(0);
        String locale = primaryLocale.getDisplayName();

        textView.setText(locale);


    }
}