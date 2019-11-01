package com.example.multilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.l1);
        setTitle("ListViewShow");
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Android");
        arrayList.add("JavaEE");
        arrayList.add("JSP");
        arrayList.add("JDBC");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
