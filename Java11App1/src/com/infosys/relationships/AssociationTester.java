package com.infosys.relationships;
class CabServiceProvider{
    //Implement your code here
	
	private String cabServiceName;
	private int totalCabs;
	
	
	
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		super();
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	
	
	double calculateRewardPrice(Driver driver) {
		double amount=0.0;
		if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<5)
			amount=driver.getAverageRating()*10;
		
		return amount;
	}
	
	
	
}

class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

public class AssociationTester {
	
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.6f);
		Driver driver3 = new Driver("David", 4.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}
