package com.orifkhon.ru_en;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //оснавний компанет
recyclerView=findViewById(R.id.recycler_view);

//Все осталний компанеты для реализатцийй структуры
linearLayoutManager =new LinearLayoutManager(getApplicationContext(),linearLayoutManager.VERTICAL,false);
adapter = new MainAdapter(this);
recyclerView.setLayoutManager(linearLayoutManager);

        //set adapter
        recyclerView.setAdapter(adapter);
recyclerView.setHasFixedSize(true);

    }
}