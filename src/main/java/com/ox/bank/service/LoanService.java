package com.ox.bank.service;

import com.ox.bank.entity.Loan;
import com.ox.bank.exception.DataNotFoundException;

public interface LoanService {

	

	Loan applyLoan(Loan loan, Long customerId)throws DataNotFoundException;

}
