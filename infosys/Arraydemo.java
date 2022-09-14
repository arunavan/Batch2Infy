package com.infosys;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Course{
	Integer courseId;
	String courseName;
	public Course(Integer courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	
}

public class Arraydemo {

	public static void main(String[] args) {
		
	//	double x=1987.876789;
	//	double y=(double)Math.round(x*100)/100;
	//	System.out.println(x +"  "+y);

        Scanner sc=new Scanner(System.in);
		
		int[] b= {2,3,4,5,6,7,8};  //source
		for(int x:b)
			System.out.println(x);
		
		int a[]=new int[3]; //destination
	/*	System.out.println("enter array values...5 ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt(); //sc.nextFloat(), sc.next(), sc.nextLine()
		Arrays.sort(a);
		for( int x1 :a)
			System.out.print(x1+" ");
		*/
				
		System.out.println();
		
		System.arraycopy(b, 2, a, 1,1);
		               //source, startlocationsrc,dest,destlocation,no elements

		for(int x1: a)
			System.out.print(x1+" ");
		
		
		Course courses[]=new Course[3];
		
		Course c1=new Course(10,"java");
		courses[0]=c1;
		Course c2=new Course(11,"java123");
		courses[1]=c2;
		Course c3=new Course(12,"java456");
		courses[2]=c3;
		System.out.println("For each==============");
		for( Course cobj: courses) 
			System.out.println(cobj.courseId+"  "+cobj.courseName);
		
		
		System.out.println("for loop==============");
		for(int i=0;i< courses.length;i++)
			System.out.println(courses[i].courseId+"  "+courses[i].courseName);
		Object o[]=new Object[3];//array of objects
		o[0]=10;
		o[1]=new Date();
		o[2]="Infosys";
		
		for(Object oo: o)
			System.out.println(oo);
		
		
		int xx[][]= {{2,3,4,6,7,8},{5,6,2},{1,2,}};
		for(int i=0;i<xx.length;i++) {//3
			for(int j=0;j<xx[i].length;j++) {//3, 2, 4
				System.out.print(xx[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int marks1[]= {3,2,5,6,7,8,9,1,2,3};
		for(int x12: marks1) 
			System.out.println(x12);
		System.out.println("after ");
		Arrays.sort(marks1);
		for(int x12: marks1) 
			System.out.println(x12);
		
		int key=Arrays.binarySearch(marks1, 50);
		System.out.println("key found at "+ key);
		
		
	}

}


