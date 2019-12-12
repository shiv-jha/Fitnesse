package com.optum.hde.fitnesse.repo.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.domain.P4PAggregation;
import com.optum.hde.fitnesse.repo.P4PAggrerationRepo;

public class P4PAggrerationRepoImpl implements P4PAggrerationRepo {

	private final static Logger log = Logger.getLogger(P4PAggrerationRepoImpl.class
			.getName());

	public List<P4PAggregation> getP4PAggregationByMeasure(String envId, String measureName,String populationId, String providerOrg, String measureId, int projectKey) {
		Connection connection;
		if (envId.equalsIgnoreCase("STG")){
			log.info("Creating STG db connection");
			connection = ConnectionManager.STG.get();
		}else if (envId.equalsIgnoreCase("STGNEW")){
			log.info("Creating STGNEW db connection");
			connection = ConnectionManager.STGNEW.get();
		}else if (envId.equalsIgnoreCase("QANEW")) {
			log.info("Creating QANEW db connection");
			connection = ConnectionManager.QANEW.get();
		}else {
			connection = ConnectionManager.CONNECTION.get();
		}
		log.info("DB connection established successfully");
		List<P4PAggregation> aggregations = new ArrayList<P4PAggregation>();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			ResultSet resultSet = null;
			
			if(providerOrg.equalsIgnoreCase("NULL")){
				resultSet = stmt
						.executeQuery("select * from etl_oracle00.HDE_AGG_P4P_MEASURES where MEASURE_NAME='" + measureName
								+ "' and POPULATION_ID='" + populationId
								+ "' and MEASURE_ID='"	+ measureId
								+ "' and PROJECT_KEY='" + projectKey
								+ "' and PROVIDER_ORG IS NULL ");
			} else {
				resultSet = stmt
						.executeQuery("select * from etl_oracle00.HDE_AGG_P4P_MEASURES where MEASURE_NAME='"
								+ measureName
								+ "' and POPULATION_ID='"
								+ populationId
								+ "' and PROVIDER_ORG='"
								+ providerOrg
								+ "' and MEASURE_ID='"
								+ measureId
								+ "' and PROJECT_KEY='" + projectKey +  "'");
			}

			while (resultSet.next()) {
				P4PAggregation aggregation = new P4PAggregation();
				aggregation.setProjectKey(resultSet.getLong("PROJECT_KEY"));
				aggregation.setMeasureName(resultSet.getString("MEASURE_NAME"));
				aggregation.setMeasureId(resultSet.getString("MEASURE_ID"));
				aggregation.setReportType(resultSet.getString("REPORT_TYPE"));
				aggregation.setPopulationId(resultSet.getString("POPULATION_ID"));
				aggregation.setProductLine(resultSet.getString("PRODUCT_LINE"));
				aggregation.setProductType(resultSet.getString("PRODUCT_TYPE"));
				aggregation.setIdssElement(resultSet.getString("IDSS_ELEMENT"));
				aggregation.setValue(resultSet.getDouble("VALUE"));
				aggregation.setClientKey(resultSet.getDouble("CLIENT_KEY"));
				aggregation.setProviderOrg(resultSet.getString("PROVIDER_ORG"));

				aggregations.add(aggregation);
			}

			log.info("Loaded data from HDE_AGG_P4P_MEASURES for measure:" + measureName +" and population:" + populationId);
			resultSet.close();

		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_P4P_MEASURES for measure:"
					+ measureName + " and population:" + populationId);
			throw new IllegalStateException(
					"Problem occurred while getting data from HDE_AGG_P4P_MEASURES for measure:"
							+ measureName + " and population:" + populationId, e);
		} catch (NullPointerException n) {
			log.severe("Query returned no records while getting data from HDE_AGG_P4P_MEASURES for measure:"
					+ measureName + " and population:" + populationId);
			throw new IllegalStateException("Query returned no records from HDE_AGG_P4P_MEASURES");
		}finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}

		return aggregations;
	}

}
