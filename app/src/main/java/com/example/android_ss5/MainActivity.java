package com.example.android_ss5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buoc1: DataSource
        final String[] datas = {"SAMSUNG", "LG", "SONY", "MOTOROLA", "IPHONE", "NOKIA"};

        //buoc2: Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
        //buoc3: ListView
        ListView lvContact = findViewById(R.id.lvContact);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String data = datas[position];
                Toast.makeText(MainActivity.this, data,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}