package com.factcs.crm.Controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.factcs.crm.entity.Customer;
import com.factcs.crm.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	
	@GetMapping("/hii")
	public String func()
	{
		return "Hello";
	}

	@PostMapping("/save")
	public void save(@RequestBody Customer cs)
	{
		customerService.save(cs);	
	}
	
	@GetMapping("/")
	public List<Customer> findAll()
	{
		return customerService.findAll();
		
	}
	

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id)
	{
		customerService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Customer cs) {
		customerService.update(cs);
	}
	
}
