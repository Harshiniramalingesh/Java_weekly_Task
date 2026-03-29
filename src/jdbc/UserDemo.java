package jdbc;
import java.sql.*;
public class UserDemo {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/userdb";
        String userName = "root";
        String passWord = "Hars@2005";
        Connection con = DriverManager.getConnection(url,userName,passWord);

        PreparedStatement createTable = con.prepareStatement(
                "CREATE TABLE IF NOT EXISTS Users (id INTEGER PRIMARY KEY, name TEXT, email TEXT)"
        );
        createTable.execute();

        PreparedStatement insertUser = con.prepareStatement(
                "INSERT INTO Users (id, name, email) VALUES (?, ?, ?)"
        );
        insertUser.setInt(1, 1);
        insertUser.setString(2, "Harshini");
        insertUser.setString(3, "harshini@gmail.com");
        insertUser.executeUpdate();

        PreparedStatement selectUser = con.prepareStatement(
                "SELECT * FROM Users"
        );
        ResultSet rs = selectUser.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("name") + " " +
                            rs.getString("email")
            );
        }

        con.close();
    }

}
