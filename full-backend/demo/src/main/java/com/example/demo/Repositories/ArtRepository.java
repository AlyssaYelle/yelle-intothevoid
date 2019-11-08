package com.example.demo.Repositories;

import com.example.demo.Models.Art;
import com.example.demo.Models.ArtSongObj;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends CrudRepository<Art, Long> {
    // select custom ArtSongObj
    @Query("SELECT new com.example.demo.Models.ArtSongObj(a.title, a.description, a.link, s.title, s.artist, s.uri)" +
            "FROM Songs s JOIN s.art a")
    public Iterable<ArtSongObj> listArtWithSong();
}
