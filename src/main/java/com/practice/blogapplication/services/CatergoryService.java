package com.practice.blogapplication.services;

import com.practice.blogapplication.payloads.CategoryDto;

import java.util.List;

public interface CatergoryService {

    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
    void deleteCategory(Integer categoryId);
    CategoryDto getCategory(Integer categoryId);
    List<CategoryDto> getCategories();

}
