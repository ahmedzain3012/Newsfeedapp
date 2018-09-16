package com.example.android.az.newsfeedapp;

public class News {
    private String mSection;
    private String mTitle;
    private String mUrl;

    public News(String mSection, String mTitle, String mUrl) {
        this.mSection = mSection;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }
}

