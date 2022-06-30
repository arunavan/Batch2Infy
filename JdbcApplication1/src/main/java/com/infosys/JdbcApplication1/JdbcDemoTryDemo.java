package com.infosys.JdbcApplication1;
import java.sql.*;
public class JdbcDemoTryDemo {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3307/cms";
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) {
			
			
			String sql= "select * from product";//1.7 above
			try(Connection connection = DriverManager.getConnection(DB_URL, USER, PASS); Statement statement = connection.createStatement();){
					
				
				ResultSet resultset = statement.executeQuery(sql);
				while (resultset.next()) {
					int id = resultset.getInt(1);
					String name = resultset.getString(2);
					int age = resultset.getInt(3);
					System.out.println("Id: " + id+", Name: " + name+", Price: " + age);
					
				}
			
				
			} 
			catch (SQLException se) {
				System.out.println(se);
			} catch (Exception e) {
				
			} 
			
			}

	}


