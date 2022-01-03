package com.example.myapplication;

public class ModelClass {
    private int image;
    private String name;
    private String date;
    private String time;
    private String line;

    public ModelClass(int image, String name, String date, String time, String line) {
        this.image = image;
        this.name = name;
        this.date = date;
        this.time = time;
        this.line = line;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLine() {
        return line;
    }
}
