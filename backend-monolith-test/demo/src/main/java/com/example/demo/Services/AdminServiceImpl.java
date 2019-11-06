package com.example.demo.Services;

import com.example.demo.Models.Admin;
import com.example.demo.Repositories.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

//    @Autowired
//    @Qualifier("encoder")
//    PasswordEncoder bCryptPasswordEncoder;

    /**
    * TODO
     * need to create jwtUtil so it can be autowired
     * add security config so i can encrypt password
    * */

    @Override
    public String createAdmin(Admin newAdmin) {
        return null;
    }

    @Override
    public String login(Admin admin) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
