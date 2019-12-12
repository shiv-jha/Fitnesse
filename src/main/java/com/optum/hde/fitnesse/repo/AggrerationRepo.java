package com.optum.hde.fitnesse.repo;

import java.util.List;

import com.optum.hde.fitnesse.domain.Aggregation;

public interface AggrerationRepo {

	List<Aggregation> getAggregationByMeasure(String envId, String measureName, String populationId, int projectKey);
	List<Aggregation> getAggregationByProductKey(String envId, String measureName, String projectKey, String productKey);
	List<Aggregation> getAggregationByProjectKey(String envId, String measureName, String projectKey);
}
