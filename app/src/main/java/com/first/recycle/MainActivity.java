package com.first.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;

import com.first.recycle.adapter.MahasiswaAdapter;
import com.first.recycle.model.mahasiswa;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycleView = findViewById(R.id.recyclerview);
        List<mahasiswa> items = new ArrayList<mahasiswa>();

        items.add(new mahasiswa("John wick 1","999","089489",R.drawable.a));


        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(new MahasiswaAdapter(getApplicationContext(),items));
    }
}