package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Songs {

    // generate unique primary key
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // title of song
    @Column
    private String title;

    // artist of song
    @Column
    private String artist;

    // spotify uri
    @Column
    private String uri;

    /*
     * TODO
     *  join with art table
     *  each song will be associated with a single piece of art
     *  but art can be associated with multiple songs
     * */

    // getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
