package com.optum.hde.fitnesse.repo;

import java.sql.SQLException;
import java.util.List;

import com.optum.hde.fitnesse.domain.RRUAggregation;

public interface RRUAggrerationRepo {

	List<RRUAggregation> getRRUAggregationByMeasure(String envId, String measureName, String populationId, int riskGroup, int year, String gender, int projectKey) throws SQLException, ClassNotFoundException;
}
