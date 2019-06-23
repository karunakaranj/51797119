package com.ox.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ox.bank.entity.Officer;
import com.ox.bank.repository.OfficerRepository;
@Service
public class OfficerServiceImpl implements OfficerService {

	@Autowired
	private OfficerRepository officerRepository;
	@Override
	public Officer applyLoan(Officer officer) {
		
		return officerRepository.save(officer);
	}

}
