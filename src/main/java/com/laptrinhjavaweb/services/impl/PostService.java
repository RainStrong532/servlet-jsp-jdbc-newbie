package com.laptrinhjavaweb.services.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IPostDAO;
import com.laptrinhjavaweb.models.Posts;
import com.laptrinhjavaweb.services.IPostService;

public class PostService implements IPostService{

	@Inject
	private IPostDAO postDao;
	
	@Override
	public List<Posts> findCategoryId(Long categoryId) {
		return postDao.findByCategoryId(categoryId);
	}

}
