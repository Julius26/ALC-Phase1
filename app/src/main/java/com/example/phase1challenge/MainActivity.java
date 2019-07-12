package com.example.phase1challenge;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    declaring the buttons
    Button mButtonALC,mButtonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ALC Phase 1");
        


        mButtonALC = findViewById(R.id.bt_ALC);
        mButtonProfile = findViewById(R.id.bt_myprofile);


    }

//    onclick for navigation
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bt_ALC:
                startActivity(new Intent(MainActivity.this,AboutAlc.class));
                break;
            case R.id.bt_myprofile:

                startActivity(new Intent(MainActivity.this,MyProfile.class));
        }

    }
}
