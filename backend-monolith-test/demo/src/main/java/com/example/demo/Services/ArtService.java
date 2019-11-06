package com.example.demo.Services;

import com.example.demo.Models.Art;

public interface ArtService {
    // need method to list all art
    public Iterable<Art> listAllArt();

    // need method to create an art entry
    public Art addArt(Art art);

    // need method to delete art by its unique id
    public void deleteArtById(Long artId);
}
