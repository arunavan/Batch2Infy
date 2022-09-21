package com.infy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		//System.out.println("maven demo");
		//1 regster driver 
		
			Class.forName("com.mysql.cj.jdbc.Driver");// 
			//2
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/infy123","root","root");
			//3
			Statement st=con.createStatement();
		//	st.executeUpdate("create table product (id int, name varchar(20))");
		//	st.executeUpdate("update product set name='box' where id=1");
		int count=	st.executeUpdate("delete from  product where id=2");
		System.out.println("no of records deleted is "+count);
			//insert,delete,update,create,drop
			//int
			st.executeUpdate("insert into product values(4,'pen4')");
			System.out.println("table created...");
			//select 
			boolean result=st.execute("update product set name='tale' where id=3");
			ResultSet rs=st.executeQuery("select * from product");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2));
			}
		
		
		

	}

}
