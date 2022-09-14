package com.infosys;
public class Stringdemo1 {
	public static void main(String[] args) {
      String name=new String("InfosysUser2022");  //java.lang  object
       String name1=new String("InfosysUser2022/I");
      String name2=new String("InfosysUser2022/I");
 		String s="InfosysUser";//literal
		String r="infosysuser";
		String s1="InfosysUser"; //sp ,immutable , cannot be modified
     System.out.println(s.hashCode() +"  "+s1.hashCode());
      String s2=s.concat("-IT Department"); //duplicate objects
      System.out.println(s2);
      System.out.println(s);
      System.out.println(s.toUpperCase());
      System.out.println(s);
      System.out.println(s.charAt(2));
      System.out.println(s.length());
      System.out.println(s.indexOf("s"));
      System.out.println(s.lastIndexOf("s"));
      System.out.println(s.substring(3,6));
      System.out.println(s.equals(r));
      System.out.println(s.equalsIgnoreCase(r));
      System.out.println(s.replace("o", "X"));
      
      String s9="infosys";
      StringBuffer sb=new StringBuffer(s9);//mutable  , slow, synchronized
      System.out.println(sb.append(90));
      System.out.println(sb.insert(4, "XXXXX"));
      System.out.println(sb);
      System.out.println(sb.delete(3, 6));
      System.out.println(sb.capacity());
      sb.ensureCapacity(50);// increase , reduce
      System.out.println(sb.reverse());
      String s10=sb.toString();
      
      StringBuilder sb1=new StringBuilder(s9); //not sync, fast, mutable, will not create duplicates
      String s11=sb1.toString();
      

	}

}
