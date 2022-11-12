package com.practice.blogapplication.services.impl;

import com.practice.blogapplication.entities.Comment;
import com.practice.blogapplication.entities.Post;
import com.practice.blogapplication.exceptions.ResourceNotFoundException;
import com.practice.blogapplication.payloads.CommentDto;
import com.practice.blogapplication.repositories.CommentRepo;
import com.practice.blogapplication.repositories.PostRepo;
import com.practice.blogapplication.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","Post id",postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment","Comment id",commentId));
        this.commentRepo.delete(comment);
    }
}
