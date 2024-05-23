package com.example.appproposal;

public class DevotionModel {
    private String id;
    private String verse;
    private String opinion;
    private String application;
    private String prayer;

    public DevotionModel() {
        // Default constructor required for Firebase
    }

    public DevotionModel(String id, String verse, String opinion, String application, String prayer) {
        this.id = id;
        this.verse = verse;
        this.opinion = opinion;
        this.application = application;
        this.prayer = prayer;
    }

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

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getPrayer() {
        return prayer;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
    }
}
