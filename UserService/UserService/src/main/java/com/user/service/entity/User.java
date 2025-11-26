package com.user.service.entity;

import jakarta.persistence.Entity;

@Entity
@Table(name="ID")
public class User {

    private String userId;

    private String name;

    private String email;

    private String about;
}
