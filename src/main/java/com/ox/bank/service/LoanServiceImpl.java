package com.ox.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ox.bank.entity.Customer;
import com.ox.bank.entity.Loan;
import com.ox.bank.exception.DataNotFoundException;
import com.ox.bank.repository.CustomerRepository;
import com.ox.bank.repository.LoanRepository;
@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Loan applyLoan(Loan loan, Long customerId) throws DataNotFoundException {
		
		if(customerRepository.findByCustomerId(customerId)==null) {
			throw new  DataNotFoundException ("data not found please enter valid userId");
		}
			Customer customer=customerRepository.findByCustomerId(customerId);
		
		
		if(customer.getAge()>=24 && customer.getAge()<=60 && loan.getLoanAmount()==2*loan.getSecurityAmount() )
	
		{
		Loan loan1=new Loan();
		loan1.setLoanStatus("approved");
		
		return loanRepository.save(loan1);
	} else {
		return null;
	}

}
}
