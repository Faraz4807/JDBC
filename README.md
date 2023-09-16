# 
<h1>JDBC MySQL Student Database Management</h1>
This Java project demonstrates how to interact with a MySQL database using JDBC (Java Database Connectivity). It includes functionalities to create a database, create a table, insert data, read data, update data, and delete data in the database. In this example, we'll be managing student records in the database.
<h2>Prerequisites</h2>
Before running this project, ensure you have the following:

Java Development Kit (JDK) installed on your system.

MySQL Database Server installed and running.

The MySQL JDBC Driver JAR file is included in your project (usually named mysql-connector-java-x.x.x.jar).
<h2>Setup</h2>
1. Clone this repository to your local machine:
<p>git clone https://github.com/your-username/your-repo.git</p>
<p> 2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).</p>
<p>3 .Add the MySQL JDBC Driver JAR file to your project's classpath. You can usually do this by right-clicking on your project, selecting "Properties," and then navigating to the "Java Build Path" or "Libraries" section.</p>
<p>Update the MySQL database connection details in the code:

Modify the url, username, and password variables in the <b>createDatabase()</b>, <b>createTable()</b>, <b>createData()</b>, <b>readData()</b>, <b>updateData()</b>, and <b>deleteData()</b> methods to match your MySQL server configuration.</p>
<h2>Usage</h2>
<h3>1.Create a Database</h3>
<p>Student student = new Student();<br>
student.createDatabase();
</p>
<p><i>This method creates a new MySQL database.</i></p>
<h3>2.Create a Table</h3>
<p>Student student = new Student();<br>
student.createTable();
</p>
<p><i>This method creates a "Student" table in the previously created database.</i></p>
<h3>3. Insert Data</h3>
<p>Student student = new Student();<br>
student.createData();
</p>
<p><i>This method inserts a sample student record into the "Student" table.</i></p>
<h3>4. Read Data</h3>
<p>
  Student student = new Student();<br>
student.readData();
</p>
<p><i>This method retrieves and displays all records from the "Student" table.</i></p>
