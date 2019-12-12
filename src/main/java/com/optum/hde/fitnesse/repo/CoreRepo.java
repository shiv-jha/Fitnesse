package com.optum.hde.fitnesse.repo;
import com.optum.hde.fitnesse.Environ;

public interface CoreRepo {

	int getProjectKey(Environ env);
	void setupDb(Environ env);
	boolean IsAccDataLoaded(Environ env, String measureName);
}
