package com.factcs.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factcs.crm.dao.CustomerDao;
import com.factcs.crm.dao.CustomerDaoImpl;
import com.factcs.crm.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CustomerDaoImpl customerDaoImpl;

	
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	public void delete(int id) {
		customerDao.deleteById(id);
	}

	public void save(Customer c) {
		customerDao.save(c);
	}

	public void update(Customer cs) {
		System.out.println(cs);
		customerDaoImpl.update(cs);
	}

}
