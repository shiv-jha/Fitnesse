package com.optum.hde.fitnesse.repo.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.domain.RRUAggregation;
import com.optum.hde.fitnesse.repo.RRUAggrerationRepo;

public class RRUAggrerationRepoImpl implements RRUAggrerationRepo {

	private final static Logger log = Logger.getLogger(RRUAggrerationRepoImpl.class
			.getName());

	public List<RRUAggregation> getRRUAggregationByMeasure(String envId, String measureName,
			String populationId, int riskGroup, int year, String gender, int projectKey) {
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
		List<RRUAggregation> aggregations = new ArrayList<RRUAggregation>();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			ResultSet resultSet = stmt
					.executeQuery("select * from etl_oracle00.HDE_AGG_RRU_MEASURES where MEASURE_NAME='"
							+ measureName
							+ "' and POPULATION_ID='"
							+ populationId
							+ "' and IDSS_RISK="
							+ riskGroup
							+ " and IDSS_YEAR="
							+ year
							+ " and IDSS_GENDER='"
							+ gender + "' and PROJECT_KEY='" + projectKey +  "'");


			while (resultSet.next()) {
				RRUAggregation aggregation = new RRUAggregation();
				aggregation.setProjectKey(resultSet.getLong("PROJECT_KEY"));
				aggregation.setMeasureName(resultSet.getString("MEASURE_NAME"));
				aggregation.setReportType(resultSet.getString("REPORT_TYPE"));
				aggregation.setPopulationId(resultSet.getString("POPULATION_ID"));
				aggregation.setProductLine(resultSet.getString("PRODUCT_LINE"));
				aggregation.setIdssElement(resultSet.getString("IDSS_METRIC"));
				aggregation.setIdssRisk(resultSet.getInt("IDSS_RISK"));
				aggregation.setIdssYear(resultSet.getInt("IDSS_YEAR"));
				aggregation.setIdssGender(resultSet.getString("IDSS_GENDER"));
				aggregation.setValue(resultSet.getDouble("VALUE"));

				aggregations.add(aggregation);
			}

			log.info("Loaded data from HDE_AGG_RRU_MEASURES for measure:" + measureName +" and population:" + populationId);
			resultSet.close();

		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_RRU_MEASURES for measure:"
					+ measureName + " and population:" + populationId);
			throw new IllegalStateException(
					"Problem occurred while getting data from HDE_AGG_RRU_MEASURES for measure:"
							+ measureName + " and population:" + populationId, e);
		} catch (NullPointerException n) {
			log.severe("Query returned no records while getting data from HDE_AGG_RRU_MEASURES for measure:"
					+ measureName + " and population:" + populationId);
			throw new IllegalStateException("Query returned no records from HDE_AGG_RRU_MEASURES");
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
