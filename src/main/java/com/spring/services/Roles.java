package com.spring.services;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Roles implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "role")
    private String role;

    public Roles(){
    }

    public Roles(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Roles(String role){
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
