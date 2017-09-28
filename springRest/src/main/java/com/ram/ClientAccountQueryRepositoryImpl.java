package com.ram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientAccountQueryRepositoryImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public ClintAccountLockDTO getClientLockStatus(String accountNumber) {

		ClintAccountLockDTO clintAccountLockDTO = null;

		String sql = "select nvl2(LOCKEDBYUSER,'true','false'),LOCKEDDATE from client_acc_record where ACCOUNTNUMBER =?";

		return null;

	}

	public NewJoineeDTO getNewJoineeDetails(String accountNumber) {
		
		NewJoineeDTO newJoineeDTO = new NewJoineeDTO();
		newJoineeDTO.setPersonelInfo(getpersonelInfo());
		newJoineeDTO.setGenInfo(getGenInfo());
		newJoineeDTO.setEducationDetails(getEducationDetails());
	
		//below for drop down
		newJoineeDTO.setQualificationArray(getQualificationArray());
		newJoineeDTO.setUniverityNameArray(getUniversityArray());
		return newJoineeDTO;
		
	}

	private PersonelInfo getpersonelInfo() {
		PersonelInfo pi = new PersonelInfo();
		pi.setContact1("12345");
		pi.setContact2("1345");
		pi.setCurrentAddress(getCurrentAddress());
		pi.setDob("12/2/17");
		pi.setEmail("ra@g.com");
		pi.setFatherName("Venkanna");
		pi.setFirstName("First");
		pi.setGender("male");
		pi.setLastName("Last");
		pi.setMarital("Single");
		pi.setPan("asdfg1234w");
		pi.setPermanentAddress(getPermanentAddress());
		return pi;
	}

	private GeneralInfo getGenInfo() {

		GeneralInfo gen = new GeneralInfo();
		gen.setAppNumber("appNumber");
		gen.setDateOfApplication(new Date());
		gen.setJoiningLocation("Hyderabad");
		return gen;
	}

	private List<DropDown> getUniversityArray() {
		DropDown dd1= new DropDown("1","OU");
		DropDown dd2= new DropDown("2","KU"); 
		DropDown dd3= new DropDown("3","SKU)");
		DropDown dd4= new DropDown("4","HCU");
		DropDown dd5= new DropDown("5","OTHERS");
		List list = new ArrayList<DropDown>();
		list.add(dd1);
		list.add(dd2);
		list.add(dd3);
		list.add(dd4);
		list.add(dd5);
		return list;
	}

	private List<DropDown> getQualificationArray() {
		DropDown dd1= new DropDown("1","SSC (10TH)");
		DropDown dd2= new DropDown("2","INTERMEDIATE (12TH)"); 
		DropDown dd3= new DropDown("3","UG)");
		DropDown dd4= new DropDown("4","PG");
		DropDown dd5= new DropDown("5","DIPLOMA");
		List list = new ArrayList<DropDown>();
		list.add(dd1);
		list.add(dd2);
		list.add(dd3);
		list.add(dd4);
		list.add(dd5);
		return list;
	}

	private Address getPermanentAddress() {
		Address permanent = new Address();
		permanent.setCity("Nirmal");
		permanent.setState("Telangana");
		return permanent;
	
	}

	private Address getCurrentAddress() {
		Address current = new Address();
		current.setCity("Hyderabad");
		current.setState("Telangana");
		return current;
	}

	private List<EducationDetails> getEducationDetails() {
		EducationDetails educationDetails = new EducationDetails();
		EducationDetails educationDetails1 = new EducationDetails();
		EducationDetails educationDetails2 = new EducationDetails();
		
		educationDetails.setDiplomaName("NA");
		educationDetails.setId("20");
		educationDetails.setInstituteName("Matrusri");
		educationDetails.setPercentage("80");
		educationDetails.setPeriodFrom(new Date());
		educationDetails.setPeriodTo(new Date());
		educationDetails.setQualification("PG");
		educationDetails.setSpecialization("ComputeScience");
		educationDetails.setUniverityName("OU");
		
		educationDetails1.setDiplomaName("NA");
		educationDetails1.setId("30");
		educationDetails1.setInstituteName("Govt Degree College");
		educationDetails1.setPercentage("80");
		educationDetails1.setPeriodFrom(new Date());
		educationDetails1.setPeriodTo(new Date());
		educationDetails1.setQualification("UG");
		educationDetails1.setSpecialization("ComputeScience");
		educationDetails1.setUniverityName("KU");
		
		educationDetails2.setDiplomaName("NA");
		educationDetails2.setId("10");
		educationDetails2.setInstituteName("Govt Junior College");
		educationDetails2.setPercentage("80");
		educationDetails2.setPeriodFrom(new Date());
		educationDetails2.setPeriodTo(new Date());
		educationDetails2.setQualification("Intermediate");
		educationDetails2.setSpecialization("Maths");
		educationDetails2.setUniverityName("Board of Intermediate");
		
		List list = new ArrayList<EducationDetails>();
		
		list.add(educationDetails);
		list.add(educationDetails1);
		list.add(educationDetails2);
		return list;
	}

}
