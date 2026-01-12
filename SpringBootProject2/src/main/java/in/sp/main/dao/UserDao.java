package in.sp.main.dao;
import org.springframework.stereotype.Repository;
import in.sp.main.SpringBootProject2Application;
import in.sp.main.entity.User;


import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.*;
@Repository
public class UserDao {

@Autowired
private JdbcTemplate jdbcTemplate;

public boolean insertUser(User user)
{ 
	try {
		String INSERT_QUERY="INSERT INTO USER VALUES(?,?,?,?)";
		int count=jdbcTemplate.update(INSERT_QUERY,user.getName(),user.getEmail(),user.getGender(),user.getCity());
		if(count>0)
		{
			return true;
		}
		else {return false;}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
}

public boolean updateUser(User user)
{ 
	try {
		String UPDATE_QUERY="UPDATE USER SET name=?,gender=?,city=? WHERE email=?";
		int count=jdbcTemplate.update(UPDATE_QUERY,user.getName(),user.getGender(),user.getCity(),user.getEmail());
		if(count>0)
		{
			return true;
		}
		else {return false;}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
}

public boolean deleteUser(String email)
{ 
	try {
		String DELETE_QUERY="DELETE FROM USER WHERE email=?";
		int count=jdbcTemplate.update(DELETE_QUERY,email);
		if(count>0)
		{
			return true;
		}
		else {return false;}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
}

public User getUserByEmail(String email)
{ 
	String SELECT_QUERY="SELECT * FROM USER WHERE email=?";
	 return jdbcTemplate.queryForObject(SELECT_QUERY, new UserRowMapper(),email);
	}

public static final class UserRowMapper implements RowMapper<User>
{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setGender(rs.getString("gender"));
		user.setCity(rs.getString("city"));
		return user;
	}
	}

public java.util.List<User> getAllUser() {
	String SELECT_QUERY="SELECT * FROM USER";
	return jdbcTemplate.query(SELECT_QUERY, new UserRowMapper());
}
	

}
