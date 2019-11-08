package com.example.demo.Repositories;

import com.example.demo.Models.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

    // to login i need info: username & password
    // query will find that record in db
    @Query("FROM Admin a WHERE a.username = ?1 and a.password = ?2")
    public Admin login(String username, String password);

    // get admin by their username
    public Admin findByUsername(String username);

}
