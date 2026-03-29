package jdbc;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //readData();
        //insertData();
        //deleteData();
        //updateData();
        sp();
    }

    public static void readData() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String Password = "Hars@2005";
        String query = "select * from employee";

        Connection con = DriverManager.getConnection(url, userName, Password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID is " + rs.getInt(1));
            System.out.println("Name is " + rs.getString(2));
            System.out.println("Salary is " + rs.getInt(3));
        }

        con.close();
    }

    public static void insertData() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String Password = "Hars@2005";
        int id = 2;
        String name = "Kavya";
        int salary = 200000;

        String query = "insert into employee values(?,?,?);";

        Connection con = DriverManager.getConnection(url, userName, Password);
        PreparedStatement pst = con.prepareStatement(query);

        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);

        int row = pst.executeUpdate();

        System.out.println(row + " rows inserted successfully");

        con.close();
    }

    public static void deleteData() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String Password = "Hars@2005";

        int id = 2;

        String query = "delete from employee where emp_id = " + id;

        Connection con = DriverManager.getConnection(url, userName, Password);
        PreparedStatement pst = con.prepareStatement(query);
        int row = pst.executeUpdate();
        System.out.println(row + " rows inserted successfully");

        con.close();
    }

    public static void updateData() throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String Password = "Hars@2005";

        int id = 2;

        String query = "update employee set salary = 150000 where emp_id = 1";

        Connection con = DriverManager.getConnection(url, userName, Password);
        PreparedStatement pst = con.prepareStatement(query);
        int row = pst.executeUpdate();
        System.out.println(row + " rows inserted successfully");

        con.close();
    }

    public static void sp() throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String userName = "root";
        String password = "Hars@2005";

        int id = 1;

        Connection con = DriverManager.getConnection(url, userName, password);
        CallableStatement cst = con.prepareCall("{call GetEmpById(?)}");
        cst.setInt(1, id);
        ResultSet rs = cst.executeQuery();

        while (rs.next()) {
            System.out.println("Id is " + rs.getInt(1));
            System.out.println("Name is " + rs.getString(2));
            System.out.println("Salary is " + rs.getInt(3));
        }

        con.close();
    }
}
