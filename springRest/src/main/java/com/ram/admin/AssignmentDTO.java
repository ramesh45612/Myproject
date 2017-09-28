package com.ram.admin;

import java.util.List;

public class AssignmentDTO {

	List<AssigneeDTO> assignees;
	List<WorkItemDTO> workItems;
	/**
	 * @return the assignees
	 */
	public List<AssigneeDTO> getAssignees() {
		return assignees;
	}
	/**
	 * @param assignees the assignees to set
	 */
	public void setAssignees(List<AssigneeDTO> assignees) {
		this.assignees = assignees;
	}
	/**
	 * @return the workItems
	 */
	public List<WorkItemDTO> getWorkItems() {
		return workItems;
	}
	/**
	 * @param workItems the workItems to set
	 */
	public void setWorkItems(List<WorkItemDTO> workItems) {
		this.workItems = workItems;
	}
		
}
