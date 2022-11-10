package com.practice.blogapplication.repositories;

import com.practice.blogapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
