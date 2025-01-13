package DBC;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Conect {


    Connection connection = null;
        try {
        String url = "jdbc:mysql://localhost:3306/db1"; // Replace with your database URL
        String username = "root"; // Replace with your MySQL username
        String password = "admin12345@"; // Replace with your MySQL password

        // Register the MySQL driver (only needed for older Java versions)
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url, username, password);

        String selectQuery = "SELECT * FROM employee"; // Replace with your actual table name
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);

        while (resultSet.next()) {
            int empId = resultSet.getInt("empid");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            float salary = resultSet.getFloat("salary");
            String dept = resultSet.getString("dept");

            System.out.println("Employee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Department: " + dept);
            System.out.println("--------------------------");
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
