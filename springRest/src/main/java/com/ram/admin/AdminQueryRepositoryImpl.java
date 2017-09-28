package com.ram.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AdminQueryRepositoryImpl {

	public List<AssigneeDTO> getAllassignees() {
		ArrayList<AssigneeDTO> assigneesList = new ArrayList<AssigneeDTO>();
		AssigneeDTO one= new AssigneeDTO();
		one.setAssigneeId("AssigneeId1");
		one.setAssigneeName("Ramesh");
		one.setAssigneeType("AssigneeType1");
		assigneesList.add(one);
		
		AssigneeDTO two= new AssigneeDTO();
		two.setAssigneeId("AssigneeId2");
		two.setAssigneeName("Venky");
		two.setAssigneeType("AssigneeType2");
		assigneesList.add(two);
	
		return assigneesList;
	}

	public List <WorkItemDTO> getAllworkItems() {
		ArrayList<WorkItemDTO> workItemsList = new ArrayList<WorkItemDTO>();
		 
		WorkItemDTO one = new WorkItemDTO();
		one.setWorkItemId("WorkItemId1");
		one.setAssignee("WorkItemAssignee1");
		one.setName("WorkItemName1");
		workItemsList.add(one);
		
		WorkItemDTO two = new WorkItemDTO();
		two.setWorkItemId("WorkItemId2");
		two.setAssignee("WorkItemAssignee2");
		two.setName("WorkItemName2");
		workItemsList.add(two);
		
		return workItemsList;
	}

	
}
