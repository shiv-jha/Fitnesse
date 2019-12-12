package com.optum.hde.fitnesse.fixtures;

/* import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.optum.hde.fitnesse.Environ;
import com.optum.hde.fitnesse.HDE;
import com.optum.hde.fitnesse.Measure;
import com.optum.hde.fitnesse.Properties;
import com.optum.hde.fitnesse.measure.run.SSHService;

public class CopyFilesLanding{
	
	
	Properties properties = Properties.MAP;
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
		cfl.copyFiles();
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



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
//import com.optum.hde.fitnesse.Environ;
//import com.optum.hde.fitnesse.HDE;
//import com.optum.hde.fitnesse.Measure;
//import com.optum.hde.fitnesse.Properties;
//import com.optum.hde.fitnesse.measure.run.SSHService;
import java.util.logging.Logger;

public class CopyFilesLandingZone{
	String unixPaswd = "uT3MALxe";
	
	//Properties properties = Properties.MAP;
	String file_path;
	String file_name; //properties.getProperty("File_path");
	public static Session session;
	
	
	
	public  CopyFilesLandingZone(String file_path, String file_name) throws IOException, SftpException, JSchException
	{
		
		this.file_path = file_path;
		this.file_name = file_name;
		ChannelSftp sftpChannel = null;
		//CopyFilesLandingZone cfl = new CopyFilesLandingZone();
			SSHService();
			trgFileCreation();
			SSHService();
			copyFiles();
			close();
	
	
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
			session = jsch.getSession("wesbuser", "APSRT0109", 22);
																
			session.setPassword(unixPaswd);
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect();
			System.out.println("QA Unix session established");
			//Logger.getLogger(SSHService.class.getName()).info("QA Unix session established");
		} catch (JSchException jschX) {
			System.out.println("Connection failed"); //Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating QA SSH service: " + jschX.getMessage());
			throw new IllegalStateException("Problem occurred while creating QA SSH service", jschX);
		}
		
}
	

	public void copyFiles() throws FileNotFoundException, SftpException, JSchException {
		ChannelSftp sftpChannel =null;
		FileInputStream fis = null;
		Channel channel = session.openChannel("sftp");
		channel.connect();
		sftpChannel = (ChannelSftp) channel;
		
		String dst = "/cas/TST/data/inb/cs/";
		String srcFilePath = file_path + "\\" +file_name +".DAT";
		String srcFilePath1 = file_path + "\\" +file_name +".TRG";
		
		try {
			
			sftpChannel.cd(dst);
		    File srcFile = new File(srcFilePath);
		    sftpChannel.put(new FileInputStream(srcFile), srcFile.getName(),ChannelSftp.OVERWRITE);
		    sftpChannel.cd(dst);
		    File srcFile1 = new File(srcFilePath1);
		    sftpChannel.put(new FileInputStream(srcFile1), srcFile1.getName(),ChannelSftp.OVERWRITE);
		    System.out.println("Files moved to Landing Zone");
			
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
	
	
	public void runJob(String sCommand) throws  JSchException, IOException {
		SSHService();
		Channel channel=session.openChannel("exec");
		 ((ChannelExec)channel).setCommand(sCommand);
		
		
		channel.setInputStream(null);
        ((ChannelExec)channel).setErrStream(System.err);
        
        InputStream in=channel.getInputStream();
       
        channel.connect();
        byte[] tmp=new byte[1024];
        while(true){
          while(in.available()>0){
            int i=in.read(tmp, 0, 1024);
            if(i<0)break;
            System.out.print(new String(tmp, 0, i));
          }
          if(channel.isClosed()){
            System.out.println("exit-status: "+channel.getExitStatus());
            break;
          }
          try{Thread.sleep(1000);
          }catch(Exception ee)
          {}
        }
        channel.disconnect();
        session.disconnect();
        System.out.println("DONE");
    }	
		
		
	
	
	static public void close() {
		session.disconnect();
		System.out.println("QA Unix session closed");
	}

	} 

	


	
