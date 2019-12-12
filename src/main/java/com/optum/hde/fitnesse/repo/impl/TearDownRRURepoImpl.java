package com.optum.hde.fitnesse.repo.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.Environ;

public class TearDownRRURepoImpl {

	private final static Logger log = Logger.getLogger(TearDownRRURepoImpl.class.getName());
	
	public boolean truncateProjectPartitionData(Environ env, String fileName, String measureName) {
		truncateAGGPartitionData(env, fileName, measureName);
		truncateACCPartitionData(env, fileName, measureName);
					
		log.info("Successfully truncated all details!!! Measure Name: "+ measureName);
			
		return true;
	}

	public boolean truncateACCPartitionData(Environ env, String fileName, String measureName) {
		CallableStatement callableStatement = null;
		String subPartitionACCQuery = " { call PKG_MEASURES.Sp_truncate_RRU_measures_part(?,?,?)}";	
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
			
			log.info("Successfully truncated ACC table data for project Key:" + projectKey + " Measure Name: "+ measureName);
		} catch (SQLException e) {
			e.printStackTrace();
			log.severe("Problem occurred while truncating ACC table data for project key:" + projectKey + " and measure name:" + measureName);
			throw new IllegalStateException("Problem occurred while truncating ACC table data for project key:" + projectKey + " and measure name:" + measureName , e);
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return true;
	}

	public boolean truncateAGGPartitionData(Environ env, String fileName, String measureName) {
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
		String subPartitionAGGQuery = " { call PKG_MEASURES.Sp_truncate_RRU_aggregate_part(?,?,?)}";
		
		CallableStatement callableStatement = null;
		int projectKey = new CoreRepoImpl().getProjectKey(env);
		try {
			callableStatement = connection.prepareCall(subPartitionAGGQuery);
			callableStatement.setInt(1, projectKey);
			callableStatement.setString(2, measureName);
			callableStatement.registerOutParameter(3, java.sql.Types.INTEGER);
			callableStatement.executeUpdate();
			
			log.info("Aggregation table data truncated for Project key :" + projectKey + " and measure name:" + measureName);
		} catch (SQLException e) {
			e.printStackTrace();
			log.severe("Problem occurred while truncating Aggregation table data for project key:" + projectKey + " and measure name:" + measureName);
			throw new IllegalStateException("Problem occurred while truncating Aggregation table data for project key:" + projectKey + " and measure name:" + measureName , e);
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
}
