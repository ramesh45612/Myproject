package com.ram.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.register.RegisterCommand;

@RestController
public class CommentController {

	@Autowired
	CommentQueryServiceImpl commentQueryServiceImpl;
	
	@RequestMapping("/comment")
	public List<CommentsDTO> getComments(@RequestParam("entityID") String entityID ,@RequestParam("entityTypeID") String entityTypeID ) {
		List <CommentsDTO>list = commentQueryServiceImpl.getComments(entityID, entityTypeID);
		return list;
	}
	
	
	@RequestMapping(value ="/saveComments", method = RequestMethod.POST)
	public List<CommentsDTO> saveComments(@RequestBody List<CommentsDTO> command) {
		return null;
	}


}
