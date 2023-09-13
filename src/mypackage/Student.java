package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {


		
	// This method is responsible for creating a new database using JDBC and MySQL.

	public void createDatabase(){
	    try {
	        // Define the connection parameters.
	        String url = "jdbc:mysql://localhost:3306/"; // URL for MySQL database server.
	        String username = "root"; // Username to access the database.
	        String password = "System@1234"; // Password for the database user.

	        // Establish a connection to the MySQL database.
	        Connection conn = DriverManager.getConnection(url, username, password);

	        // Create a statement to execute SQL queries.
	        Statement sta = conn.createStatement();

	        // Define the SQL query to create a new database.
	        String query = "create database latest ";

	        // Execute the query to create the new database.
	        sta.execute(query);

	        // Print a success message after the database is created.
	        System.out.println("Created database Successfully = ");

	        // Close the database connection.
	        conn.close();
	    } catch (Exception e) {
	        // Print any exceptions that occur during the database creation process.
	        e.printStackTrace();
	    }
	}


		public void createTable() {
			// TODO Auto-generated method stub
			try {
				String url = "jdbc:mysql://localhost:3306/ ";
				String db = "latest";
				String username = "root";
				String password = "System@1234";
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection(url+db,username,password);
				// Statement
				Statement sta = conn.createStatement();
				//Execute query
				String query = "create table Student(roll_no int(5), name varchar(200),Email varchar(100)) ";
				//String query = "create table Employee(Emp_id int(5), name varchar(200),Salary int(100)) ";
				sta.execute(query);
				System.out.println("Table Created Successfully = ");
				conn.close();
			    }catch(Exception e) {
			    	e.printStackTrace();
			    }
			
		}

		public void createData() {
		    try {
		        // Database connection details
		        String url = "jdbc:mysql://localhost:3306/"; // Database URL
		        String db = "new_DB2"; // Database name
		        String username = "root"; // Database username
		        String password = "System@1234"; // Database password

		        // Establish a connection to the database
		        Connection conn = DriverManager.getConnection(url + db, username, password);

		        // SQL query to insert data into the 'Student' table
		        String query = "INSERT INTO Student (roll_no, name, email) VALUES (?, ?, ?)";
		        PreparedStatement psta = conn.prepareStatement(query);

		        // Set values for the placeholders in the SQL query
		        psta.setInt(1, 2212);       // Set value for 'roll_no'
		        psta.setString(2, "Alok Kumar"); // Set value for 'name'
		        psta.setString(3, "alok@gmail.com"); // Set value for 'email'

		        // Execute the INSERT query to add data to the table
		        psta.executeUpdate();

		        // Display success message
		        System.out.println("Data Created Successfully = ");

		        // Close the database connection
		        conn.close();
		    } catch (Exception e) {
		        // Handle any exceptions that might occur during the process
		        e.printStackTrace();
		    }
		}

		public void readData() {
		    try {
		        // Database connection details
		        String url = "jdbc:mysql://localhost:3306/"; // URL for the database server
		        String db = "new_DB2"; // Database name
		        String username = "root"; // Database username
		        String password = "System@1234"; // Database password
		        
		        // Establish a database connection using JDBC
		        Connection conn = DriverManager.getConnection(url + db, username, password);
		        
		        // Define the SQL query to retrieve data from the "Student" table
		        String query = "select * from Student";
		        
		        // Create a statement for executing the query
		        Statement sta = conn.createStatement();
		        
		        // Execute the query and retrieve the results
		        ResultSet rs = sta.executeQuery(query);
		        
		        // Iterate through the result set and print the data
		        while (rs.next()) {
		            System.out.println("id = " + rs.getInt(1) + " Name = " + rs.getString(2) + " , " + " Email = " + rs.getString(3));
		        }
		        
		        // Close the resources and the connection
		        rs.close();
		        sta.close();
		        conn.close();
		        
		        System.out.println("Read Successfully !");
		    } catch (Exception e) {
		        // Print any exceptions that occur during the process
		        e.printStackTrace();
		    }
		}


		/**
		 * This method updates a record in the 'Student' table of the specified database.
		 * It connects to the database, sets the 'roll_no' field to a new value for a given 'name',
		 * and then displays a success message. If any exceptions occur during the process,
		 * they are printed to the console.
		 */
		public void updateData() {
		    try {
		        // Database connection details
		        String url = "jdbc:mysql://localhost:3306/"; // Database URL
		        String db = "new_DB2"; // Database name
		        String username = "root"; // Database username
		        String password = "System@1234"; // Database password

		        // Establish a connection to the database
		        Connection conn = DriverManager.getConnection(url + db, username, password);

		        // SQL query to update data in the 'Student' table
		        String query = "UPDATE Student SET roll_no = ? WHERE name = ?";
		        PreparedStatement psta = conn.prepareStatement(query);

		        // Set values for the placeholders in the SQL query
		        psta.setInt(1, 1110);       // Set value for 'roll_no'
		        psta.setString(2, "Nabeel Khan"); // Set value for 'name'

		        // Execute the UPDATE query to modify data in the table
		        psta.executeUpdate();

		        // Display success message
		        System.out.println("Data Updated Successfully.");

		        // Close the database connection
		        conn.close();
		    } catch (Exception e) {
		        // Handle any exceptions that might occur during the process
		        e.printStackTrace();
		    }
		}



		public void deleteData() {
			   try {
			        // Database connection details
			        String url = "jdbc:mysql://localhost:3306/"; // URL for the database server
			        String db = "new_DB2"; // Database name
			        String username = "root"; // Database username
			        String password = "System@1234"; // Database password
			        
			        // Establish a database connection using JDBC
			        Connection conn = DriverManager.getConnection(url + db, username, password);
			        
			        // Define the SQL query to retrieve data from the "Student" table
			        String query = "select * from Student";
			        
			        // Create a statement for executing the query
			        Statement sta = conn.createStatement();
			        
			        // Execute the query and retrieve the results
			        ResultSet rs = sta.executeQuery(query);
			        
			        // Iterate through the result set and print the data
			        while (rs.next()) {
			            System.out.println("id = " + rs.getInt(1) + " Name = " + rs.getString(2) + " , " + " Email = " + rs.getString(3));
			        }
			        
			        // Close the resources and the connection
			        rs.close();
			        sta.close();
			        conn.close();
			        
			        System.out.println("Read Successfully !");
			    } catch (Exception e) {
			        // Print any exceptions that occur during the process
			        e.printStackTrace();
			    }
		
		}

}
