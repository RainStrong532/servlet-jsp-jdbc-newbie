package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.models.Posts;

public interface IPostDAO {
	List<Posts> findByCategoryId(Long categoryId);
}
