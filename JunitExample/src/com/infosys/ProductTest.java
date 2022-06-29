package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	Product p;

	@BeforeAll  //1
	static void setUpBeforeClass() throws Exception {
		
		//db create
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//db close
	}

	@BeforeEach //each testcse
	void setUp() throws Exception {
		p=new Product();
	}

	@AfterEach
	void tearDown() throws Exception {
		p=null;
	}

	@Test
	void testCalcTotalPrice() {
		//fail("Not yet implemented");
		
		assertEquals(500,p.calcTotalPrice(10, 50));
	}
	
	@Test
	void testQty() {
		//fail("Not yet implemented");
		p.qty=0;
		assertNotEquals(0,p.qty);
	}

}
