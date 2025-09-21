package com.conceptandcoding.learningspringboot.jpa.entity;


import jakarta.persistence.*;
import jakarta.persistence.Id;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    //Contructors
    public UserDetails(){

    }
    public UserDetails(String name,String email){
        this.name=name;
        this.email=email;
    }

    //Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
