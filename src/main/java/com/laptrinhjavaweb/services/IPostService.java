package com.laptrinhjavaweb.services;

import java.util.List;

import com.laptrinhjavaweb.models.Categories;
import com.laptrinhjavaweb.models.Posts;

public interface IPostService {
	List<Posts> findCategoryId(Long categoryId);
}
