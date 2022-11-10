package com.practice.blogapplication.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_name",nullable = false,length = 100)
    private String name;

    @Column(name = "user_email",nullable = false)
    private String email;

    @Column(name = "user_password",nullable = false)
    private String password;

    @Column(name = "user_about")
    private String about;
}
