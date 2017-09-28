package com.ram;

import java.util.List;

public class NewJoineeCommand {
	private GeneralInfo genInfo;
	private PersonelInfo personelInfo;
	private List<EducationDetails> educationDetails;
	
	public GeneralInfo getGenInfo() {
		return genInfo;
	}
	public void setGenInfo(GeneralInfo genInfo) {
		this.genInfo = genInfo;
	}
	public PersonelInfo getPersonelInfo() {
		return personelInfo;
	}
	public void setPersonelInfo(PersonelInfo personelInfo) {
		this.personelInfo = personelInfo;
	}
	public List<EducationDetails> getEducationDetails() {
		return educationDetails;
	}
	public void setEducationDetails(List<EducationDetails> educationDetails) {
		this.educationDetails = educationDetails;
	}
	
	

}
