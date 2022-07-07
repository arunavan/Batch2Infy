package com.infy.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="customer0")
public class Customer {

	@Id

	private Integer customerId;
	@Column
	private String emailId;
	@Column
	private String name;
	@Column
	private LocalDate dateOfBirth;

	
	public Customer() {
		super();
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.customerId == null) ? 0 : this.customerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (this.customerId == null) {
			if (other.customerId != null)
				return false;
		} 
		else if (!this.getCustomerid().equals(other.getCustomerid()))
			return false;
		return true;
	}



	public Customer(Integer customerid, String emailid, String name, LocalDate dateofbirth) {
		super();
		this.customerId = customerid;
		this.emailId = emailid;
		this.name = name;
		this.dateOfBirth = dateofbirth;
	}



	@Override
	public String toString() {
		return "Customer [customerid=" + customerId + ", emailid=" + emailId + ", name=" + name + ", dateofbirth="
				+ dateOfBirth + "]";
	}



	public Integer getCustomerid() {
		return customerId;
	}



	public void setCustomerid(Integer customerid) {
		this.customerId = customerid;
	}



	public String getEmailid() {
		return emailId;
	}



	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateofbirth() {
		return dateOfBirth;
	}



	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateOfBirth = dateOfBirth;
	}

	

}

/*
 * 
 * 
create table customer0(
   customer_id int,
   email_id varchar(50),
   name varchar(20),
   date_of_birth date,
   constraint ps_customer_id_pk primary key (customer_id)
);
insert into customer0 (customer_id, email_id, name, date_of_birth) values (1, 'martin@infy.com', 'martin', sysdate()- interval 9136 day);
commit;
select * from customer0;
 * 
 * */
