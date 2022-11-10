package com.practice.blogapplication.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min = 4,message = "Name must be min of 4 characters")
    private String name;

    @Email(message = "Email address not valid")
    //@Pattern(regexp = "^[A-Za-z0-9+_. -]+@(. +)$")
    private String email;

    @NotNull
    @Size(min = 4,max = 10,message = "Password must be min of 4 characters and max of 10 characters")
    private String password;

    @NotNull
    private String about;
}
