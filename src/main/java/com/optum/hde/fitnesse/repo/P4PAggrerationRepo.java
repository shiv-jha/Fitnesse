package com.optum.hde.fitnesse.repo;

import java.sql.SQLException;
import java.util.List;

import com.optum.hde.fitnesse.domain.P4PAggregation;

public interface P4PAggrerationRepo {

	List<P4PAggregation> getP4PAggregationByMeasure(String envId, String measureName, String populationId, String providerOrg, String measureId, int projectKey) throws SQLException, ClassNotFoundException;
}
