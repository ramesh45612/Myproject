package com.ram.comments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CommentQueryRepositoryImpl {

	public List<CommentsDTO> getComments(String entityID, String entityTypeID) {
		ArrayList<CommentsDTO> list = new ArrayList<CommentsDTO>();

		CommentsDTO one = new CommentsDTO();
		one.setComment("comment1");
		one.setCommentID("commentID1");
		one.setCreatedBy("createdBy1");
		one.setEntityID("entityID1");
		one.setEntityTypeID("entityTypeID1");
		
		CommentsDTO two = new CommentsDTO();
		two.setComment("comment2");
		two.setCommentID("commentID2");
		two.setCreatedBy("createdBy2");
		two.setEntityID("entityID2");
		two.setEntityTypeID("entityTypeID2");
		
		list.add(one);
		list.add(two);

		return list;
	}

}
