package com.example.notepadv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<NoteModel> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notes.add(new NoteModel("Title 1", "Content 1"));
        notes.add(new NoteModel("Title 2", "Content 2"));
        notes.add(new NoteModel("Title 3", "Content 3  fbhsdbhfbhfhfhfghasfhashfhahfhasfbhsaghfgash bhfasvfhasfh vabfas as"));
        notes.add(new NoteModel("Title 4", "Content 3"));
        notes.add(new NoteModel("Title 5", "Content 3"));
        notes.add(new NoteModel("Title 6", "Content 3"));
        notes.add(new NoteModel("Title 7", "Content 3"));
        notes.add(new NoteModel("Title 8", "Content 3"));
        notes.add(new NoteModel("Title 9", "Content 3"));
        notes.add(new NoteModel("Title 10", "Content 3"));
        notes.add(new NoteModel("Title 11", "Content 3"));
        notes.add(new NoteModel("Title 12", "Content 3"));
        notes.add(new NoteModel("Title 13", "Content 3"));
        notes.add(new NoteModel("Title 14", "Content 3"));
        notes.add(new NoteModel("Title 15", "Content 3"));
        notes.add(new NoteModel("Title 16", "Content 3"));

        RecyclerView rv = findViewById(R.id.recyclerView);
        NotesAdapter adapter = new NotesAdapter(this, notes);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));



    }

    public void addNewNote(View view) {
        notes.add(new NoteModel("New Title", "New Content"));
        Toast.makeText(getApplicationContext(),"Hello Javatpoint", Toast.LENGTH_SHORT).show();
        System.out.println(notes.size());
        // Notes is not re-rendering
    }
}