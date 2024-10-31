package com.example.practos2;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import androidx.recyclerview.widget.RecyclerView;


import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<State> states = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);

    }
    private void setInitialData(){
        states.add(new State("Бразилия","Бразилиа", R.drawable.brazilia));
        states.add(new State("Аргентина","Буэнос-Айрес", R.drawable.arg));
        states.add(new State("Россия","Москва", R.drawable.russia));
    }


}
