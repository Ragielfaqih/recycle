package com.first.recycle.adapter;

import com.first.recycle.model.mahasiswa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.first.recycle.R;
import java.util.List;

public class MahasiswaAdapter  extends RecyclerView.Adapter<MahasiswaView>{
    Context context;
    List<mahasiswa> items;

    public MahasiswaAdapter(Context context, List<mahasiswa> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public MahasiswaView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MahasiswaView(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaView holder, int position) {

        holder.txtnama.setText(items.get(position).getNama());
        holder.txtnim.setText(items.get(position).getNim());
        holder.txtnohp.setText(items.get(position).getNohp());
        holder.txtimg.setImageResource(items.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
