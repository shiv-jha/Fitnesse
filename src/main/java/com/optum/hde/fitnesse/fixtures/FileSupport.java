package com.optum.hde.fitnesse.fixtures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.Writer;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;

//import util.FileUtil;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
//import com.utils.plaintext.diff_match_patch;

import com.optum.rqns.services.utils.DataBaseConnect;

public class FileSupport {
    String host;

    String user;

    String pass;

    String todir;

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTodir() {
        return this.todir;
    }

    public void setTodir(String todir) {
        this.todir = todir;
    }

    public FileSupport(String host, String user, String pass, String todir) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.todir = todir;
    }

    public FileSupport() {
    }

    public void delete(String folder) {
        Logger.getAnonymousLogger().info("do delete stuff here " + folder);
    }

    public void copy(String file, String todir, String rename) {
        Logger.getAnonymousLogger().info("do copy stuff here " + file);
    }

    public void move(String fromFile, String toFile) {
        Logger.getAnonymousLogger().info("do move stuff here " + fromFile + toFile);
    }

   /* public String readContent(String file) {
        try {
            return FileUtil.getFileContent(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public void sleep(long seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void createTRGFileIn(String fileName, String dir) {
        try {
        	//fileName=fileName+"_P";
            BufferedWriter output = new BufferedWriter(new FileWriter(new File(dir + fileName)));

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Logger.getAnonymousLogger().info("created " + dir + fileName);
    }

    public String buildclaim(String data) {
        SimpleDateFormat currentDateformat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat currentTimeformat = new SimpleDateFormat("HHmm");
        Date date = Calendar.getInstance().getTime();
        data = replaceFromVariableWithValue(data, "currentdate", currentDateformat.format(date));

        data = replaceFromVariableWithValue(data, "currenttime", currentTimeformat.format(date));
        
        return data;
    }

    public String current(String format) {
        SimpleDateFormat currentDateformat = new SimpleDateFormat(format);
        Date date = Calendar.getInstance().getTime();
        String data = currentDateformat.format(date);
        return data;
    }

    public String makeIdUsingTime(String format) {
        SimpleDateFormat currentDateformat = new SimpleDateFormat(format);
        Date date = Calendar.getInstance().getTime();
        String data = currentDateformat.format(date);
        return data;
    }

    public String replaceFromVariableWithValue(String str, String variable, String value) {
        str = str.replaceAll(variable, value);
        return str;
    }

    public String incrementCurrentDateInFormatBy(String type, String format, int days) {
        SimpleDateFormat currentDateformat = new SimpleDateFormat(format);
        Calendar now = Calendar.getInstance();
        now.add(5, days);
        String data = currentDateformat.format(now.getTime());
        return data;
    }

    public String replaceSegmentVariableInContentWith(String variable, String content,
            String segment) throws IOException {
        String[] lines = content.split("<br/>");
        StringBuilder builder = new StringBuilder();
        boolean updateSE = false;
        String[] arr$ = lines;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; i$++) {
            String currLine = arr$[ i$ ];
            if ((!segment.isEmpty()) || (!currLine.contains(variable))) {
                if (currLine.contains(variable)) {
                    updateSE = true;
                    builder.append(segment + "\n");
                } else if ((currLine.startsWith("SE*")) && (updateSE)) {
                    String[] tokens = currLine.split("\\*");
                    Integer numlines = Integer.valueOf(Integer.parseInt(tokens[ 1 ]));
                    Integer integer = numlines;
                    Integer integer1 = numlines = Integer.valueOf(numlines.intValue() + 1);

                    Integer _tmp = integer;
                    currLine = currLine.replace(tokens[ 1 ], numlines.toString());
                    builder.append(currLine + "\n");
                } else if (currLine.startsWith("IEA")) {
                    builder.append(currLine);
                } else {
                    builder.append(currLine + "\n");
                }
            }
        }
        return builder.toString();
    }

    public String createInDirectoryWithContentAndType(String fileName, String dir, String content,
            String type) {
        Writer output = null;
        BufferedReader input = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
        
       
        
        if (fileName.contains("EOD") )
        {
        	 format = new SimpleDateFormat("yyyyMMddHHmmss");
        }
        
        if(fileName.contains("MODD")) 
        {
        	format = new SimpleDateFormat("HHmmss");
        }
        
        if(fileName.contains("PAF")) 
        {
        	format = new SimpleDateFormat("yyyyMMdd");
        }
        
        if(fileName.contains("META") || fileName.contains("AET_MA")  || fileName.contains("HUM_MA") || fileName.contains("Group_Pay") || fileName.contains("State_Pay")) 
        {
        	format = new SimpleDateFormat("yyyyMMddHHmmss");
        }
        
        if(fileName.contains("ContractPBPHIOSConfig") || fileName.contains("CMSPreclusionList") )
        {
        	format = new SimpleDateFormat("yyyyMMddHHmmss");
        }
        if(fileName.contains("DailyPAFStatusFile")) 
        {
        	format = new SimpleDateFormat("MMddyyyyHHmmss");
        }
       
        Date date = Calendar.getInstance().getTime();
        content = content.replaceAll("<pre>", "");
        content = content.replaceAll("</pre>", "");
        content = content.replaceAll("<br>", "");
        content = content.replaceAll("<br/>", "\n");
        content = buildclaim(content);
        File file = new File(dir + fileName + format.format(date) + type);
         if (fileName.contains("TRR"))
        { 
        	 fileName.replace("Random", format.format(date));
        	  file = new File(dir + fileName+ type );
        }
         if(fileName.contains("HCCMODD"))
         { 
       	  file = new File(dir + fileName+ type );
         }
         else if(fileName.contains("MODD"))
         { 
       	  file = new File(dir + fileName.replace("Random", format.format(date))+ type );
         }
         
         else if(fileName.contains("REF_CM_NDC"))
         { 
       	  file = new File(dir + fileName + format.format(date) + type);
         }
         
         else if(fileName.contains("Companion_PAF") || fileName.contains("Risk_PAF") )
         { 
        	 file = new File(dir + fileName + format.format(date) + type+".txt");
         }
         
         
         else if(fileName.contains("_PAF"))
         { 
        	 file = new File(dir + fileName + format.format(date) + type+".DAT");
         }
         
         else if(fileName.contains("META") )
         { 
        	 file = new File(dir + fileName + format.format(date) + type+".txt");
         }
        
         else if(fileName.contains("AUDITOUTPUT") || fileName.contains("HEDIS") || fileName.contains("RETURN"))
         { 
        	 file = new File(dir + fileName);
         }
         
         else if(fileName.contains("DailyPAFStatusFile"))
         { 
        	 file = new File(dir + fileName + format.format(date) + ".txt");
         }
         
         else if(fileName.contains("ContractPBPHIOSConfig") || fileName.contains("OGM_App_Config"))
         { 
        	 file = new File(dir + fileName + format.format(date) + ".txt");
         }
         
         else if(fileName.contains("PreclusionList"))
         { 
        	 file = new File(dir + fileName + format.format(date) + ".csv");
         }
         
         else if(fileName.contains("AET_MA") || fileName.contains("HUM_MA") )
         { 
        	 file = new File(dir + fileName + format.format(date) + ".DAT");
         }
         
         
         
         
         
         
       
        try {
            input = new BufferedReader(new StringReader(content));
            output = new BufferedWriter(new FileWriter(file));
            for (String currLine = null; (currLine = input.readLine()) != null;) {
                output.append(currLine + "\n");
            }
            output.close();
            Logger.getAnonymousLogger().info(
                "created stuff here " + fileName + format.format(date) + type);
                    } catch (IOException e) {
            e.printStackTrace();
        }
        if (fileName.contains("EOD"))
        {
        	return fileName + format.format(date);
        }
        else if(fileName.contains("TRR"))
        {
        	 return fileName;
        }
        else if(fileName.contains("HCCMODD"))
        { 
        	 return fileName;
        }
        
        else if(fileName.contains("MODD"))
        {
        	 return fileName.replace("Random", format.format(date));
        }
        
        else if(fileName.contains("PAF"))
        {
        	 return fileName + format.format(date)+type;
        }
        
        else if(fileName.contains("REF_CM_NDC"))
        {
        	 return fileName + format.format(date);
        }
        
        else if(fileName.contains("ContractPBPHIOSConfig") || fileName.contains("PreclusionList") || fileName.contains("OGM_App_Config"))
		{
        	return fileName + format.format(date);
		}
        
        else if(fileName.contains("META") || fileName.contains("AET_MA") || fileName.contains("HUM_MA"))
        {
        	 return fileName + format.format(date);
        }
        
       
        
        else if(fileName.contains("AUDITOUTPUT") || fileName.contains("HEDIS") || fileName.contains("RETURN") || fileName.contains("DailyPAFStatusFile"))
        {
        	 return fileName;
        }
        else
        {
        return fileName + format.format(date) + "_P";
        }
        
    }

    public void ftpFrom(String file, String dir) {
    	ftpFileInToLocationZone(file, dir, this.host, this.user, this.pass, this.todir);
    }

    public void ftpFromTo(String file, String dir, String todir) {
    	ftpFileInToLocationZone(file, dir, this.host, this.user, this.pass, todir);
    }

    public void ftpFileInToLocationZone(String file, String dir, String host, String userName,
            String password, String location) {
        try {
            Session session = getSession(userName, host, password);
            ChannelSftp c = (ChannelSftp) session.openChannel("sftp");
            c.connect();
            String fsrc = dir + file;

            String fdest = location + file;

            c.put(fsrc, fdest);
            c.disconnect();
            session.disconnect();
        } catch (SftpException e) {
            e.printStackTrace();
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String ftpFileInFromLocationZone(String file, String dir, String host, String userName,
            String password, String location) {
    	String fsrc ="";
    	 String fdest="";
    	 String exception="";
        try {
            Session session = getSession(userName, host, password);
            ChannelSftp c = (ChannelSftp) session.openChannel("sftp");
            c.connect();
             fsrc = dir + file;

             fdest = location + file;
            
            c.get(fsrc, fdest);
            
            //c.put(fsrc, fdest);
            c.disconnect();
            session.disconnect();
        } catch (SftpException e) {
        	exception=e.getMessage();
            e.printStackTrace();
        } catch (JSchException e) {
        	exception=e.getMessage();
            e.printStackTrace();
        } catch (Exception e) {
        	exception=e.getMessage();
            e.printStackTrace();
        }
        return fsrc +"   "+fdest +exception;
    }

   // public int execcommand(String command) throws JSchException, IOException {
   //     return exec(command).size();
   // }

   // public String resultsofexec(String command) throws JSchException, IOException {
   //     List results = exec(command);
    //    String formattedResult = format(results);
    //    return formattedResult;
   // }

    private String format(List results) {
        StringBuffer sb = new StringBuffer();
        sb.append("{{{<html>");
        sb.append("<body>");
        for (Iterator i$ = results.iterator(); i$.hasNext(); sb.append("</br>")) {
            String string = (String) i$.next();
            sb.append(string);
        }
        sb.append("</body>");
        sb.append("</html>}}}");
        return sb.toString();
    }

    /*public boolean verifycommandfor(String command, int check) throws StopTestException {
        int response;
        try {
            response = exec(command).size();
        } catch (Exception e) {
            e.printStackTrace();
            throw new StopTestException(e.getMessage());
        }
        if (response == check) {
            return true;
        }
        throw new StopTestException("Expected " + check + " actual " + response + " for " + command);
    }*/
/*
    public void jobInToLocationZone( String command, String host, String userName,
            String password) throws JSchException, IOException {
        InputStream in = null;
        InputStream err = null;
       // List sb = new ArrayList();
        BufferedReader inReader = null;
        BufferedReader errReader = null;
        //Session session = getSession(this.user, this.host, this.pass);
        Session session = getSession(userName, host, password);
        Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);
        channel.setInputStream(null);
        ((ChannelExec) channel).setErrStream(null);
        in = channel.getInputStream();
        err = ((ChannelExec) channel).getErrStream();
        channel.connect();
        int exitCode = 0;
        for (;;) {
            if (channel.isClosed()) {
                exitCode = channel.getExitStatus();
                break;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException ie) {
            }
        }
        inReader = new BufferedReader(new InputStreamReader(in));
        errReader = new BufferedReader(new InputStreamReader(err));
        if (exitCode != 0) {
            String s;
            while ((s = errReader.readLine()) != null) {
             //   sb.add(s);
            }
        }
        String s;
        while ((s = inReader.readLine()) != null) {
           // sb.add(s);
        }
        in.close();
        err.close();
        channel.disconnect();
        session.disconnect();
       // return sb;
    }
    
   */ 
    public String jobInToLocationZone( String command, String host, String userName,
            String password) throws JSchException, IOException, InterruptedException {
        InputStream in = null;
        InputStream err = null;
       // List sb = new ArrayList();
        BufferedReader inReader = null;
        BufferedReader errReader = null;
        //Session session = getSession(this.user, this.host, this.pass);
        Session session = getSession(userName, host, password);
        Channel channel = session.openChannel("exec");
        ((ChannelExec) channel).setCommand(command);
        channel.setInputStream(null);
        ((ChannelExec) channel).setErrStream(null);
        in = channel.getInputStream();
        
        //BufferedReader reader = new BufferedReader(new InputStreamReader(channel.getInputStream()));

       
        channel.connect();
       Thread.sleep(7000);
        int x= in.available();
        
        byte[] tmp=new byte[1024];
        //tmp=reader.read();
        //String line;
        //while ((line = reader.readLine()) != null) {
        	//tmp=in.readLine();
          //  }
        
//in.r
        int i=in.read(tmp, 0, 1024);
        
        
       //err = ((ChannelExec) channel).getErrStream();
       channel.connect();
       
      /*  while(true){
          while(in.available()>0){
            int i=in.read(tmp, 0, 1024);
            if(i<0)break;
            System.out.print(new String(tmp, 0, i));
          }
          
          if(channel.isClosed()){
            System.out.println("exit-status: "+channel.getExitStatus());
            break;
          }
          try{Thread.sleep(1000);}catch(Exception ee){}
        }
        */
        channel.disconnect();
        session.disconnect();
        System.out.println("DONE");
     return "output is " +new String(tmp, 0, i);
    }
    

    public Session getSession(String userName, String host, String password) throws JSchException {
        Session session = null;
        JSch jsch = new JSch();
        session = jsch.getSession(userName, host, 22);
        session.setTimeout(10000);
        session.setPassword(password);
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect();
        return session;
    }

    public String replacein(String str, String actual) {
        return actual.replaceAll(str, "");
    }

    public String replaceFrom(String str, String actual) {
        return actual.replaceAll(str, "");
    }

    public String leftpadWith(String str, int length, String pad) {
        return StringUtils.leftPad(str, length, pad);
    }

    public String rightpadWith(String str, int length, String pad) {
        return StringUtils.leftPad(str, length, pad);
    }

    public String rightpadWithSpace(String str, int length) {
        return StringUtils.rightPad(str, length, " ");
    }

    public String append(String s1, String s2) {
        return s1.concat(s2);
    }

    public void log(String string) {
        Logger.getAnonymousLogger().info(string);
    }

    public boolean assertEquals(String value1, String value2) {
        return value1.equalsIgnoreCase(value2);
    }

    /*public String compareWith(String a, String b) {
        diff_match_patch diff = new diff_match_patch();
        LinkedList<diff_match_patch.Diff> d = diff.diff_main(a, b);
        if (d.size() == 1) {
            return "true";
        }
        return diff.diff_prettyHtml(d);
    }*/

    public boolean StringCompareWithIgnoreChar(String a, String b, String c) {
        log(a.replaceAll(c, "astrics"));
        log(b.replaceAll(c, "astrics"));
        return a.replaceAll(c, "astrics").matches(b.replaceAll(c, "astrics"));
    }

    public String renameWithByReplacingFrom(String with, String replacing, String from) {
        return from.replace(replacing, with);
    }

    public boolean renameFileInWith(String filename, String directory, String newName) {
        File file = new File(directory + filename);

        File newFile = new File(directory + newName);

        return file.renameTo(newFile);
    }

    public String getGeneratedCustomerFileInDirectoryFromTemplatefile(String dir, String template)
        throws IOException {
        Scanner sc = new Scanner(new File(dir + template));
        template = template.replaceAll("TEMPLATE", current("yyyyMMdd_HHmmss")).replace(".DAT", "");
        FileWriter out = new FileWriter(dir + template);
        int claimCount = 0;
        boolean sbrFlag = false;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains("currentdate")) {
                line = buildclaim(line);
            }
            if (line.startsWith("SBR")) {
                sbrFlag = true;
            }
            if ((line.startsWith("NM1")) && (sbrFlag)) {
                String[] vals = line.split("\\*");
                line =
                        line.replaceFirst(vals[ 3 ], "Test_" + claimCount + "_"
                                + current("yyyyMMdd_HHmmss"));

                sbrFlag = false;
            }
            if (line.startsWith("CLM")) {
                claimCount++;
                String[] vals = line.split("\\*");
                line =
                        line.replaceFirst(vals[ 1 ], "Test_" + claimCount + "_"
                                + current("yyyyMMdd_HHmmss"));
            }
            out.write(line);
            out.write("\r\n");
        }
        out.close();
        return template;
    }
    public void SSHService() {
    	
    	JSch jsch = new JSch();
    	//ev = ev.toUpperCase();
    	
    	try {
    		// TODO - can we pick random port ?
    		Session session = jsch.getSession("wesbuser", "APSRT0109", 22);
    															
    		session.setPassword("uT3MALxe");
    		session.setConfig("StrictHostKeyChecking", "no");
    		session.connect();
    		System.out.println("QA Unix session established");
    		//Logger.getLogger(SSHService.class.getName()).info("QA Unix session established");
    	} catch (JSchException jschX) {
    		System.out.println("Connection failed"); //Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating QA SSH service: " + jschX.getMessage());
    		throw new IllegalStateException("Problem occurred while creating QA SSH service", jschX);
    	}
    	
    }
    public void copyFiles(String file_name, String file_path) throws JSchException, SftpException, FileNotFoundException{
    	SSHService();
    	ChannelSftp sftpChannel =null;
    	FileInputStream fis = null;
    	Session session = null;
		//Session session = null;
    	Channel channel = session.openChannel("sftp");
    	channel.connect();
    	sftpChannel = (ChannelSftp) channel;
    	
    	String dst = "/cas/TST/data/inb/cs/";
    	String srcFilePath = file_path + "\\" +file_name;
    	//String srcFilePath1 = file_path + "\\" +file_name +".TRG";
    	
    	try {
    		
    		sftpChannel.cd(dst);
    	    File srcFile = new File(srcFilePath);
    	    sftpChannel.put(new FileInputStream(srcFile), srcFile.getName(),ChannelSftp.OVERWRITE);
    	    sftpChannel.cd(dst);
    	    /*File srcFile1 = new File(srcFilePath1);
    	    sftpChannel.put(new FileInputStream(srcFile1), srcFile1.getName(),ChannelSftp.OVERWRITE);
    	    System.out.println("Files moved to Landing Zone");*/
    		
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
    static public void close() {
    	Channel session = null;
    	session.disconnect();
    	System.out.println("QA Unix session closed");
    }

    
    public String getGeneratedFcdFileInDirectoryFromTemplatefile(String dir, String template)
        throws IOException {
        Scanner sc = new Scanner(new File(dir + template));
        template = template.replaceAll("TEMPLATE", current("yyyyMMdd_HHmmss")).replace(".DAT", "");
        FileWriter out = new FileWriter(dir + template);
        int claimCount = 0;

        List<String> segments = Arrays.asList(new String[]{
            "SBR", "PWK", "CDE", "PRV", "PRV", "OSB", "OAI", "XSVC", "XSVD", "XCAS"
        });
        String clmNum = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] vals = line.split("\\|");
            if (vals[ 0 ].equalsIgnoreCase("CLM")) {
                claimCount++;
                clmNum = "Test" + claimCount + current("yyyyMMddHHmmss");
                line = line.replaceFirst(vals[ 1 ], clmNum);
            }
            if (vals[ 0 ].equalsIgnoreCase("SBR")) {
                line = line.replaceFirst(vals[ 8 ], clmNum);
            }
            if (segments.contains(vals[ 0 ])) {
                line = line.replaceFirst(vals[ 1 ], clmNum);
            }
            out.write(line);
            out.write("\n");
        }
        out.close();
        return template;
    }
    
    public void compareFiles(String file_name, String file_path) throws JSchException, SftpException, FileNotFoundException{
    	SSHService();
    	ChannelSftp sftpChannel =null;
    	FileInputStream fis = null;
    	Session session = null;
		//Session session = null;
    	Channel channel = session.openChannel("sftp");
    	channel.connect();
    	sftpChannel = (ChannelSftp) channel;
    	
    	String dst = "/cas/TST/data/inb/cs/";
    	String srcFilePath = file_path + "\\" +file_name;
    	//String srcFilePath1 = file_path + "\\" +file_name +".TRG";
    	
    	try {
    		
    		sftpChannel.cd(dst);
    	    File srcFile = new File(srcFilePath);
    	    sftpChannel.put(new FileInputStream(srcFile), srcFile.getName(),ChannelSftp.OVERWRITE);
    	    sftpChannel.cd(dst);
    	    /*File srcFile1 = new File(srcFilePath1);
    	    sftpChannel.put(new FileInputStream(srcFile1), srcFile1.getName(),ChannelSftp.OVERWRITE);
    	    System.out.println("Files moved to Landing Zone");*/
    		
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
    public String commandInToLocationZone( String command, String host, String userName,
            String password) throws JSchException, IOException, InterruptedException {
        InputStream in = null;
        InputStream err = null;
       List sb = new ArrayList();
        BufferedReader inReader = null;
        BufferedReader errReader = null;
        try {

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession(userName, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			channel.setInputStream(null);
			((ChannelExec) channel).setErrStream(System.err);

			 in = channel.getInputStream();
			channel.connect();
			byte[] tmp = new byte[1024];
//			while (true) {
//				while (in.available() > 0) {
//					int i = in.read(tmp, 0, 1024);
//					if (i < 0)
//						break;
//					System.out.print(new String(tmp, 0, i));
//				}
//				if (channel.isClosed()) {
//					System.out.println("exit-status: " + channel.getExitStatus());
//					break;
//				}
//				try {
//					Thread.sleep(1000);
//				} catch (Exception ee) {
//				}
//			}
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return "Command Executed Successfully";

    }
    
    public String commandhedisInToLocationZone( String command, String host, String userName,
            String password) throws JSchException, IOException, InterruptedException {
        InputStream in = null;
        InputStream err = null;
       List sb = new ArrayList();
        BufferedReader inReader = null;
        BufferedReader errReader = null;
        try {

			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			JSch jsch = new JSch();
			Session session = jsch.getSession(userName, host, 22);
			session.setPassword(password);
			session.setConfig(config);
			session.connect();
			System.out.println("Connected");

			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			channel.setInputStream(null);
			((ChannelExec) channel).setErrStream(System.err);

			 in = channel.getInputStream();
			channel.connect();
			byte[] tmp = new byte[1024];
			while (true) {
				while (in.available() > 0) {
					int i = in.read(tmp, 0, 1024);
					if (i < 0)
						break;
					System.out.print(new String(tmp, 0, i));
				}
				if (channel.isClosed()) {
					System.out.println("exit-status: " + channel.getExitStatus());
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception ee) {
				}
			}
			channel.disconnect();
			session.disconnect();
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return "Command Executed Successfully";

    }

    public void compareTextFile(String file,String sourceFile,String diffFile) throws IOException 
    {

        
            BufferedReader br1 = null;
            BufferedReader br2 = null;
            String sCurrentLine;

            ArrayList<String> oldFileLines = new ArrayList<String>();
            ArrayList<String> newFileLines = new ArrayList<String>();
            ArrayList<String> diffFileLines = new ArrayList<String>();
            br1 = new BufferedReader(new FileReader(file));
            br2 = new BufferedReader(new FileReader(sourceFile));
                   
            BufferedWriter writer=null;
            writer = new BufferedWriter(new FileWriter(diffFile));
             
            while ((sCurrentLine = br1.readLine()) != null) {
            	oldFileLines.add(sCurrentLine);
            }
            while ((sCurrentLine = br2.readLine()) != null) {
            	newFileLines.add(sCurrentLine);
            }
            
            //System.out.println("content from test2.txt which is not there in test.txt");

            diffFileLines = newFileLines;
            diffFileLines.removeAll(oldFileLines);
            int entCount=0;
            int idCount=0;
            int spcCount=0;
            int adrCount=0;
            int affCount=0;
            for (int i = 0; i < diffFileLines.size()-1; i++) {
            	String segmentName = diffFileLines.get(i).substring(0, 3);
            	System.out.println("segmentName:::"+segmentName);
            	switch (segmentName) {
    			case "ENT":
    				entCount++;
    				break;
    			
    			case "ID|":
    				idCount++;
    				break;
    			case "AFF":
    				affCount++;
    				break;
    			case "SPC":
    				spcCount++;
    				break;
    			case "ADR":
    				adrCount++;
    				break;
    			}
                writer.write(diffFileLines.get(i));
                System.out.println("diffFileLines.get(i):::::"+diffFileLines.get(i));
                writer.write("\n");
    		}
            StringBuilder countLine = new StringBuilder();
            countLine.append("CNT|").append(entCount).append("|").append(idCount).append("|").append(affCount).append("|").append(spcCount).append("|").append(adrCount).append("|").append(entCount+idCount+spcCount+adrCount);
            //System.out.println("count line:::::::"+countLine.toString());
            writer.write(countLine.toString());
            writer.close();
            br1.close();
            br2.close();
        }
    
    public  String readHDEExportFile(String readFile, String sEnv, String pkey, String fkey) throws Exception 
    {
		String sSqlConfig = "";
		File file = new File(readFile);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) 
		{
			stringBuffer.append(line);
			stringBuffer.append("\n");
			String[] elements = line.split(",");
			for (int i = 0; i<elements.length; i++)
			{
				System.out.println(elements[i]);
			}
			if (readFile.contains("Result"))
			{
				sSqlConfig="select MSR_ID,MSR_NM,STRAT_ID,MBR_ID, RSLT_ANS,DENOM_FLG,DENOM_XCLS_FLG,DENOM_XCPT_FLG,NMT_FLG,NMT_XCLS_FLG,MSRMT_END_DT,QUAL_DT,RUN_DT,EPSD_NBR,EXPT_VST_CNT,ACTUL_VST_CNT,"
						+ "MBR_MO_CNT,DAY_CNT,DSCHRG_CNT,SRVC_CNT,SURG_WGT,BAS_RISK_WGT,AGE_AND_GDR_WGT,DCC_WGT,COMORB_WGT,AGE,GDR,RISK_SCOR,ADJ_PRBL,VARIANCE,DCC_CATGY,POP_ID,PROV_ORG_ID,SUPL_ONLY_FLG,"
						+ "BAS_RISK_WGT_2,AGE_AND_GDR_WGT_2,COMORBIDITY_WGT_2,MSR_SET_ID,SRC_MSR,CMS_HOSP_ID from HDE_MSR_RSLT where MSR_ID = 'ART' AND PROJECT_KEY ="+pkey+"  AND FILE_KEY = "+fkey+"";
			
				ResultSet rsConfig=DataBaseConnect.getRsList(sEnv+"-DW", sSqlConfig);
				 boolean bFlag=true;
				 String returnStr="";
				 String[] dbVal = new String[40]; 
				 int iCounter=0;
				while(rsConfig.next())
				 {
					dbVal[iCounter]=rsConfig.getString(iCounter);
					iCounter=iCounter+1;
//					 String Res1=rsConfig.getString("MSR_ID");
//					 String Res2=rsConfig.getString("MSR_NM");
//					 String Res3=rsConfig.getString("STRAT_ID");
//					 String Res4=rsConfig.getString("MBR_ID");
//					 String Res5=rsConfig.getString("RSLT_ANS");
//					 String Res6=rsConfig.getString("DENOM_FLG");
//					 String Res7=rsConfig.getString("DENOM_XCLS_FLG");
//					 String Res8=rsConfig.getString("DENOM_XCPT_FLG");
//					 String Res9=rsConfig.getString("NMT_FLG");
//					 String Res10=rsConfig.getString("NMT_XCLS_FLG");
//					 String Res11=rsConfig.getString("MSRMT_END_DT");
//					 String Res12=rsConfig.getString("QUAL_DT");
//					 String Res13=rsConfig.getString("RUN_DT");
//					 String Res14=rsConfig.getString("EPSD_NBR");
//					 String Res15=rsConfig.getString("EXPT_VST_CNT");
//					 String Res16=rsConfig.getString("ACTUL_VST_CNT");
//					 String Res17=rsConfig.getString("MBR_MO_CNT");
//					 String Res18=rsConfig.getString("DAY_CNT");
//					 String Res19=rsConfig.getString("DSCHRG_CNT");
//					 String Res20=rsConfig.getString("SRVC_CNT");
//					 String Res21=rsConfig.getString("SURG_WGT");
//					 String Res22=rsConfig.getString("BAS_RISK_WGT");
//					 String Res23=rsConfig.getString("AGE_AND_GDR_WGT");
//					 String Res24=rsConfig.getString("DCC_WGT");
//					 String Res25=rsConfig.getString("COMORB_WGT");
//					 String Res26=rsConfig.getString("AGE");
//					 String Res27=rsConfig.getString("GDR");
//					 String Res28=rsConfig.getString("RISK_SCOR");
//					 String Res29=rsConfig.getString("ADJ_PRBL");
//					 String Res30=rsConfig.getString("VARIANCE");
//					 String Res31=rsConfig.getString("DCC_CATGY");
//					 String Res32=rsConfig.getString("POP_ID");
//					 String Res33=rsConfig.getString("PROV_ORG_ID");
//					 String Res34=rsConfig.getString("SUPL_ONLY_FLG");
//					 String Res35=rsConfig.getString("BAS_RISK_WGT_2");
//					 String Res36=rsConfig.getString("AGE_AND_GDR_WGT_2");
//					 String Res37=rsConfig.getString("COMORBIDITY_WGT_2");
//					 String Res38=rsConfig.getString("MSR_SET_ID");
//					 String Res39=rsConfig.getString("SRC_MSR");
//					 String Res40=rsConfig.getString("CMS_HOSP_ID");
				
					
					
						}
				for (int i=0;i<40;i++)
				{
					if (elements[i] != dbVal[i])
					{
					 	bFlag=false;
					 	returnStr= "Fail: In file :" + elements[i] + "  but in DB:  "+ dbVal[i];
				}
				}
				if (bFlag)
				{
					return " All validation Passed ";
				}
				else
				{
					return returnStr;
				}
			} 
		
		}
		fileReader.close();
		return line;
    }


}
 /*public void copyFiles(String file, String dir, this.host, this.user, this.pass, String todir) throws FileNotFoundException, SftpException, JSchException {
	ChannelSftp sftpChannel =null;
	FileInputStream fis = null;
	Session session = getSession(userName, host, password);
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
}*/

