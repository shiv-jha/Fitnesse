package com.optum.hde.fitnesse;

import com.optum.hde.fitnesse.repo.impl.CoreRepoImpl;
import com.optum.hde.fitnesse.Environ;


public class SuiteSetUp {

	public void setupApp(String envId,String projectId, String clientId, String jobId) {
		Environ env = new Environ(envId, projectId, clientId, jobId);
		new CoreRepoImpl().setupDb(env);
	}
	
}
