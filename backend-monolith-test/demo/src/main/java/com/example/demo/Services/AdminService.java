package com.example.demo.Services;

import com.example.demo.Models.Admin;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService {

    // need to create an admin
    public String createAdmin(Admin newAdmin);

    // allow admin to log in
    public String login(Admin admin);
}
