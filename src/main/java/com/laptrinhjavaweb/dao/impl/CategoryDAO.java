package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.models.Categories;

public class CategoryDAO implements ICategoryDAO {
//	"jdbc:mysql://localhost:3306/jdbc_servlet", "root", "mysqlpassword"
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/jdbc_servlet", user_name = "root", password = "mysqlpassword";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user_name, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Categories> findAll() {
		List<Categories> cts = new ArrayList<>();
		Connection conn = getConnection();
		String sql = "SELECT * FROM categories";
		if (conn != null) {
			try {
				PreparedStatement pr;
				pr = conn.prepareStatement(sql);
				ResultSet res = pr.executeQuery();
				while (res.next()) {
					Categories c = new Categories();
					c.setId(res.getLong("id"));
					c.setCode(res.getString("code"));
					c.setName(res.getString("name"));
					cts.add(c);
				}
				conn.close();
				pr.close();
				res.close();
				return cts;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}

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

}
