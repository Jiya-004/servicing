package com.AJS.vehicleservice.model;

import jakarta.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String date) {
        this.name =name;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password =password;
    }

}
