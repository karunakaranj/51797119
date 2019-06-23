package com.ox.bank.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ox.bank.entity.Customer;
import com.ox.bank.service.CustomerService;

public class CustomerControllerTest {
@Autowired
	private MockMvc mockMvc;
	@MockBean
	private CustomerService customerService;
	@Autowired
	WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void addCustomerTest() throws Exception {
		Customer cus = new Customer(1, "pradeep", 2345, 26, "male", "single", 670);

		ObjectMapper om = new ObjectMapper();

		String jsonObj = om.writeValueAsString(cus);

		when(customerService.addCustomer(cus)).thenReturn(cus);

		mockMvc.perform(MockMvcRequestBuilders.post("/register/customer/add").contentType(MediaType.APPLICATION_JSON)
				.content(jsonObj)).andExpect(status().isCreated());

	}

}
