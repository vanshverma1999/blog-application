package com.practice.blogapplication.services;

import com.practice.blogapplication.entities.Comment;
import com.practice.blogapplication.payloads.CommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto,Integer postId);
    void deleteComment(Integer commentId);
}
