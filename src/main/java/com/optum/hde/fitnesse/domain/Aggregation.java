package com.optum.hde.fitnesse.domain;

import java.sql.Date;

public class Aggregation {

	private long projectKey;
	private String measureName;
	private String reportType;
	private String populationId;
	private String productLine;
	private String productType;
	private String idssElement;
	private double	value;
	private Date insertedDate;

	public long getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(long projectKey) {
		this.projectKey = projectKey;
	}

	public String getMeasureName() {
		return measureName;
	}

	public void setMeasureName(String measureName) {
		this.measureName = measureName;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getPopulationId() {
		return populationId;
	}

	public void setPopulationId(String populationId) {
		this.populationId = populationId;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getIdssElement() {
		return idssElement;
	}

	public void setIdssElement(String idssElement) {
		this.idssElement = idssElement;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getInsertedDate() {
		return insertedDate;
	}

	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}
}
