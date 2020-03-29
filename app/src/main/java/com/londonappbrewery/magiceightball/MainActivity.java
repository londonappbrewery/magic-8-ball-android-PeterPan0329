package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button shakeButton = findViewById(R.id.button_shake);
        final ImageView ballPicture = findViewById(R.id.imageView_Ball);

        final int[] ball_Array = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randGen = new Random();
                int randNo = randGen.nextInt(4);

                ballPicture.setImageResource(ball_Array[randNo]);
            }
        });
}



}
