package com.infosys;

import java.util.Arrays;
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
		
		double x=1987.876789;
		double y=(double)Math.round(x*100)/100;
		System.out.println(x +"  "+y);

        Scanner sc=new Scanner(System.in);
		
		int[] b= {2,3,4,5,6,7,8};  //source
		
		int a[]=new int[3]; //destination
		
		//for(int i=0;i<b.length;i++)
			//System.out.println(a[i]);
		
		for( int x1 :b)
			System.out.print(x1+" ");
		
		
		System.out.println();
		
		System.arraycopy(b, 0, a, 1,2);
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
		int xx[][]= {{2,3,4},{5,6},{1,2,3,4}};
		for(int i=0;i<xx.length;i++) {
			for(int j=0;j<xx[i].length;j++) {
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
		int key=Arrays.binarySearch(marks1, 8);
		System.out.println("key found at "+ key);
		
		
	}

}


