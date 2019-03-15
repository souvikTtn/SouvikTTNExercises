package SpringDataAssignment.Question10;

import SpringDataAssignment.Question7.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user=new User();
        user.setUsername(rs.getString("userName"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setDob(rs.getDate("dob"));
        user.setAge(rs.getInt("age"));
        return user;
    }
}
