package com.example.demo.Repositories;

import com.example.demo.Models.Newsletter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsletterRepository extends CrudRepository<Newsletter, Long> {
    // i don't think i need to add any custom methods here
}
