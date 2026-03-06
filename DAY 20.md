1. JDBC Driver
A JDBC Driver is a software component that allows a Java application to communicate with a specific database.
It converts Java JDBC calls into database-specific commands.
Each database requires its own driver.

Example drivers:
MySQL → mysql-connector-j
SQLite → sqlite-jdbc
Oracle → ojdbc

Example usage:

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb","root","");

Here the MySQL JDBC driver helps Java connect with the MySQL database.

2. Connection
A Connection represents a session between a Java application and the database.
It is used to send SQL queries to the database.
It is created using DriverManager.

Example:

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb","root","");


Main purposes:
Execute SQL queries.
Create statements
Manage transactions
Close the database session

3. PreparedStatement
PreparedStatement is a JDBC interface used to execute precompiled SQL queries with parameters.

Features:
Faster than normal Statement
Supports dynamic values
Prevents SQL Injection
Improves performance

Example:

String query = "INSERT INTO student VALUES (?, ?, ?)";
PreparedStatement ps = con.prepareStatement(query);
ps.setInt(1, 1);
ps.setString(2, "Harshini");
ps.setInt(3, 20);
ps.executeUpdate();

? is a placeholder for values.

4. SQL Injection Prevention
SQL Injection is a security attack where a user inserts malicious SQL code into a query to manipulate the database.

Example of vulnerable code:
String query = "SELECT * FROM users WHERE username='" + user + "' AND password='" + pass + "'";

An attacker can enter:
' OR '1'='1
This makes the condition always true and bypasses authentication.

Prevention methods:
Use PreparedStatement
Validate user input
Limit database permissions

Safe example:

String query = "SELECT * FROM users WHERE username=? AND password=?";

PreparedStatement ps = con.prepareStatement(query);
ps.setString(1, user);
ps.setString(2, pass);


PreparedStatement treats input as data, not SQL code, preventing injection attacks.
