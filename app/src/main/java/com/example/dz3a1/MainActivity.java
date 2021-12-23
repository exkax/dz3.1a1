package com.example.dz3a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> names = new ArrayList<>();
    private ItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadDate();
        adapter = new ItemAdapter(names);
        recyclerView.setAdapter(adapter);
    }
    private  void loadDate(){
        names.add(new Model(R.drawable.ic_person_24, "Diana \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Bilal \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Zhypariza \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Nazmina \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Ayperi \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Kauhar \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Aruuke \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Asel' \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Beka \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Azamat \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"El'han \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Aliya \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Tynysh \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"El'nura \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Bermet \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Nurizat \n +996(709)109-691"));
        names.add(new Model(R.drawable.ic_person_24,"Tugol \n +996(709)109-691"));


    }
}