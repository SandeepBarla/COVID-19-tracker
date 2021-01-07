package com.ece3999.j_comp.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;


public class SplashActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        text = findViewById(R.id.textView);
        text.setText("                  Done By\n17BIS0112 Sandeep Barla \n17BEC0578 ALP AbhiRam\n17BEC0912 Sowrav Singh\n17BEC0172 Maruthi Raju\n17BEC0348 Harshith Reddy\n17BEC0386 Likith");
        String[] para = text.getText().toString().split("\r\n\r\n");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(SplashActivity.this, "Use DARK MODE for Better Experience    ",Toast.LENGTH_SHORT).show();
                Intent mySuperIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mySuperIntent);
                finish();

            }
        },2000);
    }
}
