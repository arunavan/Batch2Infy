package com.junit;
public class VoterValidator {
	
	int getAge(int sscage) {
		return sscage+15;
	}
	
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
}
