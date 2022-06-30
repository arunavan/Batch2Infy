package com.infosys.JdbcApplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/cms","root","root");
	
		Statement st=con.createStatement();
		st.executeUpdate("insert into product values(3,'bag',90),(4,'table',70)");
	//	st.executeUpdate("update product set price=999 where id=2");
	//	st.executeUpdate("delete from product where id=1");
					System.out.println("inserted ..");
					
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
		}

	}

}
