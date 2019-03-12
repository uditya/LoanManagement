package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;
import com.cg.dto.CustomerDetail;

@Service
public class BankServiceImpl implements IBankService{
	@Autowired
	ICustomerDao customerD;

	//setters and getters for Dao interface
	public ICustomerDao getCustomerD() {
		return customerD;
	}
	public void setCustomerD(ICustomerDao customerD) {
		this.customerD = customerD;
	}

	@Override
	public CustomerDetail findPanCard(String panCardNo) {
		return customerD.findPanCard(panCardNo);
	}
	
	

}
