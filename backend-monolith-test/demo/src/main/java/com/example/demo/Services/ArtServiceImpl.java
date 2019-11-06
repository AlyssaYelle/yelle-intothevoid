package com.example.demo.Services;

import com.example.demo.Models.Admin;
import com.example.demo.Models.Art;
import com.example.demo.Repositories.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class ArtServiceImpl implements ArtService {

    @Autowired
    ArtRepository artRepository;


    @Override
    public Iterable<Art> listAllArt() {
        return artRepository.findAll();
    }

    @Override
    public Art addArt(Art art) {

        return artRepository.save(art);
    }

    @Override
    public void deleteArtById(Long artId) {
        // find the art entry
        Art art = artRepository.findById(artId).get();

        // now delete it
        artRepository.delete(art);
    }
}
