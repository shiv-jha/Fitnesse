package com.optum.hde.fitnesse;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.ConnectionManager;
import com.optum.hde.fitnesse.measure.run.SSHService;

public class SuiteTearDown {

	private final static Logger log = Logger.getLogger(SuiteTearDown.class.getName());
	
	public void closeDbConnection(String envId) throws SQLException {
		Connection connection;
		if (envId.equalsIgnoreCase("STG")){
			log.info("Creating Stage db connection");
			connection = ConnectionManager.STG.get();
		}else if (envId.equalsIgnoreCase("STGNEW")){
			log.info("Creating Stage db connection");
			connection = ConnectionManager.STGNEW.get();
		}else if (envId.equalsIgnoreCase("QANEW")) {
			log.info("Creating QANEW db connection");
			connection = ConnectionManager.QANEW.get();
		}else {
			connection = ConnectionManager.CONNECTION.get();
		}
		
		connection = ConnectionManager.CONNECTION.get();
		connection.close();
		log.info("QA Connection closed");

		connection = ConnectionManager.QANEW.get();
		connection.close();
		log.info("QANEW Connection closed");
		
		connection = ConnectionManager.STG.get();
		connection.close();
		log.info("STG Connection closed");
		
		connection = ConnectionManager.STGNEW.get();
		connection.close();
		log.info("STGNEW Connection closed");
	}
	
	public void closeUnixSession() {
		// Close the session 
		SSHService.close();
		
		log.info("Unix session was closed");
	}
}
