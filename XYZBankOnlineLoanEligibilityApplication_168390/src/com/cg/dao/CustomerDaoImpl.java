package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.dto.CustomerDetail;

@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{
	
	@PersistenceContext
	EntityManager entityManager=null;
	
	//setters and getters for entity manager
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	public CustomerDetail findPanCard(String panCardNo) {
		return entityManager.find(CustomerDetail.class, panCardNo);
	}

}
