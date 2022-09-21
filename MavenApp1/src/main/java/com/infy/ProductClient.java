package com.infy;

import java.sql.Connection;

import com.infy.model.Product;
import com.infy.service.ProductService;
import com.infy.service.ProductServiceImpl;
import com.infy.util.DbCon;

public class ProductClient { //ui /presention
	public static void main(String[] args) throws Exception{
		
		ProductService service=new ProductServiceImpl();
		Product p=new Product();
		p.setId(101);
		p.setName("Bookbox");
		service.addProduct(p);
		
		
		
	}
}
