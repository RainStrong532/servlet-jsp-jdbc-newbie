package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.models.Categories;

public interface ICategoryDAO extends GenericDAO<Categories>{
	List<Categories> findAll();
	Categories findOne(long id);
	Categories findOneByCode(String code);
}
