package com.optum.hde.fitnesse.fixtures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.optum.hde.fitnesse.Properties;
import com.optum.hde.fitnesse.measure.run.SSHService;

public class HelloFixture {

	public String hello() {
		StringBuilder agg = new StringBuilder("!*> Metrics List \n");
		
			agg.append("IDSS Element Name: 'hshs'");
			agg.append("' and Value:'12'");
			agg.append("\n");
			
			agg.append("IDSS Element Name: 'hs2hs'");
			agg.append("' and Value:'122'");
			agg.append("\n");
			
			agg.append("IDSS Element Name: 'hshs3'");
			agg.append("' and Value:'123'");
			agg.append("\n");
		
		agg.append("*!");
		return agg.toString();
	}
}
	/*Properties properties = Properties.MAP;
	String file_name = properties.getProperty("File_name");
	String file_path = properties.getProperty("File_path");
	public static Session session;
	
	public static void main(String args[]) throws IOException, SftpException
	
	{
	
	
	ChannelSftp sftpChannel = null;
	CopyFilesLanding cfl = new CopyFilesLanding();
		//cfl.SSHService();
		cfl.trgFileCreation();
		cfl.SSHService();
		//cfl.copyFiles();
	//trgFileCreation trg = new trgFileCreation();
	

		
	}
		public void trgFileCreation() throws IOException
		{	
						
		try {

		      File file = new File(file_path+"\\"+file_name+".TRG");
		      
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }

	  	} catch (IOException e) {
		      e.printStackTrace();
		      
	  	}
		
		}
		
	public void SSHService() {
		
		JSch jsch = new JSch();
		//ev = ev.toUpperCase();
		
		try {
			// TODO - can we pick random port ?
			session = jsch.getSession(properties.getProperty("ds.server.username"), properties.getProperty("ds.server.hostname"), Integer.parseInt(properties.getProperty("ds.server.port")));
																
			session.setPassword(properties.getProperty("ds.server.pwd"));
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect();
			Logger.getLogger(SSHService.class.getName()).info("QA Unix session established");
		} catch (JSchException jschX) {
			Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating QA SSH service: " + jschX.getMessage());
			throw new IllegalStateException("Problem occurred while creating QA SSH service", jschX);
		}
		
}
	public void copyFiles() throws FileNotFoundException, SftpException {
		ChannelSftp sftpChannel = null;
		FileInputStream fis = null;
		String src =  file_path + file_name;
		String des =  properties.getProperty("File_LandingZone");
		try {
			fis = new FileInputStream(src);
			
			sftpChannel.put(fis, des);
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					throw new IllegalStateException("Problem occurred while closing input stream.");
				}
			}
		}
		
	}
} */
