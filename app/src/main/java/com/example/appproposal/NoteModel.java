package com.example.appproposal;

public class NoteModel {
    private String id;
    private String verse;
    private String note;

    public NoteModel() {
        // Default constructor required for Firebase
    }

    public NoteModel(String id, String verse, String note) {
        this.id = id;
        this.verse = verse;
        this.note = note;
    }

    // Getters and setters for NoteModel fields
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
