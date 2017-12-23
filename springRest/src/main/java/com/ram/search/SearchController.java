package com.ram.search;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.comments.CommentQueryServiceImpl;
import com.ram.comments.CommentsDTO;

@RestController
@RequestMapping("/search")
public class SearchController {
	

	@Autowired
	SearchQueryServiceImpl searchQueryServiceImpl;
	
	@RequestMapping(value ="/searchWorkItem", method = RequestMethod.POST)
	public List<WorkItemDTO> searchWorkItem(@RequestBody SearchCriteriaCommand searchCriteria) {
		
		List<WorkItemDTO> list = searchQueryServiceImpl.retrieveWorktems(searchCriteria);
		return list;
	}
}


