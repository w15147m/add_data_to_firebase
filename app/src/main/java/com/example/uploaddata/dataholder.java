package com.example.uploaddata;

public class dataholder {

    String name , course , time;

    public dataholder(String name, String course, String time) {
        this.name = name;
        this.course = course;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
