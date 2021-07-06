package com.factcs.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factcs.crm.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
