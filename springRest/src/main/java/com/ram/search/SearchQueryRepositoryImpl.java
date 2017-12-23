package com.ram.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class SearchQueryRepositoryImpl {

	public List<WorkItemDTO> retrieveWorktems(SearchCriteriaCommand searchCriteria) {
		List<WorkItemDTO>  list=  new ArrayList<WorkItemDTO>();
		
// need to prepare sqlquery criteriastring 
		
		WorkItemDTO one = new WorkItemDTO();
		one.setAccountNumber("123");
		one.setFirstName("Namo");
		one.setLastName("Venkatesh");

		WorkItemDTO two = new WorkItemDTO();
		two.setAccountNumber("456");
		two.setFirstName("Lord");
		two.setLastName("Govindaaaaaaaa");
		
		WorkItemDTO three = new WorkItemDTO();
		three.setAccountNumber("three");
		three.setFirstName("Lord");
		three.setLastName("Venkatesh");
	
		WorkItemDTO four = new WorkItemDTO();
		four.setAccountNumber("four");
		four.setFirstName("Lord");
		four.setLastName("Venkatesh");
		
		WorkItemDTO five = new WorkItemDTO();
		five.setAccountNumber("five");
		five.setFirstName("Lord");
		five.setLastName("Venkatesh");
		
		WorkItemDTO six = new WorkItemDTO();
		six.setAccountNumber("six");
		six.setFirstName("Lord");
		six.setLastName("Venkatesh");
		
		
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		list.add(five);
		list.add(six);
		list.add(six);
		list.add(six);
		list.add(six);
		list.add(six);
		list.add(six);
		list.add(six);
		list.add(six);

		return list;
	}

}
