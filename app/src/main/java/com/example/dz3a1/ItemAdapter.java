package com.example.dz3a1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private ArrayList<Model> names ;

    public ItemAdapter(ArrayList<Model> names) {
        this.names = names;
    }



    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.
                getContext()).inflate(R.layout.item_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
    holder.onBind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
