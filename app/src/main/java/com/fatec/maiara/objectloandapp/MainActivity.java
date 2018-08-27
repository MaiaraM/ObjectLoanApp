package com.fatec.maiara.objectloandapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        items = new ArrayList<>();
        items.add(new Item("José", "Livro de Android", "27/08/2013"));
        items.add(new Item("Veck", "Oculos", "27/08/2013"));

        recyclerView.setAdapter(new ItemAdapter(items, this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
}
