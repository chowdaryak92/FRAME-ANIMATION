package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.b1);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             ImageView imageView=(ImageView)findViewById(R.id.i1);
             imageView.setImageResource(R.drawable.animationlist);
             AnimationDrawable animationDrawable=(AnimationDrawable)imageView.getDrawable();
             animationDrawable.start();
         }
     });
    }
}
