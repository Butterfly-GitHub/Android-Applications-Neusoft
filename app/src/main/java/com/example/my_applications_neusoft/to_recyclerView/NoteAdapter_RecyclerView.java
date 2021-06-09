package com.example.my_applications_neusoft.to_recyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_applications_neusoft.R;

import java.util.List;


public class NoteAdapter_RecyclerView extends RecyclerView.Adapter<NoteAdapter_RecyclerView.NoteHolder_RecyclerView> {
    Context context;
    List<NoteBean_RecyclerView> datas_bean_recyclerView;

    public NoteAdapter_RecyclerView(Context context, List<NoteBean_RecyclerView> datas_bean_recyclerView) {
        this.context = context;
        this.datas_bean_recyclerView = datas_bean_recyclerView;
    }

    @NonNull
    @Override
    public NoteHolder_RecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_note, parent, false);
        NoteHolder_RecyclerView noteHolder_recyclerView = new NoteHolder_RecyclerView(view);
        return noteHolder_recyclerView;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder_RecyclerView holder, int position) {
        NoteBean_RecyclerView noteBean_recyclerView = datas_bean_recyclerView.get(position);

        Log.i("LOG -> ", "Here if the onBindViewHolder");

        holder.textView.setText(noteBean_recyclerView.getTextView().toString());

    }

    @Override
    public int getItemCount() {
        return datas_bean_recyclerView.size();
    }

    class NoteHolder_RecyclerView extends RecyclerView.ViewHolder{
        TextView textView;

        public NoteHolder_RecyclerView(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView6);
        }
    }
}
