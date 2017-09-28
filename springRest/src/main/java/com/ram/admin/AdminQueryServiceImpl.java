package com.ram.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.ClientAccountQueryRepositoryImpl;

@Service
public class AdminQueryServiceImpl {

	@Autowired
	AdminQueryRepositoryImpl adminQueryRepository;
	public AssignmentDTO getAssignee() {
		AssignmentDTO assignmentDTO = new AssignmentDTO();
		assignmentDTO.setAssignees(getAllassignees());
		assignmentDTO.setWorkItems(getAllworkItems());
		return assignmentDTO;
	}
	
	public List<AssigneeDTO> getAllassignees(){
		List <AssigneeDTO> assignees = adminQueryRepository.getAllassignees();
		return assignees;
	}
	
	public List<WorkItemDTO> getAllworkItems(){
		List <WorkItemDTO> workItems = adminQueryRepository.getAllworkItems();
		return workItems;
	}

}
