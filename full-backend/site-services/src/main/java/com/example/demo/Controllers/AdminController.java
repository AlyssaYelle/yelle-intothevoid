package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Models.JwtResponse;
import com.example.demo.Models.Admin;
import com.example.demo.Services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Admin admin) {
        return ResponseEntity.ok(new JwtResponse(adminService.login(admin)));
    }


    @PostMapping("/signup")
    public ResponseEntity<?> createPerson(@RequestBody Admin newAdmin) {
        return ResponseEntity.ok(new JwtResponse(adminService.createAdmin(newAdmin)));
    }

//    @DeleteMapping("/user/{userId}")
//    public HttpStatus deleteUserById(@PathVariable Long id) {
//        return adminService.deleteById(id);
//    }



//    @GetMapping("/person/{username}")
//    public Person getPersonInfo(@PathVariable String username) {
//        return personService.getPerson(username);
//    }
}
