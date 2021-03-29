package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.models.Posts;

public class PostMapper implements RowMapper<Posts> {

	@Override
	public Posts mapRow(ResultSet resultSet) {
		Posts c = new Posts();
		try {
			c.setId(resultSet.getLong("id"));
			c.setTitle(resultSet.getString("title"));
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
