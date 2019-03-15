package SpringDataAssignment.Question6;

import SpringDataAssignment.Question10.UserMapper;
import SpringDataAssignment.Question7.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getUserName() {
        String sql = "SELECT name FROM user WHERE userName = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"souvikc40"}, String.class);
    }

    public void insertUser(User user) {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getDob()
        });
    }

    public List<User> getListOfUsers(){
        String sql="Select * from user";
       List users=jdbcTemplate.queryForList(sql);
        return users;

    }

    public void queryForMapDemo() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"souvikc40"}));
    }

    public User getUser(){
        String sql="SELECT * FROM user where userName='souvikc40'";
        return jdbcTemplate.queryForObject(sql,new UserMapper());
    }


}
