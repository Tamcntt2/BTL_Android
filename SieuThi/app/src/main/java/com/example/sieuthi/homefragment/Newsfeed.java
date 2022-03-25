package com.example.sieuthi.homefragment;

public class Newsfeed {

    private int imgPhoto;
    private String title;
    private String time;
    private String shortContent;

    public Newsfeed(int imgPhoto, String title, String time, String shortContent) {
        this.imgPhoto = imgPhoto;
        this.title = title;
        this.time = time;
        this.shortContent = shortContent;
    }

    public int getImgPhoto() {
        return imgPhoto;
    }

    public void setImgPhoto(int imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }
}
