package com.example.appproposal;

public class NoteModel {
    private String id;
    private String date;
    private String title;
    private String context;

    public NoteModel() {
        // Default constructor required for Firebase
    }

    public NoteModel(String id, String date, String title, String context) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.context = context;
    }

    // Getters and setters for NoteModel fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
