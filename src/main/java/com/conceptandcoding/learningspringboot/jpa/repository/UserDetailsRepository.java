package com.conceptandcoding.learningspringboot.jpa.repository;

import  com.conceptandcoding.learningspringboot.jpa.entity.UserDetails;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends
    JpaRepository<UserDetails,Long> {

    //specific query
}
