package com.laptrinhjavaweb.services.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.impl.*;
import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.models.Categories;
import com.laptrinhjavaweb.services.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDAO;
//	public CategoryService() {
//		categoryDAO = new CategoryDAO();
//	}
	
	@Override
	public List<Categories> findAll() {
		return categoryDAO.findAll();
	}

}
