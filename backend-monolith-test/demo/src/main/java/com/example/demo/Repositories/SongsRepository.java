package com.example.demo.Repositories;

import com.example.demo.Models.Songs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends CrudRepository<Songs, Long> {

    /*
    * TODO
    *  add query(??? will i need to?) to grab iterable list of songs that match a given art id
    * */
}
