package com.optum.hde.fitnesse.domain;

import java.sql.Date;

public class RRUAggregation {
	private long projectKey;
	private String measureName;
	private String reportType;
	private String populationId;
	private String productLine;
	private String productType;
	private String idssElement;
	private int idssRisk;
	private int idssYear;
	private String idssGender;
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

	public int getIdssRisk() {
		return idssRisk;
	}

	public void setIdssRisk(int idssRisk) {
		this.idssRisk = idssRisk;
	}

	public int getIdssYear() {
		return idssYear;
	}

	public void setIdssYear(int idssYear) {
		this.idssYear = idssYear;
	}

	public String getIdssGender() {
		return idssGender;
	}

	public void setIdssGender(String idssGender) {
		this.idssGender = idssGender;
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
