package ru.myitschool.lab33;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter {
    ArrayList personNames;

    Context context;
    public CustomAdapter(Context context, ArrayList personNames) {
        this.context = context;
        this.personNames = personNames;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_line, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder  holder, int position) {

    }

//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//    }
    @Override
    public int getItemCount() {
        return 0;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;// init the item view's
        public MyViewHolder(View itemView) {
            super(itemView);

// get the reference of item view's
            textView = (TextView) itemView.findViewById(R.id.random_number_result);
        }
    }
}

//public  class CustomAdapter<ViewHolder> extends RecyclerView.Adapter {
//    ArrayList personNames;
//    Context context;
//    public CustomAdapter(Context context, ArrayList personNames) {
//        this.context = context;
//        this.personNames = personNames;
//    }
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        // infalte the item Layout
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_line, parent, false);
//        // set the view's size, margins, paddings and layout parameters
//        RecyclerView.ViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
//        return vh;
//    }
//
//
//
//
//
//    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
//        // set the data in items
//        holder.name.setText((CharSequence) personNames.get(position));
//        // implement setOnClickListener event on item view.
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // display a toast with person name on item click
//                Toast.makeText(context, (CharSequence) personNames.get(position), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//    @Override
//    public int getItemCount() {
//        return personNames.size();
//    }
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView name;// init the item view's
//        public MyViewHolder(View itemView) {
//            super(itemView);
//            // get the reference of item view's
//            name = (TextView) itemView.findViewById(R.id.random_number_result);
//        }
//    }
//}
