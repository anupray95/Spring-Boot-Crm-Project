package com.factcs.crm.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factcs.crm.entity.Customer;

@Repository
public class CustomerDaoImpl {
	
	@Autowired
	private EntityManager em;
	
	
	@Transactional
	public void update(Customer cs)
	{
		Customer customer = em.find(Customer.class, cs.getId());
		customer.setEmail(cs.getEmail());
		customer.setFirstName(cs.getFirstName());
		customer.setLastName(cs.getLastName());
		System.out.println("This is in dao "+customer);
		em.merge(customer);
	}

}
