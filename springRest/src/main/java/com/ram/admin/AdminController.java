package com.ram.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@Autowired
	AdminQueryServiceImpl adminQueryServiceImpl;
	
	@RequestMapping("/assignment")
	public AssignmentDTO getDetails(@RequestParam("accountNumber") String accountNumber) {
		AssignmentDTO assignmentDTO = null;
		assignmentDTO = adminQueryServiceImpl.getAssignee();
		return assignmentDTO;
	}

}
