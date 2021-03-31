package com.example.taskms.module;


import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.taskms.R;
import com.example.taskms.module.model.ListModel;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private ArrayList<ListModel> list;
    private Context context;
    private IRecyclerViewItemClick iRecyclerViewClick;

    public ListAdapter(ArrayList<ListModel> listArr, Context context, IRecyclerViewItemClick iRecyclerViewClick) {
        this.list = listArr;
        this.context = context;
        this.iRecyclerViewClick = iRecyclerViewClick;
    }

    public void notifyChange(ArrayList<ListModel> listArr) {
        this.list = listArr;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        ListModel results = list.get(holder.getAdapterPosition());
        holder.name.setText(results.getName());
        holder.desc.setText(results.getDescription());
        if (results.getOwner() != null) {
            Glide.with(context).setDefaultRequestOptions(new RequestOptions().error(R.drawable.ic_no_image)).load(results.getOwner().getAvatar_url()).into(holder.image);
        } else {
            Glide.with(context).load(R.drawable.ic_no_image).into(holder.image);
        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView desc;
        private ImageView image;

        ViewHolder(View v) {
            super(v);
            name = v.findViewById(R.id.name);
            desc = v.findViewById(R.id.desc);
            image = v.findViewById(R.id.image);


            v.findViewById(R.id.layout).setOnClickListener(view -> iRecyclerViewClick.click(getAdapterPosition()));
        }
    }

}