package SpringDataAssignment.Question1And2;

import java.sql.*;


public class JdbcApplication  {
    public static void main(String[] args) throws SQLException {
        final String driverName="com.mysql.jdbc.Driver";
        Connection connection=null;
        ResultSet resultSet=null;
        PreparedStatement statement=null;
        String sql = "CREATE TABLE IF NOT EXISTS user " +
                "(userName VARCHAR(255), " +
                " password VARCHAR(255), " +
                " name VARCHAR(255), " +
                " age INTEGER, " +
                " dob DATE )";

        String sql1="insert into user values"+
                "('souvikc40','abc123','souvik',25,'1994-10-16'),"+
                "('subhamc40','abc123','subham',20,'1998-10-3'),"+
                "('deepikadt','abc123','deepika',25,'1998-10-3')";

        String sql2="SELECT * FROM user";

        try {
            Class.forName(driverName);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        final String connectionString = "jdbc:mysql://localhost:3306/springDemo";
        final String userName="souvik";
        final String passWord="ABCdef123@";

        try {
            connection=  DriverManager.getConnection(connectionString,userName,passWord);
            statement=  connection.prepareStatement(sql);
            statement.executeUpdate(sql);
            statement.executeUpdate(sql1);
            resultSet=statement.executeQuery(sql2);

            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getInt(4));
                System.out.println(resultSet.getDate(5));
                System.out.println("------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(resultSet!=null){
                resultSet.close();
            }
            statement.close();
            connection.close();
        }



    }
}
