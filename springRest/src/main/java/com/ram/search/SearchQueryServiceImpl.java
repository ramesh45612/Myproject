package com.ram.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchQueryServiceImpl {

	@Autowired
	SearchQueryRepositoryImpl searchQueryRepositoryImpl;
	public List<WorkItemDTO> retrieveWorktems(SearchCriteriaCommand searchCriteria) {
		 return searchQueryRepositoryImpl.retrieveWorktems(searchCriteria);
	}
}
