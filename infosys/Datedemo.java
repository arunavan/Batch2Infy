package com.infosys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Date d=new Date();
			System.out.println(d.getDate());
			
			System.out.println(d);
			//not threadsafe , zoneid , 1970....
			
			
			LocalDate ld1=LocalDate.now(); //mutable ,zone id 
			System.out.println(ld1);
			LocalDate doj=LocalDate.of(2022, 06, 10);
			System.out.println(doj);
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy"); //ofPattern() creates a formatter using the specified pattern.
			
			System.out.println(df.format(doj)); //output 29/08/97
			System.out.println(doj.plusDays(10));
			System.out.println(doj.minusMonths(2));
			
			
			LocalDate today = LocalDate.now();
			LocalDate newDateObj = today.minusWeeks(7);
			System.out.println(ChronoUnit.DAYS.between(newDateObj,today));  //273
			
			
			
			//between() calculates the amount of time between specified date objects
			System.out.println(ChronoUnit.MONTHS.between(newDateObj,today)); //8
			//compareTo() compares this date with specified date
			System.out.println(today.plusDays(10).compareTo(today.plusDays(20))); //-1 
			
		
			
	}

}
