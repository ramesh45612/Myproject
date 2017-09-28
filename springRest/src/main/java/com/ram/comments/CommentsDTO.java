package com.ram.comments;

public class CommentsDTO {
	private String entityID;
	private String entityTypeID;
	private String commentID;
	private String comment;
	private String createdBy;
	
	public String getEntityID() {
		return entityID;
	}
	public void setEntityID(String entityID) {
		this.entityID = entityID;
	}
	public String getEntityTypeID() {
		return entityTypeID;
	}
	public void setEntityTypeID(String entityTypeID) {
		this.entityTypeID = entityTypeID;
	}
	public String getCommentID() {
		return commentID;
	}
	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	

}
