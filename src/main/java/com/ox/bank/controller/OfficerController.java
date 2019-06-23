package com.ox.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.bank.entity.Officer;
import com.ox.bank.service.OfficerService;

@RestController
@RequestMapping("/officer")
public class OfficerController {

	@Autowired
	private OfficerService officerSerivce;
	
	
	@PostMapping("/customer/add")
	public ResponseEntity<Officer> applyLoan(@RequestBody Officer officer) {

		
		Officer officer1=officerSerivce.applyLoan(officer);
		
		return new ResponseEntity<>(officer1,HttpStatus.CREATED);
		
	}
	
}
