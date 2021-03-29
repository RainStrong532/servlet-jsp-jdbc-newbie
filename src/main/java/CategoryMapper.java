import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.mapper.RowMapper;
import com.laptrinhjavaweb.models.Categories;

public class CategoryMapper implements RowMapper<Categories> {

	@Override
	public Categories mapRow(ResultSet resultSet) {
		Categories c = new Categories();
		try {
			c.setId(resultSet.getLong("id"));
			c.setCode(resultSet.getString("code"));
			c.setName(resultSet.getString("name"));
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
