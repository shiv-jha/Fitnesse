package com.optum.hde.fitnesse.fixtures;

import java.sql.*;

import org.apache.xpath.operations.String;





public class ViewFileTableStatus{

	
	/*public ViewFileTableStatus(String file_name, int status) throws SQLException
	{
		checkStatus(file_name, status);
	}*/
	
	
  public boolean fileStatus(String file_name,  int status)
	    throws Exception {
	//int status=70;
	//String file_name = "PLAN_14_201702 22_07021013_P.DAT";
	try
    {
      
		//System.out.println("try");
		java.lang.String myDriver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(myDriver);
		java.lang.String myUrl = "jdbc:oracle:thin:@//dbsrt0836.uhc.com/pay0ts01svc.uhc.com";
     
      Connection conn = DriverManager.getConnection(myUrl, "cas20_ods", "cas20_ods9");
      Statement st1 = (Statement) conn.createStatement();
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      java.lang.String query = "select * from FRMK_STG_FILEINFO where file_name = '"+file_name+"'";

      // create the java statement
      
      
      // execute the query, and get a java resultset
      ResultSet rs = ((java.sql.Statement) st1).executeQuery(query);
      
      
      // iterate through the java resultset
      while (rs.next())
      {
        int id = rs.getInt("process_sts_key");
        System.out.println("while");
        if (id == status)
        {
        	System.out.println("Files processed sucsessfully without any Errors");
        	return true;
        }
        
        else {
        	System.out.println("Error occured while processing" +id);
        	return false;
        }
        
      } 
      st1.close();
    }
    catch (Exception e)
    {
      //e.printStackTrace();
      //System.err.println("Got an exception! ");
      //System.err.println(e.getMessage());
      throw e;
    }
	return true;
  }
  
  public java.lang.String statusMessage(java.lang.String file_name) throws Exception
  {
	  try
	    {
	      
			//System.out.println("try");
		  java.lang.String myDriver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(myDriver);
			java.lang.String myUrl = "jdbc:oracle:thin:@//dbsrt0836.uhc.com/pay0ts01svc.uhc.com";
	     
	      Connection conn = DriverManager.getConnection(myUrl, "cas20_ods", "cas20_ods9");
	      Statement st1 = (Statement) conn.createStatement();
	      // our SQL SELECT query. 
	      // if you only need a few columns, specify them by name instead of using "*"
	      java.lang.String query = "select * from FRMK_STG_FILEINFO where file_name = '"+file_name+"'";

	      // create the java statement
	      
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = ((java.sql.Statement) st1).executeQuery(query);
	      
	      
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        int id = rs.getInt("process_sts_key");
	        System.out.println("while");
	        if (id == 14)
	        {
	        	//System.out.println("Files processed sucsessfully without any Errors");
	        	java.lang.String str = "Files processed sucsessfully without any Errors"+id;
	        	return str;
	        }
	        if(id == 70)
	        {
	        	java.lang.String str1 = "Files processed sucsessfully into final status=" +id;
	        	return str1;
	        }
	        else {
	        	java.lang.String str2 = "Unknow error while File processing";
	        	return str2;
	        }
	        
	      } 
	      st1.close();
	    }
	    catch (Exception e)
	    {
	      //e.printStackTrace();
	      //System.err.println("Got an exception! ");
	      //System.err.println(e.getMessage());
	      throw e;
	    }
	return file_name;
		
  }
}
