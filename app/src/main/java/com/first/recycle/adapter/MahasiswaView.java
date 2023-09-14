package com.first.recycle.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.first.recycle.R;
public class MahasiswaView extends RecyclerView.ViewHolder{

    ImageView txtimg;
    TextView txtnama, txtnim, txtnohp;

    public MahasiswaView(@NonNull View itemView) {

        super(itemView);
        txtimg = itemView.findViewById(R.id.edt_img);
        txtnama = itemView.findViewById(R.id.edt_nama);
        txtnim = itemView.findViewById(R.id.edt_nim);
        txtnohp = itemView.findViewById(R.id.edt_nohp);

    }
}
