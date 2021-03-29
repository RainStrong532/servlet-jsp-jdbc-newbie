package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.mapper.CategoryMapper;
import com.laptrinhjavaweb.models.Categories;

public class CategoryDAO extends AbstractDAO<Categories> implements ICategoryDAO {
//	"jdbc:mysql://localhost:3306/jdbc_servlet", "root", "mysqlpassword"


	@Override
	public Categories findOne(long id) {
//		String sql = "SELECT * FROM category WHERE id = ?";
//		List<Categories> category = query(sql, new Categories(), id);
//		return category.isEmpty() ? null : category.get(0);
		return null;
	}

	@Override
	public Categories findOneByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categories> findAll() {
		String sql = "SELECT * FROM categories";
		return query(sql, new CategoryMapper());
	}

}
