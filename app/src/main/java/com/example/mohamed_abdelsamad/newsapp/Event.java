package com.example.mohamed_abdelsamad.newsapp;

/**
 * Created by mohamed_abdelsamad on 25/09/18.
 */

public class Event {
    private String title;
    private String type;
    private String date;
    private String cont;
    private String Url;

    public Event(String title, String type, String date, String cont, String Url) {
        this.title = title;
        this.type = type;
        this.date = date;
        this.cont = cont;
        this.Url = Url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getCont() {
        return cont;
    }

    public String getUrl() {
        return Url;
    }
}