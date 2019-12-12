package com.optum.hde.fitnesse;

public class Environ {
	public String envId;
	public String projectId;
	public String clientId;
	public String jobId;
	private String landingZone;
	
	public Environ(String envId, String projectId, String clientId, String jobId) {
		this.envId=envId;
		this.projectId=projectId;
		this.clientId=clientId;
		this.jobId=jobId;
	}
	
	public void setLandingZone(String landing) {
		this.landingZone = landing;
	}
	
	public String getLandingZone() {
		return landingZone;
	}

	public boolean equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}