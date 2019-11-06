package com.example.demo.Repositories;

import com.example.demo.Models.Art;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends CrudRepository<Art, Long> {
    // pretty sure I don't need any custom methods
}
