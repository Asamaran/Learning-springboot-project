package com.conceptandcoding.learningspringboot.jpa.Controllers;

import com.conceptandcoding.learningspringboot.jpa.entity.UserDetails;
import com.conceptandcoding.learningspringboot.jpa.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(path = "/test-jpa")
    public UserDetails getUser(){
        UserDetails userDetails1 = new UserDetails("Aarthi","abc@gmail.com");

        userDetailsService.saveUser(userDetails1);
        return userDetailsService.findById(1L);
    }
}
