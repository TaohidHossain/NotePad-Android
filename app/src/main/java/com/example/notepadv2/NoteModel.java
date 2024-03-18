package com.example.notepadv2;

public class NoteModel {
    private String Title;
    private String Content;

    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String getContent() {
        return Content;
    }
    public void setContent(String content) {
        Content = content;
    }
    public NoteModel(String title, String content) {
        Title = title;
        Content = content;
    }
}
