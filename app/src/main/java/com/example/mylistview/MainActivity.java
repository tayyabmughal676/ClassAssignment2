package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mLView = findViewById(R.id.myListViewBtn);
        Button mGView = findViewById(R.id.myGridViewBtn);
        Button mSpin = findViewById(R.id.mySpinnerBtn);

        mLView.setOnClickListener(v -> {
            Intent lv = new Intent(this, ListViewActivity.class);
            startActivity(lv);

        });
        mGView.setOnClickListener(v -> {
            Intent gv = new Intent(this, GridViewActivity.class);
            startActivity(gv);

        });
        mSpin.setOnClickListener(v -> {
            Intent spin = new Intent(this, SpinnerActivity.class);
            startActivity(spin);

        });
    }
}