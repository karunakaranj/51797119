package com.ox.bank.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ox.bank.entity.Customer;
import com.ox.bank.repository.CustomerRepository;
@RunWith(MockitoJUnitRunner.Silent.class)
public class CustomerServiceImplTest {
	@InjectMocks
	CustomerServiceImpl customerService;
	@Mock
	CustomerRepository customerRepository;

	@Test
	public void addCustomerTest() {
		Customer cus = new Customer(1, "pradeep", 2345, 26, "male", "single", 670);

		Mockito.when(customerRepository.save(cus)).thenReturn(cus);

		Customer cust = customerService.addCustomer(cus);
		assertEquals(cust, cus);

	}

}
