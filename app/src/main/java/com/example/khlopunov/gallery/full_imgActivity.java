package com.example.khlopunov.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class full_imgActivity extends AppCompatActivity {

    private ImageView fullImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_img);

        fullImg = (ImageView) findViewById(R.id.full_img);

        Intent intent = getIntent();
        Integer img = intent.getIntExtra("img", 0);
        fullImg.setImageDrawable(getResources().getDrawable(img));

    }
}
