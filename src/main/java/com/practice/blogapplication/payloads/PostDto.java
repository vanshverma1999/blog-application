package com.practice.blogapplication.payloads;

import com.practice.blogapplication.entities.Category;
import com.practice.blogapplication.entities.Comment;
import com.practice.blogapplication.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
    private Integer postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
    private List<CommentDto> comments;
}
