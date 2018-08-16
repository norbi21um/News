package com.example.android.news;

/**
 * Created by norbi21um on 2018. 08. 13..
 */

public class News {

    private String title;
    private String author;
    private String section;
    private String date;
    private String url;

    public News(String title, String author, String section, String date, String url) {
        this.title = title;
        this.author = author;
        this.section = section;
        this.date = date;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSection() {
        return section;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
