package com.infosys.relationships;

public class OrderTest {
	public static void main(String[] args) { 
		Food food1 = new Food();
		food1.setFoodName("Hamburger");
		food1.setFoodType("Non-Veg");
		food1.setCuisine("American");
		food1.setUnitPrice(3.8);
		food1.setQuantityAvailable(20);
		
		Food food2 = new Food();
		food2.setFoodName("Baked Apple Pie");
		food2.setFoodType("Veg");
		food2.setCuisine("American");
		food2.setUnitPrice(20);
		food2.setQuantityAvailable(25);
		
		Food orderedFoods[]= new Food[] {food1,food2};
		Order order = new Order(101, orderedFoods);
		Bill bill = new Bill("PayPal");
		System.out.println(bill.generateBill(order));
		
	/*	Food food[] = new Food[2]; 
		
		food[0]=new Food("Pizza Margherita","Italian","Veg",10,8.0);
		food[1]=new Food("Burger","Italian","Veg",10,8.0);
		
		System.out.println(food[0].getCuisine());
		Order order = new Order(101, food); 
		System.out.println(food);
		System.out.println("Order placed successfully!"); 
		System.out.println("You have ordered: "+ order.getOrderedFoods()[0].getCuisine()); 
		System.out.println("Order status: "+ order.getStatus());
		System.out.println(order.getOrderId()+"  "+order.getTotalPrice()+"  "+order.getOrderedFoods()[0].getFoodType());
		*/
	} 
}