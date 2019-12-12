package com.optum.hde.fitnesse.repo;

import com.optum.hde.fitnesse.Environ;

public interface TearDownRepo {

	boolean cleanupMeasureData(Environ env, String measureName, String population);
	boolean cleanupAggregationMeasureData(Environ env, String measureName, String population);
	boolean cleanupACCMeasureData(Environ env, String measureName, String population);
	boolean cleanupP4pMeasureData(Environ env, String measureName, String population);
	
	boolean truncatePartitionData(Environ env, String fileName, String measureName);
	boolean truncateRRUPartitionData(Environ env, String fileName, String measureName);
}
