package com.infosys.relationships.inheritance;

import com.infosys.Account;

class Wallet extends Account {
	 
}

	class RegularCustomer extends Customer { //single
		private float discount;
		public RegularCustomer(String custId, String custName) {
			//this.setCustomerId(custId);
		//	this.setCustomerName(custName);
			super(custId,custName);
			this.discount = 5.0f;
			System.out.println("Child Constructor");
		}
		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public static void main(String[] args) {
			RegularCustomer regularCustomer = new RegularCustomer("C1010",
					"Johns Kora");
			regularCustomer.displayCustomerDetails();
		}
	}
	 