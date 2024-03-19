package com.example.notepadv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<NoteModel> notes = new ArrayList<>();
    NotesAdapter adapter = new NotesAdapter(this, notes);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));



    }

    public void addNewNote(View view) {
        EditText title = findViewById(R.id.title);
        EditText content = findViewById(R.id.content);
        String titleS = title.getText().toString();
        String contentS = content.getText().toString();
        title.setText("");
        content.setText("");


        notes.add(new NoteModel(titleS, contentS));
        adapter.notifyItemInserted(notes.size());
        Toast.makeText(getApplicationContext(),"New Note has been created", Toast.LENGTH_SHORT).show();

    }
}