package com.infy.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.infy.model.Product;
import com.infy.util.DbCon;

public class ProductDaoImpl implements ProductDao{
	public void addProduct(Product p) throws Exception {
		Connection con=DbCon.getConn(); //utilty dbcon
		Statement st=con.createStatement();
		
		//st.executeUpdate(insert into product values('+p.getProductId()+',))
		
		
		
	}

}
