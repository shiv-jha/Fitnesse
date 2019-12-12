package com.optum.hde.fitnesse.fixtures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.sql.rowset.CachedRowSet;

import com.sun.rowset.CachedRowSetImpl;

public class DatabaseSupport {
	Connection conn;

	  private static DatabaseSupport instance = null;

	   public static DatabaseSupport getInstance() throws Exception {
	      if(instance == null) {
	         throw new Exception("Please initialize DatabaseSupport in setup");
	      }
	      return instance;
	   }

	public DatabaseSupport(String jdbcurl, String user, String pass) {
		setJdbcurl(jdbcurl);
		setUser(user);
		setPass(pass);
		instance=this;
	}

	public DatabaseSupport() {
	}


	public String getJdbcurl() {
		return jdbcurl;
	}

	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String jdbcurl;
	public String user;
	public String pass;

	public CachedRowSet cachedRowSet;

	public CachedRowSet getCachedRowSet() {
		return cachedRowSet;
	}

	public void setCachedRowSet(CachedRowSet cachedRowSet) {
		this.cachedRowSet = cachedRowSet;
	}

	public String driverName = "oracle.jdbc.driver.OracleDriver";

	public String valueofcolumn(String column) {

		try {
			// Logger.getAnonymousLogger().info(
			// "Number of results " + getCachedRowSet().size());
			cachedRowSet.restoreOriginal();
			if (cachedRowSet != null)
				while (cachedRowSet.next()) {
					return cachedRowSet.getString(column);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void query(String sql) {
		try {
			// Logger.getAnonymousLogger().info(sql);

			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			Statement st = conn.createStatement();
			st.setMaxRows(10);
			ResultSet rs = st.executeQuery(sql);
			CachedRowSet cachedRowSet = new CachedRowSetImpl();
			cachedRowSet.populate(rs);
			setCachedRowSet(cachedRowSet);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String runQueryOn(String sql, String jdbcurl, String user,
			String pass) {
		try {
			// Logger.getAnonymousLogger().info(sql);

			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			st.execute();
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				Object obj = rs.getObject(1);
				String returnvalue = obj == null ? "" : obj.toString();
				return returnvalue;
			}

			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ERROR";
	}

	public int runUpdateOn(String sql, String jdbcurl, String user, String pass) {
		try {
			Logger.getAnonymousLogger().info(sql);
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			return st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int update(String sql) {
		try {
			Logger.getAnonymousLogger().info(sql);
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			return st.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int call(String sql) {
		try {
			Logger.getAnonymousLogger().info(sql);
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);

			CallableStatement st = conn.prepareCall(sql);
			//st.setEscapeProcessing(false);
			st.execute();
			Logger.getAnonymousLogger().info("commting");
			conn.commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}

	public String runQueryOnForValueAndStop(String sql, String jdbcurl,
			String user, String pass, String lookfor) throws Exception {
		try {

			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			st.execute();
			ResultSet rs = st.getResultSet();

			while (rs.next()) {
				String returnvalue = rs.getObject(1).toString();
				// Logger.getAnonymousLogger().info(
				// "returnvalue==lookfor" + returnvalue + "  " + lookfor);
				if (returnvalue.equalsIgnoreCase(lookfor)) {
					throw new Exception("Failed because " + lookfor
							+ " is already in the database");
				}
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "PASS";

	}

	public String runQueryOnForValue(String sql, String jdbcurl, String user,
			String pass, String lookfor) throws Exception {
		try {

			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			boolean exit = true;
			int times = 0;
			int maxtimes = 5;

			while (exit == true) {
				st.execute();
				ResultSet rs = st.getResultSet();

				while (rs.next()) {
					String returnvalue = rs.getObject(1).toString();
					Logger.getAnonymousLogger().info("running " + sql);
					if (returnvalue.equalsIgnoreCase(lookfor)) {
						exit = true;
						return "PASS";
					} else {
						if (maxtimes <= times) {
							throw new Exception(
									"Wait for lookup expired");
						}
						try {
							Thread.sleep(10000);
							times++;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("Wait for lookup expired");
	}
	
				


	public boolean queryForAndRetryTimes(String sql, String lookfor, int retry)
			throws Exception {
		try {

			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName).newInstance();
			conn = DriverManager.getConnection(jdbcurl, user, pass);
			PreparedStatement st = conn.prepareStatement(sql);
			boolean exit = true;
			int times = 0;
			boolean cond=false;
			while (exit == true) {
				st.execute();
				ResultSet rs = st.getResultSet();

				while (rs.next()) {
					String returnvalue = rs.getObject(1).toString();
					// Logger.getAnonymousLogger().info("running " + sql);
					if(lookfor.contains(";"))
					{
						String splittedlookfor[]=lookfor.split(Pattern.quote(";"));
						boolean statement1=returnvalue.equalsIgnoreCase(splittedlookfor[0]);
						boolean statement2=returnvalue.equalsIgnoreCase(splittedlookfor[1]);
						cond=statement1 || statement2;
					}
					else
					{
						cond=returnvalue.equalsIgnoreCase(lookfor);
					}
					if (returnvalue.equalsIgnoreCase(lookfor)) {
						exit = true;
						return true;
					} else {
						if (retry <= times) {
							throw new Exception(
									"Wait for lookup expired");
						}
						try {
							Thread.sleep(10000);
							times++;
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("Wait for lookup expired");
	}
	
	public int runDupProcedure(String procedure)
			throws Exception {
    	int exit_cd=1;
    	String msg="";
		try {
		CallableStatement callSt = null;
	
		String procedureName = procedure;
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName).newInstance();
		conn = DriverManager.getConnection(jdbcurl, user, pass);
		

		
		callSt = conn.prepareCall("{call "+procedureName+"(?)}");
		//callSt.setInt(1, fileKey);
		callSt.registerOutParameter(1,Types.INTEGER);
		
		//PreparedStatement st = conn.prepareStatement(sql);
		//boolean exit = true;
		//int times = 0;
		
		callSt.execute();
		 exit_cd = callSt.getInt(1);
					}
		catch (SQLException e) {
			exit_cd=2;
			msg=e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exit_cd;
		//return msg;
}

	
	public int runAllProcedureChunkAndFile(String procedure,int chunk_count,int file_key)
			throws Exception {
    	int exit_cd=1;
    	String msg="";
		try {
		CallableStatement callSt = null;
	
		String procedureName = procedure;
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName).newInstance();
		conn = DriverManager.getConnection(jdbcurl, user, pass);
		

		
		callSt = conn.prepareCall("{call "+procedureName+"(?,?,?)}");
		callSt.setInt(1, chunk_count);
		callSt.registerOutParameter(2,exit_cd);
		callSt.setInt(3, file_key);
		
		
		//PreparedStatement st = conn.prepareStatement(sql);
		//boolean exit = true;
		//int times = 0;
		
		callSt.execute();
		 exit_cd = callSt.getInt(1);
					}
		catch (SQLException e) {
			exit_cd=2;
			msg=e.getMessage();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exit_cd;
		//return msg;
}
	
	public String verifyAsmExtractDetails() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		BufferedReader in  =new BufferedReader(new FileReader("E:/Automation/ASM/EOD10002ASM_DATA_0706_I_20170706052845.txt"));
	    Map<String, String> fileMap = new LinkedHashMap<String, String>();
	    Map<String, String> automobilMap = new LinkedHashMap<String, String>();
	    ArrayList< String> a1= new ArrayList<String>();

	    String line = "";
	    String line1="";
	    String splitted[] = null;
	    String splitted1[] = null;
	    
	            if((line = in.readLine()) != null)
					{
						 System.out.println(line);
						  splitted = line.split(Pattern.quote("|"));
					     System.out.println("size is "+splitted.length );
					}
	           if((line1 = in.readLine()) != null)
	           		{
	        	   splitted1 = line1.split(Pattern.quote("|"));
				     System.out.println("size is "+splitted1.length );
	           		}
	            for(int i=0;i<splitted.length;i++)
	            {
	            	fileMap.put(splitted[i], splitted1[i]);
	            }
	            
	           String sSql= "select * from D_mbr  where mbr_id='"+splitted1[3]+ "'";
	           String lst_nm = null,fst_nm;
	           String driverName = "oracle.jdbc.driver.OracleDriver";
				Class.forName(driverName).newInstance();
				conn = DriverManager.getConnection(jdbcurl, user, pass);
				PreparedStatement st = conn.prepareStatement(sSql);

					st.execute();
					ResultSet rs = st.getResultSet();

					while (rs.next()) {
						 lst_nm = rs.getString("MBR_LST_NM");
						 fst_nm = rs.getString("MBR_FST_NM");
						break;
					}
					//fileMap.get("MEMBER_LAST_NAME")
					//MEMBER_FIRST_NAME
	            return fileMap.get("MEMBER_LAST_NAME") + lst_nm;
	}
	
	
   @Override
 public String toString() {
    // TODO Auto-generated method stub
    return getJdbcurl()+" user "+getUser() +" password "+getPass();
}
}
