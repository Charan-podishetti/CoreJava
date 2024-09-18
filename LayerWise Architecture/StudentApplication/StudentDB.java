package com.evergent.StudentApplication;

import java.sql.*;

public class StudentDB 
{
  public static Connection getConnection()   throws Exception
  {
	Class.forName("com.mysql.jdbc.Driver");
	  Connection  con = DriverManager.getConnection(
			  "jdbc:mysql://localhost:3306/evergentdb",
			  "root",
			  "admin "); 
	
	return con;
  }



}