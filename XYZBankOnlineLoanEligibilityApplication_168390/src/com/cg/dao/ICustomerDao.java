package com.cg.dao;

import com.cg.dto.CustomerDetail;

public interface ICustomerDao {
			public CustomerDetail findPanCard(String panCardNo);
}
