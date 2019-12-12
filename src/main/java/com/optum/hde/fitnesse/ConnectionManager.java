package com.optum.hde.fitnesse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public enum ConnectionManager {

	CONNECTION ("QA"),
	STG ("STG"),
	QANEW ("QANEW"),
	STGNEW ("STGNEW");

	private Connection connection;
	
	private ConnectionManager(String envId) {
		
		Logger log = Logger.getLogger(ConnectionManager.class.getName());
		Properties properties = Properties.MAP;
		
		log.info("Environment in ConnectionManager is " + envId);
		
		switch (envId) {
			case "QA":
				try {
					Class.forName(properties.getProperty("db.driver"));
				} catch (ClassNotFoundException e) {
					log.severe("Oracle deriver jar missing in classpth.");
					throw new IllegalStateException("Oracle deriver jar missing in classpth.");
				}

				try {
					connection = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.username"), properties.getProperty("db.pwd"));
					log.info("Namrata - QA DB connection established! ");
				} catch (SQLException e) {
					log.severe("Problem occurred while creating QA DB connection.");
					throw new IllegalStateException("Problem occurred while creating QA DB connection.", e);
				}
				break;

			case "STG":
				try {
					Class.forName(properties.getProperty("db.stg.driver"));
				} catch (ClassNotFoundException e) {
					log.severe("Oracle deriver jar missing in classpth.");
					throw new IllegalStateException("Oracle deriver jar missing in classpth.");
				}

				try {
					connection = DriverManager.getConnection(properties.getProperty("db.stg.url"), properties.getProperty("db.stg.username"), properties.getProperty("db.stg.pwd"));
					log.info("STG DB connection established! ");
				} catch (SQLException e) {
					log.severe("Problem occurred while creating STG DB connection.");
					throw new IllegalStateException("Problem occurred while creating STG DB connection.", e);
				}
				break;
			
			case "QANEW":
				try {
					Class.forName(properties.getProperty("db.qanew.driver"));
				} catch (ClassNotFoundException e) {
					log.severe("Oracle deriver jar missing in classpth.");
					throw new IllegalStateException("Oracle deriver jar missing in classpth.");
				}

				try {
					connection = DriverManager.getConnection(properties.getProperty("db.qanew.url"), properties.getProperty("db.qanew.username"), properties.getProperty("db.qanew.pwd"));
					log.info("QANEW DB connection established! ");
				} catch (SQLException e) {
					log.severe("Problem occurred while creating QANEW DB connection.");
					throw new IllegalStateException("Problem occurred while creating QANEW DB connection.", e);
				}
				break;
		}
			/* case "STGNEW":
				try {
					Class.forName(properties.getProperty("db.stgnew.driver"));
				} catch (ClassNotFoundException e) {
					log.severe("Oracle deriver jar missing in classpth.");
					throw new IllegalStateException("Oracle deriver jar missing in classpth.");
				}

				try {
					connection = DriverManager.getConnection(properties.getProperty("db.stgnew.url"), properties.getProperty("db.stgnew.username"), properties.getProperty("db.stgnew.pwd"));
					log.info("STGNEW DB connection established! ");
				} catch (SQLException e) {
					log.severe("Problem occurred while creating STGNEW DB connection.");
					throw new IllegalStateException("Problem occurred while creating STGNEW DB connection.", e);
				}
				break;
		}*/
	}
	
	public Connection get() {
			return connection;
		}

}
