package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class GridViewActivity extends AppCompatActivity {

    static final String[] numbers = new String[]{
            "IronMan",
            "Thor",
            "Captain Pakistan",
            "Wolverine",
            "Kamala Khan",
            "Winter Soldier",
            "Thunder"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView mGridView = findViewById(R.id.myGridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);
        mGridView.setAdapter(adapter);

        mGridView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Clicked:" + numbers[position], Toast.LENGTH_SHORT).show();
        });
    }
}