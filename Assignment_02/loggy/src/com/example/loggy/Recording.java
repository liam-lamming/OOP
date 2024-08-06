package com.example.loggy;

public class Recording {
    private int id;
    private String media;
    private int length;
    private String closedCaptioning;

    public Recording(int id, String media, int length) {
        this.id = id;
        this.media = media;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public String getMedia() {
        return media;
    }

    public int getLength() {
        return length;
    }

    public String getClosedCaptioning() {
        return closedCaptioning;
    }

    public void setClosedCaptioning(String closedCaptioning) {
        this.closedCaptioning = closedCaptioning;
    }

    @Override
    public String toString() {
        return "Recording{" +
                "id=" + id +
                ", media='" + media + '\'' +
                ", length=" + length +
                ", closedCaptioning='" + closedCaptioning + '\'' +
                '}';
    }
}
