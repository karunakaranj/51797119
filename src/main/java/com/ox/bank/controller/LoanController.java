package com.ox.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.entity.Loan;
import com.ox.bank.exception.DataNotFoundException;
import com.ox.bank.service.LoanService;

@RestController
@RequestMapping("/apply")
public class LoanController {
	
	@Autowired
	private LoanService loanSerivce;
	
	
	@PostMapping("/customer/add/{customerId}")
	public ResponseEntity<Loan> applyLoan(@RequestBody Loan loan, @PathVariable ("CustomerId") long customerId)throws DataNotFoundException {

		
		Loan loan1=loanSerivce.applyLoan(loan,customerId);
		
		return new ResponseEntity<>(loan1,HttpStatus.CREATED);
		
	}
	

}
