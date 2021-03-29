package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.IPostDAO;
import com.laptrinhjavaweb.models.Posts;

public class PostDAO implements IPostDAO{

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
	public List<Posts> findByCategoryId(Long categoryId) {
		List<Posts> cts = new ArrayList<>();
		Connection conn = getConnection();
		String sql = "SELECT * FROM posts WHERE categoryId = ?";
		if (conn != null) {
			try {
				PreparedStatement pr;
				pr = conn.prepareStatement(sql);
				pr.setLong(1, categoryId);
				ResultSet res = pr.executeQuery();
				while (res.next()) {
					Posts c = new Posts();
					c.setId(res.getLong("id"));
					c.setTitle(res.getString("title"));
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

}
