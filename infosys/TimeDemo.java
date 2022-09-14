package com.infosys;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now(); 
		System.out.println(currentTime);  // will display current time eg. 15:44:44.932359900
				
		LocalTime newTimeObj = LocalTime.of(9, 45, 59); 
		System.out.println(newTimeObj); //09:45:59
				
		DateTimeFormatter df = DateTimeFormatter.ofPattern("h=mm=ss");
		System.out.println(df.format(currentTime));

		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println(currentDate); // output in default format eg. 2020-03-06T16:25:10.257251100
				
		System.out.println(currentDate.getDayOfWeek()); // will give today's day eg. FRIDAY

		
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy/ hh:mm:ss a");  // a is used to display 12 hr clock
		System.out.println(df1.format(currentDate)); //ou
	}

}
