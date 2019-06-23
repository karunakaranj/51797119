package com.ox.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ox.bank.entity.Customer;
import com.ox.bank.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
