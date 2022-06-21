package com.infosys.relationships;

public class OrderTest {
	public static void main(String[] args) { 
		Food food[] = new Food[2]; 
		
		food[0]=new Food("Pizza Margherita","Italian","Veg",10,8.0);
		food[1]=new Food("Burger","Italian","Veg",10,8.0);
		
		System.out.println(food[0].getCuisine());
		Order order = new Order(101, food); 
		System.out.println(food);
		System.out.println("Order placed successfully!"); 
	//	System.out.println("You have ordered: "+ order.getOrderedFoods()[0].getCuisine()); 
		System.out.println("Order status: "+ order.getStatus());
	//	System.out.println(order.getOrderId()+"  "+order.getTotalPrice()+"  "+order.getOrderedFoods()[0].getFoodType());
	} 
}