package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "art")
public class Art {
    // generate unique primary key
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // art will have a title (does not need to be unique, as several may be untitled
    @Column
    private String title;

    // i will want to display a description
    @Column
    private String description;

    // need to link to the art somewhere
    @Column
    private String link;


    /*
    * TODO
    *  join with song table
    *  each song will be associated with a single piece of art
    *  but art can be associated with multiple songs
    * */

    // getters and setters


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
