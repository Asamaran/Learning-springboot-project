package com.conceptandcoding.learningspringboot.jpa.service;

import com.conceptandcoding.learningspringboot.jpa.entity.UserDetails;
import com.conceptandcoding.learningspringboot.jpa.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails user)
    {
        userDetailsRepository.save(user);
    }

    public UserDetails findById(Long primaryKey){
        return userDetailsRepository.findById(primaryKey).get();
    }


}
