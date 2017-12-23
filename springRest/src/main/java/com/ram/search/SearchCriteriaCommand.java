package com.ram.search;

public class SearchCriteriaCommand {
	
	private SearchCriteria accountNumber;
	private SearchCriteria firstName;
	private SearchCriteria lastName;
	
	public SearchCriteria getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(SearchCriteria accountNumber) {
		this.accountNumber = accountNumber;
	}
	public SearchCriteria getFirstName() {
		return firstName;
	}
	public void setFirstName(SearchCriteria firstName) {
		this.firstName = firstName;
	}
	public SearchCriteria getLastName() {
		return lastName;
	}
	public void setLastName(SearchCriteria lastName) {
		this.lastName = lastName;
	}
	
}
