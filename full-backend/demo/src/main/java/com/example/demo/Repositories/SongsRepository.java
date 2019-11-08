package com.example.demo.Repositories;

import com.example.demo.Models.Songs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends CrudRepository<Songs, Long> {

    @Query("FROM Songs s WHERE s.art.id = ?1")
    public Iterable<Songs> listSongsByArtId(Long artId);
}
