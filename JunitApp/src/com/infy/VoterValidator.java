package com.infy;

import java.io.IOException;

public class VoterValidator {
	public boolean validateVoterAge(int age) throws Exception {
		if(age<0)
			//System.out.println("ok");
			throw new IOException("Invalid age");
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public double gteEmi(double d) {
		return d/10;
	}
	}
