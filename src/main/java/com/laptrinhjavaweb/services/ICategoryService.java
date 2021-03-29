package com.laptrinhjavaweb.services;

import java.util.List;

import com.laptrinhjavaweb.models.Categories;

public interface ICategoryService {
	List<Categories> findAll();
}
