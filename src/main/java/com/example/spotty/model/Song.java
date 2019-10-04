package com.example.spotty.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Song {
    @Id
    private String id;

    @Indexed(unique = true)
    private String title;

    private String artist;

    private double length;

    public Song(){}

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
