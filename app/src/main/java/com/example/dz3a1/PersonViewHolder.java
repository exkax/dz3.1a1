package com.example.dz3a1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    private TextView namePerson;
    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
        namePerson = itemView.findViewById(R.id.name);
    }
    public void onBind(Model name){
        namePerson.setText(name.getName().toString());
    }
}