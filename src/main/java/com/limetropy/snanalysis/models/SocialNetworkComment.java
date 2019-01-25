package com.limetropy.snanalysis.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class SocialNetworkComment {

	@Id
	private String id;
	private String service;
	private String brand;
	private String comment;
	private String category;
	private String label;
	private String classification;
	private Date commentDate;

	public SocialNetworkComment() {
	}

	public SocialNetworkComment(String service, String brand, String comment, String category, String label,
	                            String classification, Date commentDate) {
		this.service = service;
		this.brand = brand;
		this.comment = comment;
		this.category = category;
		this.label = label;
		this.classification = classification;
		this.commentDate = commentDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
}
