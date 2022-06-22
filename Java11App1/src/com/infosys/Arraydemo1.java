package com.infosys;

class Department{
	int deptId;
	String deptName;
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}

public class Arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,1};
		
		int[] b= {6,7,8,9};
		
		int c[]=new int[5];
		c[1]=90;
		c[0]=23;
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		System.out.println(" for each loop");
		
		for(int x:c)
			System.out.println(x);
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		for (long contactNumber : restaurantContacts) {
			System.out.println(contactNumber);
		}
		
		
		int scores[][]= {{2},{3,2,5,9,8},{6,8}};  //3 X 3
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j] +" ");
			}
			System.out.println();
		}
		
		
		Department dept[]=new Department[3];
		dept[0]=new Department(10,"IT");
		dept[1]=new Department(20,"ADMIN");
		dept[2]=new Department(30,"INFRA");
		
		for(Department d:dept)
			System.out.println(d);
		
		
		
		
		
	}

}
