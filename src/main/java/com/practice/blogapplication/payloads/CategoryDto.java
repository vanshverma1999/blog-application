package com.practice.blogapplication.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {
    private Integer categoryId;

    @NotBlank
    @Size(min = 4,message = "Title is too short")
    private String categoryTitle;

    @NotBlank
    @Size(min = 4,message = "Description is too short")
    private String categoryDescription;
}
