package com.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="Productinfo")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)    -----1
	//@GeneratedValue(strategy=GenerationType.TABLE)  - hibernate_sequences    ----2
	
	//@TableGenerator( name="pkgen1", table="prod_gen1", pkColumnName="gen_key",         ----2
	 // valueColumnName="gen_value", pkColumnValue="product_idnew", allocationSize=1)
	  
	 // @GeneratedValue(generator="pkgen1",strategy=GenerationType.TABLE)
	 
	// @SequenceGenerator(name="pkgen",sequenceName="customer_sequence",allocationSize=1)  --3
		//@GeneratedValue(generator="pkgen",strategy=GenerationType.SEQUENCE)
	
	private Integer productId;
	@Column
	private String productName;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
}
