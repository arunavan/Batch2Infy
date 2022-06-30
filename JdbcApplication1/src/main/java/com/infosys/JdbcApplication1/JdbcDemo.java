package com.infosys.JdbcApplication1;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {

		try {//1
			Class.forName("com.mysql.cj.jdbc.Driver");  //java.sql.*
//2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/cms","root","root");
//3
			Statement st=con.createStatement();
			st.executeUpdate("create table product(id int primary key,name varchar(20),price int)");
			System.out.println("table created...");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
