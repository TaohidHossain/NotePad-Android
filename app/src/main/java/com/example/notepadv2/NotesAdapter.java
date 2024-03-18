package com.example.notepadv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.myViewHolder> {
    Context context;
    ArrayList<NoteModel> notes;
    public NotesAdapter(Context context, ArrayList<NoteModel> notes){
        this.context = context;
        this.notes = notes;
    }
    @NonNull
    @Override
    public NotesAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        return new NotesAdapter.myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesAdapter.myViewHolder holder, int position) {
        holder.tv_2.setText(notes.get(position).getTitle());
        holder.tv_3.setText(notes.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder{
        TextView tv_2, tv_3;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_2 = itemView.findViewById(R.id.textView2);
            tv_3 = itemView.findViewById(R.id.textView3);
        }
    }
}
