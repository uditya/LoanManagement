package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class CustomerDetail {
	@Id
	@Column(name="Pan_Card_Number")
	private String panCardNo;
	
	@Column(name="Customer_Name")
	private String customerName;
	
	@Column(name="Email_id",unique=true)
	private String email;
	
	@Column(name="Mobile_Number",unique=true)
	private String mobileNumber;
	
	@Column(name="Cibil_Score")
	private int cibilScore;
	
	
	//setters and getters method

	public String getCustomerName() {
		return customerName;
	}

	

	public String getPanCardNo() {
		return panCardNo;
	}



	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	
	

}
