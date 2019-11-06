package com.example.demo.Services;

import com.example.demo.Config.JwtUtil;
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

    @Autowired
    @Qualifier("encoder")
    PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    JwtUtil jwtUtil;

    // create a new admin to manage site
    // string because it returns a jwt
    @Override
    public String createAdmin(Admin newAdmin) {
        // set the password to the encrypted version of their inputted password
        newAdmin.setPassword(bCryptPasswordEncoder.encode(newAdmin.getPassword()));

        // generate token and return it
        if(adminRepository.save(newAdmin) != null){
            UserDetails userDetails = loadUserByUsername(newAdmin.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    // log in admin to manage site
    // also string because it returns a token
    // auth : no auth
    @Override
    public String login(Admin admin) {
        // grab a admin object from db using findByUserName method
        Admin newAdmin = adminRepository.findByUsername(admin.getUsername());

        // return null if user is not found
        // otherwise check that password matches, load user details, and return a token
        if(newAdmin != null && bCryptPasswordEncoder.matches(admin.getPassword(), newAdmin.getPassword())){
            UserDetails userDetails = loadUserByUsername(newAdmin.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
