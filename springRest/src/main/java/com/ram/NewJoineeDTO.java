package com.ram;

import java.util.List;

public class NewJoineeDTO {
	private GeneralInfo genInfo;
	private PersonelInfo personelInfo;
	private List<EducationDetails> educationDetails;
	private List<DropDown>  qualificationArray;
	private List<DropDown> univerityNameArray;
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
	public List<DropDown> getQualificationArray() {
		return qualificationArray;
	}
	public void setQualificationArray(List<DropDown> qualificationArray) {
		this.qualificationArray = qualificationArray;
	}
	public List<DropDown> getUniverityNameArray() {
		return univerityNameArray;
	}
	public void setUniverityNameArray(List<DropDown> univerityNameArray) {
		this.univerityNameArray = univerityNameArray;
	}
	
	
}
