package com.optum.hde.fitnesse.back;

public class Measure {

	private String scriptName;
	private String measureName;
	private String patternNum;
	private String memberMonthCategory;
	private String fileName;
	private boolean isNcqaTest;
	
	public Measure(String scriptName, String measureName, String patternNum) {
		this.scriptName=scriptName;
		this.measureName=measureName;
		this.patternNum=patternNum;
	}
	
	public void setNcqaTest(boolean isNcqaTest) {
		this.isNcqaTest = isNcqaTest;
	}
	
	public boolean isNcqaTest() {
		return isNcqaTest;
	}
	
	public String getScriptName() {
		return scriptName;
	}

	public String getMeasureName() {
		return measureName;
	}

	public String getPatternNum() {
		return patternNum;
	}
	
	public void setMemberMonthCategory(String memberMonthCategory) {
		this.memberMonthCategory = memberMonthCategory;
	}
	
	public String getMemberMonthCategory() {
		return memberMonthCategory;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
