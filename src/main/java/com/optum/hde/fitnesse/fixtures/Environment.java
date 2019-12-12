package com.optum.hde.fitnesse.fixtures;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

public class Environment {

	public Environment() {
	}

	public static final String TST = "TST";
	public static final String DEV = "DEV";
	public static final String UAT = "UAT";
	public static final String STG = "STG";
	//public static final String PRD = "PRD";
	public static Map urls;
	public static Map hosts;
	public static Map users;
	public static Map passwords;

	static {
		urls = new HashMap();
		hosts = new HashMap();
		users = new HashMap();
		passwords = new HashMap();
		loadProperties("DEV");
		loadProperties("TST");
		loadProperties("STG");
		//loadProperties("PRD");
	}

	static void loadProperties(String env) {
		Properties prop = new Properties();
		//Properties properties = Properties.MAP;
		InputStream input = null;

		try {
			input = ClassLoader.getSystemResourceAsStream(env+".ENV.properties");
	        Logger.getAnonymousLogger().info(env+".ENV.properties");

			// load a properties file
			prop.load(input);
			// TODO Auto-generated method stub

			// get the property value and print it out
			String database = prop.getProperty("database");
			String dbuser = prop.getProperty("dbuser");
			String dbpassword = prop.getProperty("dbpassword");
			String host = prop.getProperty("server");
			urls.put(env, database);
			users.put(env, dbuser);
			hosts.put(env, host);
			passwords.put(env, dbpassword);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
