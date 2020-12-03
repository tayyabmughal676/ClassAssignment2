package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    //   Array of strings...
    String[] mobileArray = {
            "Android",
            "IPhone",
            "WindowsMobile",
            "Blackberry",
            "WebOS",
            "Ubuntu",
            "Windows7",
            "Max OS X"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView mListView = findViewById(R.id.myListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                mobileArray
        );

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Clicked: " + mobileArray[position], Toast.LENGTH_SHORT).show();
        });
    }
}