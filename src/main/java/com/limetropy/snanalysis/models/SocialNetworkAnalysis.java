package com.limetropy.snanalysis.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class SocialNetworkAnalysis {

	@Id
	private String id;
	private String service;
	private String brand;
	private String category;
	private String label;
	private Integer negative;
	private Integer neutral;
	private Integer positive;
	private Integer total;
	private Date analysisDate;

	public SocialNetworkAnalysis(){}

	public SocialNetworkAnalysis(String service, String brand, String category, String label,
	                             Integer negative, Integer neutral, Integer positive, Integer total,
	                             Date analysisDate) {
		this.service = service;
		this.brand = brand;
		this.category = category;
		this.label = label;
		this.negative = negative;
		this.neutral = neutral;
		this.positive = positive;
		this.total = total;
		this.analysisDate = analysisDate;
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

	public Integer getNegative() {
		return negative;
	}

	public void setNegative(Integer negative) {
		this.negative = negative;
	}

	public Integer getNeutral() {
		return neutral;
	}

	public void setNeutral(Integer neutral) {
		this.neutral = neutral;
	}

	public Integer getPositive() {
		return positive;
	}

	public void setPositive(Integer positive) {
		this.positive = positive;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getAnalysisDate() {
		return analysisDate;
	}

	public void setAnalysisDate(Date analysisDate) {
		this.analysisDate = analysisDate;
	}
}
