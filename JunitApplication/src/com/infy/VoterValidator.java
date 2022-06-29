package com.infy;
public class VoterValidator {
	
	public boolean validateVoterAge(int age) throws Exception {
		if(age<0)
			throw new Exception("Invalid age");
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * public static void main(String[] args)throws Exception { 
	 * VoterValidator v=new
	 * VoterValidator(); 
	 * System.out.println(v.validateVoterAge(2)); }
	 */
}