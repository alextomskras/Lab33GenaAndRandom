package ru.myitschool.lab33;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

public interface AdapterRecycler {
    void onBindViewHolder(@NonNull AdapterRecyclerImpl.MyViewHolder holder, @SuppressLint("RecyclerView") int position);
}
