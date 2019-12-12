package com.optum.hde.fitnesse.repo.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import com.optum.hde.fitnesse.Environ;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.repo.TearDownRepo;

public class TearDownRepoImpl implements TearDownRepo {

	private final static Logger log = Logger.getLogger(TearDownRepoImpl.class.getName());
	
	public boolean cleanupMeasureData(Environ env, String measureName, String population) {
		population = population.trim();
		
		String deleteAGGDataSQL = "DELETE from etl_oracle00.HDE_AGG_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		String deleteACCMeasureDataSQL = "DELETE from etl_oracle00.HDE_ACC_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		
		log.info("Data going to remove for population :" + population + " and measure:"+measureName);
		
		cleanupData(env, deleteACCMeasureDataSQL, measureName, population);
		cleanupData(env, deleteAGGDataSQL, measureName, population);
		
		return true;
	}
	
	public boolean cleanupP4pMeasureData(Environ env, String measureName, String population) {
		population = population.trim();
		
		String deleteAGGDataSQL = "DELETE from etl_oracle00.HDE_AGG_P4P_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		String deleteACCMeasureDataSQL = "DELETE from etl_oracle00.HDE_ACC_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		
		log.info("Data going to remove for population :" + population + " and measure:"+measureName);
		
		cleanupData(env, deleteACCMeasureDataSQL, measureName, population);
		cleanupData(env, deleteAGGDataSQL, measureName, population);
		
		return true;
	}

	public boolean cleanupACCMeasureData(Environ env, String measureName, String population) {
		population = population.trim();
		if (population.contains(",")) {
			population = population.replace(",", "|");
		}
		
		log.info("Data going to remove for population :" + population + " and measure:"+measureName);
		String deleteACCMeasureDataSQL = "DELETE from etl_oracle00.HDE_ACC_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		
		cleanupData(env, deleteACCMeasureDataSQL, measureName, population);
		
		return true;
	}

	public boolean cleanupAggregationMeasureData(Environ env,String measureName, String population) {
		
		population = population.trim();
		String deleteAGGDataSQL = "DELETE from etl_oracle00.HDE_AGG_MEASURES where MEASURE_NAME = ? AND POPULATION_ID = ? ";
		log.info("Data going to remove for population :" + population + " and measure:"+measureName);
		cleanupData(env, deleteAGGDataSQL, measureName, population);
		
		return true;
	}

	private void cleanupData(Environ env, String query, String measureName, String population) {
		Connection connection;
		if (env.envId.equalsIgnoreCase("STG")){
			log.info("Creating STG db connection");
			connection = ConnectionManager.STG.get();
		}else if (env.envId.equalsIgnoreCase("STGNEW")){
			log.info("Creating STGNEW db connection");
			connection = ConnectionManager.STGNEW.get();
		}else if (env.envId.equalsIgnoreCase("QANEW")) {
			log.info("Creating QANEW db connection");
			connection = ConnectionManager.QANEW.get();
		}else {
			connection = ConnectionManager.CONNECTION.get();
		}
		
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, measureName);
			preparedStatement.setString(2, population);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			throw new IllegalStateException("Problem occurred while deleting measure data:" + measureName , e);
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
	}

	public boolean truncatePartitionData(Environ env, String fileName, String measureName) {
		truncateAGGPartitionData(env, fileName, measureName, "NonRRU");
		truncateACCPartitionData(env, fileName, measureName, "NonRRU");
					
		log.info("Successfully truncated all details!!! Measure Name: "+ measureName);
			
		return true;
	}

	public boolean truncateRRUPartitionData(Environ env, String fileName, String measureName) {
		truncateAGGPartitionData(env, fileName, measureName, "RRU");
		truncateACCPartitionData(env, fileName, measureName, "RRU");
					
		log.info("Successfully truncated all details!!! Measure Name: "+ measureName);
			
		return true;
	}
	
	private boolean truncateACCPartitionData(Environ env, String fileName, String measureName, String spType) {
		CallableStatement callableStatement = null;
		String subPartitionACCQuery = " { call PKG_MEASURES.Sp_truncate_measures_part(?,?,?)}";
		if ("RRU".equals(spType)) {
			subPartitionACCQuery = " { call PKG_MEASURES.Sp_truncate_RRU_measures_part(?,?,?)}";
		}
		
		Connection connection;
		if (env.envId.equalsIgnoreCase("STG")){
			log.info("Creating STG db connection");
			connection = ConnectionManager.STG.get();
		}else if (env.envId.equalsIgnoreCase("STGNEW")){
			log.info("Creating STGNEW db connection");
			connection = ConnectionManager.STGNEW.get();
		}else if (env.envId.equalsIgnoreCase("QANEW")) {
			log.info("Creating QANEW db connection");
			connection = ConnectionManager.QANEW.get();
		}else {
			connection = ConnectionManager.CONNECTION.get();
		}
		int projectKey = new CoreRepoImpl().getProjectKey(env);
		try {
			callableStatement=connection.prepareCall(subPartitionACCQuery);
			callableStatement.setInt(1, projectKey);
			callableStatement.setString(2, measureName);
			callableStatement.registerOutParameter(3, java.sql.Types.INTEGER);
			callableStatement.executeUpdate();
			
			log.info(spType + "- Successfully truncated ACC table data for project Key:" + projectKey + " Measure Name: "+ measureName);
		} catch (SQLException e) {
			log.severe("Problem occurred while truncating  " +spType+ " ACC table data for project key:" + projectKey + " and measure name:" + measureName);
			throw new IllegalStateException("Problem occurred while truncating  " +spType+ " ACC table data for project key:" + projectKey + " and measure name:" + measureName , e);
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
		
		return true;
	}

	private boolean truncateAGGPartitionData(Environ env, String fileName, String measureName, String spType) {
		Connection connection;
		if (env.envId.equalsIgnoreCase("STG")){
			log.info("Creating STG db connection");
			connection = ConnectionManager.STG.get();
		}else if (env.envId.equalsIgnoreCase("STGNEW")){
			log.info("Creating STGNEW db connection");
			connection = ConnectionManager.STGNEW.get();
		}else if (env.envId.equalsIgnoreCase("QANEW")) {
			log.info("Creating QANEW db connection");
			connection = ConnectionManager.QANEW.get();
		}else {
			connection = ConnectionManager.CONNECTION.get();
		}
		String subPartitionAGGQuery = " { call PKG_MEASURES.Sp_truncate_aggregate_part(?,?,?)}";
		if ("RRU".equals(spType)) {
			subPartitionAGGQuery = " { call PKG_MEASURES.Sp_truncate_RRU_aggregate_part(?,?,?)}";
		}
		
		CallableStatement callableStatement = null;
		int projectKey = new CoreRepoImpl().getProjectKey(env);
		try {
			callableStatement = connection.prepareCall(subPartitionAGGQuery);
			callableStatement.setInt(1, projectKey);
			callableStatement.setString(2, measureName);
			callableStatement.registerOutParameter(3, java.sql.Types.INTEGER);
			callableStatement.executeUpdate();
			
			log.info(spType + " Aggregation table data truncated for Project key :" + projectKey + " and measure name:" + measureName);
		} catch (SQLException e) {
			log.severe("Problem occurred while truncating " +spType+ " Aggregation table data for project key:" + projectKey + " and measure name:" + measureName);
			throw new IllegalStateException("Problem occurred while truncating  " +spType+ " Aggregation table data for project key:" + projectKey + " and measure name:" + measureName , e);
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
		return true;
	}

}
