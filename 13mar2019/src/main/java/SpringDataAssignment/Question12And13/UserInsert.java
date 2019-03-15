package SpringDataAssignment.Question12And13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserInsert {
    @Autowired
    JdbcTemplate jdbcTemplate;

    private void insert() {
        String sql="insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{"Shubham","Sehrawat","Shubham Sehrawat",26,new Date(1991-12-12)});
        throw new RuntimeException("Exception occured");
    }

    private void insert2(){


    }

    @Transactional(propagation= Propagation.REQUIRED)
    public void insertRequired()  {
        insert();
    }
    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public void insertRequiredNew()  {
        insert();
        return;
    }


    public void insertMandatory() {
        insert();
    }

    @Transactional(propagation = Propagation.NEVER)
    public void insertNever() {
        insert();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void insertNotSupport() {
        insert();
    }


    @Transactional(propagation = Propagation.SUPPORTS)
    public void insertSupport() {
        insert();
    }


    /*Question13*/
    @Transactional(noRollbackFor = RuntimeException.class)
    public void insertNoRollBack() {
        insert();
    }

    @Transactional(readOnly = true)
    public void insertWithReadOnly()  {

        String sql="insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{"ak","ak","AK",24,new Date(1996-12-12)});
        try {
            insertRequired();
        } catch (Exception e) {
        }
    }

    @Transactional(timeout= 2)
    public void insertWithTimeOut()  {
        try {
            Thread.sleep(3000);
            String sql="insert into User values(?,?,?,?,?)";
            jdbcTemplate.update(sql,new Object[]{"ak","ak","AK",24,new Date(1996-12-12)});

           insertRequired();
        } catch (Exception e) {

        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void insertWithRollBack()  {
        try {
            String sql="insert into User values(?,?,?,?,?)";
            jdbcTemplate.update(sql,new Object[]{"ak","ak","AK",24,new Date(1996-12-12)});

            insertRequired();
        } catch (Exception e) {

        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertWithNoRollBack()  {
        try {
            String sql="insert into User values(?,?,?,?,?)";
            jdbcTemplate.update(sql,new Object[]{"ak","ak","AK",24,new Date(1996-12-12)});

            insertNoRollBack();
        } catch (Exception e) {

        }
    }

    @Transactional(propagation= Propagation.REQUIRED)
    public void insertWithRequired()  {

        String sql="insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{"ak","ak","AK",24,new Date(1996-12-12)});
        try {
            insertRequired();
        } catch (Exception e) {

        }

    }

    @Transactional(propagation= Propagation.REQUIRED)
    public void insertWithRequiredNew() {

        String sql = "insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"ak", "ak", "AK", 24, new Date(1996 - 12 - 12)});
        try {
            insertRequiredNew();
        } catch (Exception e) {

        }
    }

    @Transactional(propagation= Propagation.MANDATORY)
    public void insertWithMandatory() {

        String sql = "insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"ak", "ak", "AK", 24, new Date(1996 - 12 - 12)});
        try {
            insertMandatory();
        } catch (Exception e) {

        }
    }


    @Transactional(propagation= Propagation.NEVER)
    public void insertWithNever() {

        String sql = "insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"ak", "ak", "AK", 24, new Date(1996 - 12 - 12)});
        try {
            insertNever();
        } catch (Exception e) {

        }
    }


    @Transactional(propagation= Propagation.REQUIRED)
    public void insertWithNotSupport() {

        String sql = "insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"ak", "ak", "AK", 24, new Date(1996 - 12 - 12)});
        try {
            insertNotSupport();
        } catch (Exception e) {

        }
    }

    @Transactional(propagation= Propagation.REQUIRED)
    public void insertWithSupport() {

        String sql = "insert into User values(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{"ak", "ak", "AK", 24, new Date(1996 - 12 - 12)});
        try {
            insertSupport();
        } catch (Exception e) {

        }
    }
}
