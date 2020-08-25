package com.example.simpletodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
import java.util.ArrayList;
import java.util.list;

    list<String> items;add;
    EditText etitem;
    RecyclerView evitems

     Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnadd=findViewById();
                etitem=findViewById();
                recyclerView rvitems;
        )
        items = new ArrayLists<>();
        items.add("buy eggs");
        items.add("call doctor");
        items.add("go to store");
        items.add("study not party");temsAdapter
        final ItemAdapter ItemAdapter = new ItemAdapter(item);
        rvitems.setAdapter[Adapter][itemAdapter{items};]
        rvitems.LayoutManager(new LinearLayoutManager(context: this));
        btnAdd.setOnClickListener = new ItemAdapter(items};
     Public void Click(View v) {
         string TodoItem = evitem.get Test() Testring();
         items.add(todoItem);

         evitem.settext{***};
    }
}