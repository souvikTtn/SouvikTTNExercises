package SpringDataAssignment.Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDaoNew {
    @Autowired
    DataSource dataSourceJdbc;
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Integer getCount(){
        String sql = "SELECT COUNT(*) FROM user";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
