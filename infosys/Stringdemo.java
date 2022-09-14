package com.infosys;

import java.util.StringTokenizer;
// java.lang
// java.util
// java.sql
// java.servlet
// java.awt
// java.net


public class Stringdemo {

	public static void main(String[] args) {
		String s1="infosys";  //java.lang
		
		
		System.out.println(s1.hashCode());
		//java.lang.*;
		String s2=new String("infosys");
		
		// immutable, duplicates
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.concat("technologies"));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("o"));
		
		StringBuffer sb=new StringBuffer("Infosys");
		//mutable, will not create duplciates, built in synchronied , slow
		
		System.out.println(sb.append("Solutions"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(4,6));
		System.out.println(sb.insert(5,"XXXXX"));
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder("Infosys");
		//mutable, will not create duplciates, not  synchronied , fast
		
		System.out.println(sb.append("Solutions"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(4,6));
		System.out.println(sb.insert(5,"XXXXX"));
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		
		
		String s6="IfosysUser-IT-Chennai-Tamilnadu-India";
		
		String s6s[]=s6.split("-");
		//for 
		for(int i=0;i<s6s.length;i++)
			System.out.println(s6s[i]);
		
		//for each
		System.out.println("using for each");
		for(String s7:s6s)
			System.out.println(s7);
		
		
		StringTokenizer st=new StringTokenizer(s6,"-");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

		
		
	}

}
