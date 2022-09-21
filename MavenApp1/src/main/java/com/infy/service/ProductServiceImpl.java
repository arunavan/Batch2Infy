package com.infy.service;

import com.infy.dao.ProductDao;
import com.infy.dao.ProductDaoImpl;
import com.infy.model.Product;

public class ProductServiceImpl  implements ProductService{
	ProductDao dao=new ProductDaoImpl();
	
	public void addProduct(Product p) throws Exception {
		
		dao.addProduct(p);
	}

}
