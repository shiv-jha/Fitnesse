package com.optum.hde.fitnesse.repo.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.Properties;
import com.optum.hde.fitnesse.Environ;
import com.optum.hde.fitnesse.repo.CoreRepo;

public class CoreRepoImpl implements CoreRepo {

	private final static Logger log = Logger.getLogger(CoreRepoImpl.class.getName());
	
	public void setupDb(Environ env) {
		
		if (getProjectKey(env) == 0) { // No record found in the table
/*			Properties properties = Properties.MAP;
			String clientID = properties.getProperty("clientId");
			String projectID = properties.getProperty("projectId");
			String jobID = properties.getProperty("jobId");
*/			
			createEntryInProject(env);
		}
	}
	
	private void createEntryInProject(Environ env) {
		
		createEntryInMasterProjectList(env.envId, env.projectId, env.clientId);
		
		int maxProjKey = getMaxProjectKey(env.envId);
		String query = "Insert into Etl_Oracle00.HDE_PROJECT (PROJECT_KEY, PROJECT_ID, CLIENT_NAME, PACKAGE_FILE_NAME, SOURCE_PACKAGE_NAME, ACC_JOB_ID, DF_TRANSACTION_ID, "
				+ " FILE_RECV_DATE, "
				+ " CREATE_DT, CREATED_BY, IS_ARCHIEVED, ARCHIVED_DT, LOAD_PREP_TIME, LEGACY_PROJECT_KEY, RUN_TYPE, RUN_ADMIN_TYPE, MEASUREMENT_END_DATE)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
		PreparedStatement pstmt = null;
		int nextInt = -1;
		try {
			SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
			nextInt = new Integer(prng.nextInt());
		} catch (NoSuchAlgorithmException e1) {
			log.severe("Problem occurred while generating random packing file name number ");
			throw new IllegalStateException("Problem occurred while generating random packing file name number ");
		}
		
		try {
			  // create PrepareStatement object
			  pstmt = connection.prepareStatement(query);
			  pstmt.setInt(1, maxProjKey + 1);
			  pstmt.setString(2, env.projectId);
			  pstmt.setString(3, env.clientId);
			  pstmt.setString(4, "QATestPackageFile"+ nextInt);
			  pstmt.setString(5, "QATestSourcePackageFile");
			  pstmt.setString(6, env.jobId);
			  pstmt.setString(7, "123");
			  
			  Timestamp timestamp = new Timestamp(new Date().getTime());
			  
			  pstmt.setTimestamp(8, timestamp);
			  pstmt.setTimestamp(9, timestamp);
			  pstmt.setString(10, "QA_Fit");
			  pstmt.setString(11,"N");
			  pstmt.setDate(12, new java.sql.Date(new Date().getTime()));
			  pstmt.setInt(13, 30);
			  pstmt.setInt(14, 123);
			  pstmt.setString(15, "Fit");
			  pstmt.setString(16, "Fit");
			  pstmt.setDate(17, new java.sql.Date(new Date().getTime()));
			  
			  int rowCount = pstmt.executeUpdate();
			  
			  log.info("New entry placed in Project table and inserted record count: "+rowCount);
		} catch (SQLException e) {
			log.severe("Problem occurred while checking ");
			throw new IllegalStateException("Problem occurred while inserting record into the HDE_PROJECT table:", e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
	}

	private void createEntryInMasterProjectList(String envId, String projectId, String clientId) {
		boolean found = isProjectIdExist(envId, projectId);
		if (!found) {
			String query = "Insert into Etl_Oracle00.HDE_MASTER_PROJECT_LIST (PROJECT_ID, CLIENT_NAME, PROJECT_DESC, CREATE_DT, CREATED_BY, MEASUREMENT_YEAR)"
					+ " values(?,?,?,?,?,?)";
			
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
			PreparedStatement pstmt = null;
			
			try {
				  // create PrepareStatement object
				  pstmt = connection.prepareStatement(query);
				  pstmt.setString(1, projectId);
				  pstmt.setString(2, clientId);
				  pstmt.setString(3, "Fitnesse Automation Suite Execution");
				  pstmt.setDate(4, new java.sql.Date(new Date().getTime()));
				  pstmt.setString(5, "Fit");
				  pstmt.setDate(6, new java.sql.Date(new Date().getTime()));
				  
				  int rowCount = pstmt.executeUpdate();
				  log.info("New entry placed in Master config table and inserted record count: "+rowCount);
			} catch (SQLException e) {
				log.severe("Problem occurred while checking ");
				throw new IllegalStateException("Problem occurred while inserting record into the HDE_PROJECT table:", e);
			} finally {
				try {
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (SQLException e) {
					throw new IllegalStateException("Problem occurred while closing statement object");
				}
			}
		}
	}

	private boolean isProjectIdExist(String envId, String projectId) {
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
		Statement statement = null;
		ResultSet resultSet = null;
		int isFound = 0;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select count(*) from Etl_Oracle00.HDE_MASTER_PROJECT_LIST where PROJECT_ID='"+ projectId+"'");
			log.info("Namrata - changed query with schema name Etl_Oracle00. ");
			if (resultSet.next()) {
				isFound = resultSet.getInt(1);
			}
			log.info("Found Project id in Master project list table :"+isFound);
			
		} catch (SQLException e) {
			log.severe("Problem occurred while checking whether record exist with Project id in Master Project list table: ProjectID: "+projectId);
			throw new IllegalStateException("Problem occurred while checking whether record exist with Project id in Master Project list table: ProjectID: "+projectId, e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
		
		return isFound > 0;
	}

	private int getMaxProjectKey(String envId) {
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
		Statement statement = null;
		ResultSet resultSet = null;
		int maxProjecyKey = 0;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select max(PROJECT_KEY) from Etl_Oracle00.HDE_PROJECT");
			if (resultSet.next()) {
				maxProjecyKey = resultSet.getInt(1);
			}
			log.info("Max Project key in Project table :"+maxProjecyKey);
			
		} catch (SQLException e) {
			log.severe("Problem occurred while checking ");
			throw new IllegalStateException("Problem occurred while checking whether record exist with client:", e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
		return maxProjecyKey;
	}

	public int getProjectKey(Environ env) {
/*		Properties properties = Properties.MAP;
		String clientID = properties.getProperty("clientId");
		String projectID = properties.getProperty("projectId");
		String jobID = properties.getProperty("jobId");*/
		
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
		Statement statement = null;
		ResultSet resultSet = null;
		int projectKey = 0;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select PROJECT_KEY from Etl_Oracle00.HDE_PROJECT where PROJECT_ID='"+ env.projectId+"' and CLIENT_NAME='" + env.clientId +"' and ACC_JOB_ID='" +env.jobId+ "'");
			log.info("Namrata - changed query with schema name Etl_Oracle00. ");
			if (resultSet.next()) {
				projectKey = resultSet.getInt(1);
			}
			log.info("Found Project key in Project table :"+projectKey);
			
		} catch (SQLException e) {
			log.severe("Problem occurred while checking whether record exist with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId);
			throw new IllegalStateException("Problem occurred while checking whether record exist with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId, e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
		
		return projectKey;
	}

	
	public boolean IsAccDataLoaded(Environ env, String measureName) {
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
		Statement statement = null;
		ResultSet resultSet = null;
		int projectKey = 0;
		try {
			statement = connection.createStatement();
			String query = "select PROJECT_KEY from Etl_Oracle00.HDE_PROJECT where PROJECT_ID='"+ env.projectId +"' and CLIENT_NAME='" + env.clientId +"' and ACC_JOB_ID='" +env.jobId+ "'";
			resultSet = statement.executeQuery(query);
			log.info(query);
			if (resultSet.next()) {
				projectKey = resultSet.getInt(1);
			}
			log.info("Found Project key in Project table :" + projectKey);

			//Now check ACC Measures table for any records
			resultSet = null;
			statement = null;
			
			if(measureName.equalsIgnoreCase("RAS") || measureName.equalsIgnoreCase("RCA") || 
					measureName.equalsIgnoreCase("RCO") || measureName.equalsIgnoreCase("RDI") || 
					measureName.equalsIgnoreCase("RHY")){
				//RRU measures
				query = "select COUNT(*) AS REC0RDCOUNT from etl_Oracle00.HDE_ACC_RRU_MEASURES where MEASURE_NAME= '"+ measureName+"' and PROJECT_KEY = '" + projectKey + "'";
			} 
			else {
				//By default
				query = "select COUNT(*) AS REC0RDCOUNT from etl_Oracle00.HDE_ACC_MEASURES where MEASURE_NAME= '"+ measureName+"' and PROJECT_KEY = '" + projectKey + "'";
			}
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			log.info(query);
			if(resultSet.next()) {
				log.info("Inside if " );
				int c = resultSet.getInt(1);
				log.info("Count retrieved is - index 1 " + c);
				if (c == 0){
					return false;
				}else {
					return true;
				}
			}else {
				return false;
			}
		
		} catch (SQLException e) {
			log.severe("Problem occurred while checking whether record exist with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId);
			throw new IllegalStateException("Problem occurred while checking whether record exist with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId, e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
	}


	public int getMeasureYear(Environ env) {
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
		Statement statement = null;
		ResultSet resultSet = null;
		int measYr = 0;
		try {
			statement = connection.createStatement();
			String query = "SELECT MEASUREMENT_YR from Etl_Oracle00.HDE_PROJECT where PROJECT_ID='"+ env.projectId +"' and CLIENT_NAME='" + env.clientId +"' and ACC_JOB_ID='" +env.jobId+ "'";
			resultSet = statement.executeQuery(query);
			log.info(query);
			if (resultSet.next()) {
				measYr = resultSet.getInt(1);
				log.info("Found Measurement year in Project table :" + measYr);
			}else {
				log.info("Measurement year Not found in Project table :" + measYr);
			}
			return measYr;

		} catch (SQLException e) {
			log.severe("Problem occurred while getting measurement year with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId);
			throw new IllegalStateException("Problem occurred while getting measurement year with client:" +env.clientId + " ProjectID: "+env.projectId + " Job Id:" + env.jobId, e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				throw new IllegalStateException("Problem occurred while closing statement object");
			}
		}
	}
	
	
	public String getMeasureSet(String measureName, String env ) {

		Connection connection;
		//int prjctkey = getProjectKey(env);
		
	log.info("inside get measureset .........");

	log.info("Enviorment is ...." + env);

		if (env.equalsIgnoreCase("STG")){
	log.info("Creating STG db connection");
		connection = ConnectionManager.STG.get();
		}else if (env.equalsIgnoreCase("STGNEW")){
	log.info("Creating STGNEW db connection");
		connection = ConnectionManager.STGNEW.get();
		}else if (env.equalsIgnoreCase("QANEW")) {
	log.info("Creating QANEW db connection");
		connection = ConnectionManager.QANEW.get();
		}else {
		connection = ConnectionManager.CONNECTION.get();
		}
		Statement statement = null;
		ResultSet resultSet = null;
		String measure = null;
		int ver1 = 0;
		try {
		statement = connection.createStatement();
	log.info("inside try before getting measureset.......");
		String query = "SELECT MEASURE_SET from Etl_Oracle00.HDE_MASTER_MEASURE_CONFIG where MEASURE_NAME='"+ measureName +"'";
		resultSet = statement.executeQuery(query);
	log.info(query);
		if (resultSet.next()) {
		measure = resultSet.getString(1);
	log.info("Found Measurement year in Project table :" + measure);
		}else {
	log.info("Measurement year Not found in Project table :" + measure);
		}
		
		String version = "SELECT VERSION from Etl_Oracle00.HDE_PROJECT_MEASURE_VERSION where MEASURE_NAME='"+ measureName +"'";
		ResultSet ver = statement.executeQuery(version);
		log.info(query);
		if (ver.next()) {
		ver1= ver.getInt(1);
		log.info("Found Measurement year in Project table :" + ver1);
		}else {
	log.info("Measurement year Not found in Project table :" + ver1);
		}
		
		switch(measure){
		case "CAP4P" :
	    log.info("Getting into CAP4P :");
		String measSet= measure+"-"+(+ver1-1);
		log.info("Returning the measureSet value :" +measSet);
		return measSet;
		case "HEDIS-Custom":
		log.info("Getting into custom :");
		String measSet_Custom= measure+"-"+ver1;
		log.info("Returning the measureSet value :" +measSet_Custom);
		return measSet_Custom;
		}
		String measSet_normal = measure+"-"+(+ver1+1);
		return measSet_normal;
		} catch (SQLException e) {
		log.severe("Problem occurred while getting measureset.....");
		throw new IllegalStateException("Problem occurred while ....");
		} finally {
		try {
		if (resultSet != null) {
		resultSet.close();
		}
		if (statement != null) {
		statement.close();
		}
		} catch (SQLException e) {
		throw new IllegalStateException("Problem occurred while closing statement object");
		}
		}
		}
	
public String getMeasureSet1(String measureName,String env) {

		Connection connection;
		Properties properties = Properties.MAP;
		String projectID = properties.getProperty("projectId");
		
	log.info("inside get measureset .........");

	log.info("Enviorment is ...." + env);

		if (env.equalsIgnoreCase("STG")){
	log.info("Creating STG db connection");
		connection = ConnectionManager.STG.get();
		}else if (env.equalsIgnoreCase("STGNEW")){
	log.info("Creating STGNEW db connection");
		connection = ConnectionManager.STGNEW.get();
		}else if (env.equalsIgnoreCase("QANEW")) {
	log.info("Creating QANEW db connection");
		connection = ConnectionManager.QANEW.get();
		}else {
		connection = ConnectionManager.CONNECTION.get();
		}
		Statement statement = null;
		ResultSet resultSet = null;
		String measSet = null;
		ResultSet version=null;
		try {
		statement = connection.createStatement();
	log.info("inside try before getting measureset.......");
		String query = "SELECT MEASURE_SET from Etl_Oracle00.HDE_PROJECT_MEASURE_VERSION where MEASURE_NAME='"+ measureName +"'";
		String verQuery = "SELECT VERSION from Etl_Oracle00.HDE_PROJECT_MEASURE_VERSION where MEASURE_NAME='"+ measureName +"'";
		ResultSet rsSet = statement.executeQuery(query);
		ResultSet rsVer = statement.executeQuery(verQuery);
		//int version1 = (Integer) version;
	log.info(query);
	log.info(verQuery);
		if (rsSet.next()) {
			//measYr = resultSet.getInt(1);
			//System.out.println("Vadla");
			//System.out.println("Rahul");
			if (rsVer.next()){
		String measure = rsSet.getString(1);
		String ver = rsVer.getString(1);
		
	log.info("inside try before getting into Switch case.......");
		switch(measure){
		case "CAP4P" :
			log.info("Getting into CAP4P :");	
		measSet = measure+ "-" + ver + - 1;
		return measSet;
		case "HEDIS-Custom":
			log.info("Getting into custom :");
		measSet = measure+ "-" + ver;
		return measSet;
		case "null":
			log.info("Getting into CAP4P :");
		measSet = measure+ "UNKNOWN";
		log.info("Returning the value :");
		return measSet;
		}
		}
	log.info("Found Measurement year in Project table :" + measSet);
		}else {
	log.info("Measurement year Not found in Project table :" + measSet);
		}
		log.info("Getting measure set value :" + measSet);
		
		return measSet;
		
	

		} catch (SQLException e) {
		log.severe("Problem occurred while getting measureset.....");
		throw new IllegalStateException("Problem occurred while ....");
		} finally {
		try {
		if (resultSet != null) {
		resultSet.close();
		}
		if (statement != null) {
		statement.close();
		}
		} catch (SQLException e) {
		throw new IllegalStateException("Problem occurred while closing statement object");
		}
		}
		}
	
	
}
