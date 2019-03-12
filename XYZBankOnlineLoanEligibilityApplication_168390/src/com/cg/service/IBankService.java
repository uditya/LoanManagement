package com.cg.service;

import com.cg.dto.CustomerDetail;

public interface IBankService {
	public CustomerDetail findPanCard(String panCardNo);

}
