package com.optum.rqns.services.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;

/*Class includes static function to connect to Database*/
public class DataBaseConnect 
			{

                public static Connection con;
                public static Statement stm;
                public static ResultSet rset;    
                /*Static function getRsList to return resultset as Arraylist based on Environment and Query passed */
                public static ResultSet getRsList (String Environment, String Query) throws Exception 
                	{
                	
                	  try 
                	  	{
                	        Class.forName("oracle.jdbc.driver.OracleDriver");
                	    } 
                	  catch (ClassNotFoundException e) 
                	  	{
                	        e.printStackTrace();                	       
                	    }
                	    
                	  Connection con = null;
                	    try {
                	    	
                	    	if(Environment.equalsIgnoreCase("TEST"))
                	    		{	     
                	    		    //System.out.println(0);              	    	
	                    	    	con = DriverManager.getConnection("jdbc:oracle:thin:@//dbsrt0836:1521/pay0ts01svc.uhc.com", "CAS20_ODS","cas20_ods9");	
	                    	    	//System.out.println(1);
	                    	    	stm=con.createStatement();
	                    	    	//System.out.println(2);
	                    	    	rset=stm.executeQuery(Query);  
	                    	    	//System.out.println("state"+con.isClosed());
                	    		}
                	    	else if(Environment.equalsIgnoreCase("STAGE"))
            	    		{	                    	    	
                    	    	con = DriverManager.getConnection("jdbc:oracle:thin:@//orass0065:1521/payst05svc.uhc.com", "CAS20_ODS","Frontier_conquer_15");	                    	 
                    	    	//System.out.println();
                    	    	stm=con.createStatement();
                    	    	rset=stm.executeQuery(Query);    
            	    		}
                	    	
                	    	else if(Environment.equalsIgnoreCase("STAGE-DW"))
            	    		{	                    	    	
                    	    	con = DriverManager.getConnection("jdbc:oracle:thin:@//orass0125:1521/paydst01svc.uhc.com", "cas20_dw","Judo_97_kick");	                    	 
                    	    	//System.out.println();
                    	    	stm=con.createStatement();
                    	    	rset=stm.executeQuery(Query);    
                    	    	
                    	    	
   
            	    		}
                	    	
                	    	else if(Environment.equalsIgnoreCase("TEST-DW"))
            	    		{	                    	    	
                	    		con = DriverManager.getConnection("jdbc:oracle:thin:@//dbsrt0903:1521/pay0ts02svc.uhc.com", "cas20_dw","cas20_dw01");	                    	 
                    	    	//System.out.println();
                    	    	stm=con.createStatement();
                    	    	rset=stm.executeQuery(Query);
            	    		}
                	    	else
                	    		{
	                	    		con = DriverManager.getConnection("jdbc:oracle:thin:@//dbslt0010:1521/payts04.uhc.com", "CAS20_ODS","cas20_ods9");
	                    	    	stm=con.createStatement();
	                    	    	rset=stm.executeQuery(Query);   
                	    		}
                	    	} 
                	    catch (SQLException e)
                	    	{
                	        	e.printStackTrace();
                	        }
                	   
                	   
                	   return rset;
                	                 
                	}
                
                public static String makeIdUsingTime(String format) {
                    SimpleDateFormat currentDateformat = new SimpleDateFormat(format);
                    Date date = Calendar.getInstance().getTime();
                    String data = currentDateformat.format(date);
                    return data;
			}
			}
