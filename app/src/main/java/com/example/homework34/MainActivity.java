package com.example.homework34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<ProgrammLanguage> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new ProgrammLanguage("Android","https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Android_robot.svg/512px-Android_robot.svg.png"));
        list.add(new ProgrammLanguage("Java","https://upload.wikimedia.org/wikipedia/ru/thumb/3/39/Java_logo.svg/1200px-Java_logo.svg.png"));
        list.add(new ProgrammLanguage("Kotlin","https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin_Icon.png/640px-Kotlin_Icon.png"));
        list.add(new ProgrammLanguage("Html","https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/640px-HTML5_logo_and_wordmark.svg.png"));
        list.add(new ProgrammLanguage("C","https://img2.freepng.ru/20180405/doe/kisspng-the-c-programming-language-computer-programming-co-programmer-5ac6bd83099b97.1672069615229740830394.jpg"));

    }
}