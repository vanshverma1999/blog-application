package com.practice.blogapplication.repositories;

import com.practice.blogapplication.entities.Category;
import com.practice.blogapplication.entities.Post;
import com.practice.blogapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
}
