package com.tldn1.recyclerviewvolley;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by X on 12/25/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    ArrayList<Contact> arrayList = new ArrayList<Contact>();

    public RecyclerAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(view);
        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerHolder holder, int position) {
        Contact contact = arrayList.get(position);
        holder.txtName.setText(contact.getName());
        holder.txtEmail.setText(contact.getEmail());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        TextView txtName,txtEmail;
        public RecyclerHolder(View itemView) {
            super(itemView);
            txtName=(TextView)itemView.findViewById(R.id.txtName);
            txtEmail=(TextView)itemView.findViewById(R.id.txtEmail);

        }
    }
}
