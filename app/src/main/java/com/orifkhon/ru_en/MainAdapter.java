package com.orifkhon.ru_en;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.platform.Hold;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<Slovari > dataList;
    private Activity context;
    private RoomDB database;
public MainAdapter(Activity context){
    this.context= context;
    this.dataList = dataList;
    notifyDataSetChanged();
}


    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item,parent,false);
        RecyclerView.ViewHolder viewHolder =new ViewHolder(view);
        return (ViewHolder) viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Инициализировать main data
        Slovari data =  dataList.get(position);
        //Инициализировать  database
        database =RoomDB.getInstance(context);

        //Установить текст в text view
        holder.textView_ru.setText( data.getRus());
        holder.textView_ru.setText( data.getEng());
         }



    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView_ru;
        TextView textView_en;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_ru=itemView.findViewById(R.id.item_ru);
            textView_en=itemView.findViewById(R.id.item_eng);
        }
    }
}





