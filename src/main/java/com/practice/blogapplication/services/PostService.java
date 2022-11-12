package com.practice.blogapplication.services;

import com.practice.blogapplication.entities.Post;
import com.practice.blogapplication.payloads.PostDto;
import com.practice.blogapplication.payloads.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    PostDto updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    PostResponse getAllPost(Integer pageNumber, Integer pageSize);
    PostDto getPostById(Integer postId);
    List<PostDto> getPostsByCategory(Integer categoryId);
    List<PostDto> getPostsByUser(Integer userId);
    List<Post> searchPosts(String keyword);
}
