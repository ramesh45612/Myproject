package com.ram.comments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.admin.AdminQueryRepositoryImpl;

@Service
public class CommentQueryServiceImpl {
	@Autowired
	CommentQueryRepositoryImpl commentQueryRepositoryImpl;

	public List<CommentsDTO> getComments(String entityID, String entityTypeID) {
		List<CommentsDTO> list = commentQueryRepositoryImpl.getComments(entityID, entityTypeID);
		return list;
	}

	

}
