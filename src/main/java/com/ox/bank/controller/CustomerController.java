package com.ox.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.entity.Customer;
import com.ox.bank.service.CustomerService;

@RestController
@RequestMapping("/register")
public class CustomerController {
	@Autowired
	private CustomerService customerSerivce;
	
	
	@PostMapping("/customer/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
	
		
		Customer customer1=customerSerivce.addCustomer(customer);
		
		return new ResponseEntity<>(customer1,HttpStatus.CREATED);
		
	}
}
