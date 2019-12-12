package com.optum.hde.fitnesse.fixtures;

import java.io.IOException;
//import java.util.logging.logger;
import com.optum.hde.fitnesse.Properties;

import dw.EtlJobRun;


import java.util.Set;
import java.util.concurrent.TimeUnit;


import java.awt.AWTException;

public class EtlJobRunner {
	
	public EtlJobRunner() {
		
		
	}

	    
	public String runJobWithUserPassJobStnTable(String sUser,String sPass,String sJob ,String sWorkstn,String sTable) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.ie.driver","E:/Eclipse/Project/Resources/IEDriverServer.exe");
		
		EtlJobRun etl=new EtlJobRun();
		String msg="";
		try
		{
			msg=etl.runJobWithUserPassJobStnTable(sUser, sPass, sJob, sWorkstn, sTable);
		}
		catch(Exception e)
		{
			//msg=msg+e.getMessage();
		}
		  
		return msg;
	 }

	 
	
public String runIndividual(String sUser,String sPass,String sJob ,String sWorkstn,String sTable) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.ie.driver","E:/Eclipse/Project/Resources/IEDriverServer.exe");
		
		EtlJobRun etl=new EtlJobRun();
		String msg="";
		try
		{
			msg=etl.runJobWithUserPassJobStnTable(sUser, sPass, sJob, sWorkstn, sTable);
		}
		catch(Exception e)
		{
			//msg=msg+e.getMessage();
		}
		  
		return msg;
	 }

}
