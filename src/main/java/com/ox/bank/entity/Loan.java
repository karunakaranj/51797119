package com.ox.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loanDetails")

public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanAccountNumber;
	private String securityAddress;
	private double securityAmount;
	private String loanStatus;
	private double loanAmount;
	
	@OneToOne
	@JoinColumn(name = "CustomerId")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "Id")
	private Officer officer;
	
	
	public Loan(long loanAccountNumber, String securityAddress, double securityAmount, String loanStatus,
			double loanAmount, Customer customer, Officer officer) {
		super();
		this.loanAccountNumber = loanAccountNumber;
		this.securityAddress = securityAddress;
		this.securityAmount = securityAmount;
		this.loanStatus = loanStatus;
		this.loanAmount = loanAmount;
		this.customer = customer;
		this.officer = officer;
	}
	public Loan() {
		
	}

	public double getSecurityAmount() {
		return securityAmount;
	}
	public void setSecurityAmount(double securityAmount) {
		this.securityAmount = securityAmount;
	}
	public long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public String getSecurityAddress() {
		return securityAddress;
	}
	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public Officer getOfficer() {
		return officer;
	}
	public void setOfficer(Officer officer) {
		this.officer = officer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
