package com.factcs.crm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.factcs.crm.entity.Customer;
import com.factcs.crm.service.CustomerService;

@CrossOrigin(origins = "http://localhost:8080/")
@SpringBootApplication
public class CrmApplication  implements CommandLineRunner{
	
//	@Autowired
//	private Customer customer;
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
	}

	

}
