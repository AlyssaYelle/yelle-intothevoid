package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    // unique username
    @Column(unique = true)
    private String username;

    // password
    @Column
    private String password;

    // getters and setters

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
