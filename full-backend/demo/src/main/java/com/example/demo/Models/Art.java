package com.example.demo.Models;


import javax.persistence.*;
import java.util.List;

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



    // one to many relationship between art and songs
    @OneToMany(
            mappedBy = "art",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Songs> songs;


    public Art(){}

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
