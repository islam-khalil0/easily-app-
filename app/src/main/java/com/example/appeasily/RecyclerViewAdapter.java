package com.example.appeasily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.salesViewHolder> {


    Context context ;
    ArrayList<FrameTheSales>MyFrameTheSales ;


    public RecyclerViewAdapter(Context context, ArrayList<FrameTheSales> myFrameTheSales) {
        this.context = context;
        MyFrameTheSales = myFrameTheSales;
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.salesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_recyclerview,null,false);
        salesViewHolder salesViewHolder = new salesViewHolder(view);
        return salesViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.salesViewHolder holder, int position) {
        FrameTheSales fm = MyFrameTheSales.get(position);
        holder.textView.setText(fm.getSales_text());
        holder.imageView.setImageResource(fm.getSales_images());

    }

    @Override
    public int getItemCount() {
        return MyFrameTheSales.size();
    }


    public class salesViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView ;
        TextView textView ;

        public salesViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img_sale);
            textView = (TextView) itemView.findViewById(R.id.text_sale);

        }
    }



}

