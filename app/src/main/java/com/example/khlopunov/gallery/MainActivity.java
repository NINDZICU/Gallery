package com.example.khlopunov.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Integer> pictures= new ArrayList<>();
    private ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this, 2));

        pictures.add(R.drawable.minions);
        pictures.add(R.drawable.water);
        pictures.add(R.drawable.bug);
        pictures.add(R.drawable.moon);
        pictures.add(R.drawable.car);
        pictures.add(R.drawable.grass);
        pictures.add(R.drawable.ship);
        pictures.add(R.drawable.space);
        pictures.add(R.drawable.trees);
        pictures.add(R.drawable.ufo);
        pictures.add(R.drawable.siyanie);
        pictures.add(R.drawable.wolf);
        pictures.add(R.drawable.dog);

        adapter = new ImageAdapter(MainActivity.this, pictures);
        rv.setAdapter(adapter);

        adapter.setListener(new OnItemClick() {
            @Override
            public void OnItemClick(Integer picture) {
                Intent intent = new Intent(MainActivity.this, full_imgActivity.class);
                intent.putExtra("img", picture);
                startActivity(intent);
            }
        });
    }
}
