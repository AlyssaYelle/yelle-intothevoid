package com.example.demo.Models;

public class ArtSongObj {

    public String artTitle;
    public String artDesc;
    public String artLink;
    public String songTitle;
    public String songArtist;
    public String songUri;

    public ArtSongObj(String artTitle, String artDesc, String artLink, String songTitle, String songArtist, String songUri) {
        this.artTitle = artTitle;
        this.artDesc = artDesc;
        this.artLink = artLink;
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songUri = songUri;
    }

    // getter methods

    public String getArtDesc() {
        return artDesc;
    }

    public String getArtLink() {
        return artLink;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongUri() {
        return songUri;
    }

    // setter methods

    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc;
    }

    public void setArtLink(String artLink) {
        this.artLink = artLink;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setSongUri(String songUri) {
        this.songUri = songUri;
    }
}
