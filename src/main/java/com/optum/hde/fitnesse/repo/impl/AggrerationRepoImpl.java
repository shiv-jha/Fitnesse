package com.optum.hde.fitnesse.repo.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.domain.Aggregation;
import com.optum.hde.fitnesse.repo.AggrerationRepo;

public class AggrerationRepoImpl implements AggrerationRepo {

	private static final Logger log = Logger.getLogger(AggrerationRepoImpl.class.getName());
	
	public List<Aggregation> getAggregationByMeasure(String envId, String measureName, String populationId, int projectKey) {
		List<Aggregation> aggregations = new ArrayList<Aggregation>();
		Connection connection;
		if (envId.equalsIgnoreCase("STG")){
			log.info("Creating Stage db connection");
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
		
		Statement stmt = null;
		try {
			stmt = connection.createStatement();

			ResultSet resultSet = stmt
					.executeQuery("select * from Etl_Oracle00.HDE_AGG_MEASURES where MEASURE_NAME='"
							+ measureName
							+ "' and POPULATION_ID='"
							+ populationId + "' and PROJECT_KEY='" + projectKey + "'");


			readData(aggregations, resultSet);
			resultSet.close();
			
			log.info("Loaded data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId);
		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId);
			throw new IllegalStateException("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId, e);
		} finally {
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

	public List<Aggregation> getAggregationByMeasure(String envId, String measureName, String populationId, String productLine, int projectKey) {
		List<Aggregation> aggregations = new ArrayList<Aggregation>();
		Connection connection;
		if (envId.equalsIgnoreCase("STG")){
			log.info("Creating Stage db connection");
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
		Statement stmt = null;
		try {
			stmt = connection.createStatement();

			ResultSet resultSet = stmt
					.executeQuery("select * from Etl_Oracle00.HDE_AGG_MEASURES where MEASURE_NAME='"
							+ measureName
							+ "' and POPULATION_ID='"
							+ populationId + "' and PRODUCT_LINE='" + productLine + "' and PROJECT_KEY='" + projectKey + "'");


			readData(aggregations, resultSet);
			resultSet.close();
			log.info("Loaded data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId);
		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId);
			throw new IllegalStateException("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and population:" + populationId, e);
		} finally {
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

	public List<Aggregation> getAggregationByProductKey(String envId, String measureName, String projectKey, String productType) {
		List<Aggregation> aggregations = new ArrayList<Aggregation>();
		Connection connection;
		if (envId.equalsIgnoreCase("STG")){
			log.info("Creating Stage db connection");
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
		Statement stmt = null;
		try {
			stmt = connection.createStatement();

			ResultSet resultSet = stmt
					.executeQuery("select * from Etl_Oracle00.HDE_AGG_MEASURES where MEASURE_NAME='"
							+ measureName
							+ "' and PROJECT_KEY='" + projectKey + "' and PRODUCT_TYPE='" + productType +"'");


			readData(aggregations, resultSet);
			resultSet.close();
			
			log.info("Loaded data from HDE_AGG_MEASURES for measure:" + measureName +" and project key:" + projectKey +" and productKey :" + productType );
		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and project key:" + projectKey +" and productKey :" + productType);
			throw new IllegalStateException("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and project key :" + projectKey, e);
		} finally {
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

	public List<Aggregation> getAggregationByProjectKey(String envId, String measureName, String projectKey) {
		List<Aggregation> aggregations = new ArrayList<Aggregation>();
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
		Statement stmt = null;
		try {
			stmt = connection.createStatement();

			ResultSet resultSet = stmt
					.executeQuery("select * from Etl_Oracle00.HDE_AGG_MEASURES where MEASURE_NAME='"
							+ measureName
							+ "' and PROJECT_KEY='" + projectKey +"'");


			readData(aggregations, resultSet);
			resultSet.close();
			
			log.info("Loaded data from HDE_AGG_MEASURES for measure:" + measureName +" and project key:" + projectKey);
		} catch (SQLException e) {
			log.severe("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and project key:" + projectKey);
			throw new IllegalStateException("Problem occurred while getting data from HDE_AGG_MEASURES for measure:" + measureName +" and project key :" + projectKey, e);
		} finally {
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

	private void readData(List<Aggregation> aggregations, ResultSet resultSet)
			throws SQLException {
		while (resultSet.next()) {
			Aggregation aggregation = new Aggregation();
			aggregation.setProjectKey(resultSet.getLong("PROJECT_KEY"));
			aggregation.setMeasureName(resultSet.getString("MEASURE_NAME"));
			aggregation.setReportType(resultSet.getString("REPORT_TYPE"));
			aggregation.setPopulationId(resultSet
					.getString("POPULATION_ID"));
			aggregation.setProductLine(resultSet.getString("PRODUCT_LINE"));
			aggregation.setIdssElement(resultSet.getString("IDSS_ELEMENT"));
			aggregation.setValue(resultSet.getDouble("VALUE"));

			aggregations.add(aggregation);
		}
	}
}
