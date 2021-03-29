package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.models.Posts;

public interface IPostDAO extends GenericDAO{
	List<Posts> findByCategoryId(Long categoryId);
}
