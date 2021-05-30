package com.example.recycleviewcustom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;//bridge between recycler view and the array list I have
    private RecyclerView.LayoutManager mLayoutManager;//this manages layout duh
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Example_item> examplelist = new ArrayList<>();
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));
        examplelist.add(new Example_item("5.7","Myaanmar","12-1-1902"));
        examplelist.add(new Example_item("5.4","Nepal","1-11-1952"));
        examplelist.add(new Example_item("4.7","Sikkim","3-11-2013"));
        examplelist.add(new Example_item("7.3","Assam","23-7-1972"));







        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(examplelist);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}