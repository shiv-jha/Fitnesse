package com.optum.hde.fitnesse.measure.run;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.optum.hde.fitnesse.HDE;
import com.optum.hde.fitnesse.Measure;
import com.optum.hde.fitnesse.Environ;
import com.optum.hde.fitnesse.Properties;
import com.optum.hde.fitnesse.repo.impl.CoreRepoImpl;
import com.optum.stk.core.STK;
import com.optum.stk.errors.STKValidatorException;

public class SSHService {
	private static Session session;
	private final static Logger log = Logger.getLogger(SSHService.class.getName());
		
	public SSHService(String ev) {
		Properties properties = Properties.MAP;
		JSch jsch = new JSch();
		ev = ev.toUpperCase();
		switch (ev) {
			case "QA":
				try {
					// TODO - can we pick random port ?
					session = jsch.getSession(properties.getProperty("ds.server.username"), properties.getProperty("ds.server.hostname"), Integer.parseInt(properties.getProperty("ds.server.port")));
																		
					session.setPassword(properties.getProperty("ds.server.pwd"));
					session.setConfig("StrictHostKeyChecking", "no");
					session.connect();
					Logger.getLogger(SSHService.class.getName()).info("Namrata - QA Unix session established");
				} catch (JSchException jschX) {
					Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating QA SSH service: " + jschX.getMessage());
					throw new IllegalStateException("Namrata - Problem occurred while creating QA SSH service", jschX);
				}
				break;
				
			case "STG":
				try {
					// TODO - can we pick random port ?
					session = jsch.getSession(properties.getProperty("ds.stg.server.username"), properties.getProperty("ds.stg.server.hostname"), Integer.parseInt(properties.getProperty("ds.stg.server.port")));
																		
					session.setPassword(properties.getProperty("ds.stg.server.pwd"));
					session.setConfig("StrictHostKeyChecking", "no");
					session.connect();
					Logger.getLogger(SSHService.class.getName()).info("STG Unix session established");
				} catch (JSchException jschX) {
					Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating STG SSH service: " + jschX.getMessage());
					throw new IllegalStateException("Problem occurred while creating STG SSH service", jschX);
				}
				break;
				
			case "QANEW":
				try {
					// TODO - can we pick random port ?
					session = jsch.getSession(properties.getProperty("ds.qanew.server.username"), properties.getProperty("ds.qanew.server.hostname"), Integer.parseInt(properties.getProperty("ds.qanew.server.port")));
																		
					session.setPassword(properties.getProperty("ds.qanew.server.pwd"));
					session.setConfig("StrictHostKeyChecking", "no");
					session.connect();
					Logger.getLogger(SSHService.class.getName()).info("QANEW Unix session established");
				} catch (JSchException jschX) {
					Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating QANEW SSH service: " + jschX.getMessage());
					throw new IllegalStateException("Problem occurred while creating QANEW SSH service", jschX);
				}
				break;
			case "STGNEW":
				try {
					// TODO - can we pick random port ?
					session = jsch.getSession(properties.getProperty("ds.stgnew.server.username"), properties.getProperty("ds.stgnew.server.hostname"), Integer.parseInt(properties.getProperty("ds.stgnew.server.port")));
																		
					session.setPassword(properties.getProperty("ds.stgnew.server.pwd"));
					session.setConfig("StrictHostKeyChecking", "no");
					session.connect();
					Logger.getLogger(SSHService.class.getName()).info("STGNEW Unix session established");
				} catch (JSchException jschX) {
					Logger.getLogger(SSHService.class.getName()).severe("Problem occurred while creating STGNEW SSH service: " + jschX.getMessage());
					throw new IllegalStateException("Problem occurred while creating STGNEW SSH service", jschX);
				}
				break;
				
		}
	}

	public String copyFiles(Environ env, int mYear, Measure measure) {
		ChannelSftp sftpChannel = null;
		
	
		
		try {
			String changeFileName = getFileNameWithPattern(measure.getMeasureName(), env.clientId, env.projectId,env.envId, mYear);
			log.info("Measure file name:" + changeFileName);
			Channel channel = session.openChannel("sftp");
			channel.connect();
			sftpChannel = (ChannelSftp) channel;
			
			String basedir = HDE.USER_DIR + File.separator + "testdata" + File.separator + mYear;
			File inputFile = null;
			String path = "";
			if (measure.isNcqaTest()) {
				path = basedir + File.separator + "ncqa" + File.separator + "dp"+measure.getPatternNum() + File.separator + measure.getMeasureName() + HDE.MEASURE_FILE_NAME_EXTENSION_TXT;
				if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
					inputFile = new File(path);
				}
			} else {
				if (measure.getMeasureName().equalsIgnoreCase("TLM")) {
					path = basedir + File.separator + "dp"+measure.getPatternNum() + File.separator + env.clientId + File.separator + measure.getMeasureName() + HDE.MEASURE_FILE_NAME_EXTENSION_TXT;
					log.info("test data filepath is :" + path);
				}else {
					path = basedir + File.separator + "dp"+measure.getPatternNum() + File.separator + measure.getMeasureName() + HDE.MEASURE_FILE_NAME_EXTENSION_TXT;
					log.info("test data filepath is :" + path);
				}
				if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
					inputFile = new File(path);
				}
			}

			if (inputFile != null && !inputFile.exists()) {
				log.severe("File :" + measure.getMeasureName() +".txt not found under dp"+measure.getPatternNum());
				throw new IllegalStateException("File :" + measure.getMemberMonthCategory() +".txt not found under dp"+measure.getPatternNum());
			}

			putFile(env, inputFile, sftpChannel,changeFileName);
			putTrg(env, sftpChannel, changeFileName);
			
			return changeFileName;

		} catch (JSchException e) {
			log.severe("Problem occurred while creating running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while creating running SSH service", e);
		} catch (SftpException e) {
			log.severe("Problem occurred while copying file using SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while copying file using SSH service", e);
		} catch (IOException e) {
			log.severe("Problem occurred while running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while running SSH service", e);
		} catch (STKValidatorException e) {
			log.severe("Problem occurred while running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while running SSH service", e);
		} finally {
			if (sftpChannel != null) {
				sftpChannel.exit();
			}
		}
	}	

	public String copyMemberMonthFiles(Environ env, int measYr, Measure measure) {
		ChannelSftp sftpChannel = null;
		try {
			String changeFileName = getFileNameWithPattern(measure.getMeasureName(), env.clientId, env.projectId,env.envId, measYr);
			//String changeFileName=measure.getFileName();
			Channel channel = session.openChannel("sftp");
			channel.connect();
			sftpChannel = (ChannelSftp) channel;
			
			String basedir = HDE.USER_DIR + File.separator + "testdata" + File.separator + measYr;
			
			File inputFile = null;
			if (measure.isNcqaTest()) {
				String path = basedir + File.separator + "ncqa" + File.separator + "dp"+measure.getPatternNum() + File.separator + measure.getMemberMonthCategory() + HDE.MEASURE_FILE_NAME_EXTENSION_TXT;
				if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
					inputFile = new File(path);
				}
			} else {
				String path = basedir + File.separator + "dp"+measure.getPatternNum() + File.separator + measure.getMemberMonthCategory() + HDE.MEASURE_FILE_NAME_EXTENSION_TXT;
				if (STK.validator().isValidFilePath(new File(path).toURI().getPath())) {
					inputFile = new File(path);
				}
			}

			if (inputFile != null && !inputFile.exists()) {
				log.severe("File :" + measure.getMemberMonthCategory() +".txt not found under dp"+measure.getPatternNum());
				throw new IllegalStateException("File :" + measure.getMemberMonthCategory() +".txt not found under dp"+measure.getPatternNum());
			}
			
			putFile(env, inputFile, sftpChannel,changeFileName);
			putTrg(env, sftpChannel, changeFileName);
			
			log.info("Moved files to landing zone:" +changeFileName);
			return changeFileName;

		} catch (JSchException e) {
			log.severe("Problem occurred while creating running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while creating running SSH service", e);
		} catch (SftpException e) {
			log.severe("Problem occurred while copying file using SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while copying file using SSH service", e);
		} catch (IOException e) {
			log.severe("Problem occurred while running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while running SSH service", e);
		} catch (STKValidatorException e) {
			log.severe("Problem occurred while running SSH service" + e.getMessage());
			throw new IllegalStateException("Problem occurred while running SSH service", e);
		} finally {
			if (sftpChannel != null) {
				sftpChannel.exit();
			}
		}

	}
	
	private void putTrg(Environ env, ChannelSftp sftpChannel, String changeFileName) throws SftpException, IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(env.jobId.getBytes());
		out.write("\n".getBytes());
		InputStream is = new ByteArrayInputStream(out.toByteArray());
		try {
			sftpChannel.cd(env.getLandingZone());
			sftpChannel.put(is, changeFileName + HDE.TRIGGER_FILE_NAME_EXTENSION_TXT);
		} finally {
			is.close();
		}
	}

	public static void putFile(Environ env, File file, ChannelSftp sftpChannel, String changeFileName) throws SftpException, IOException {

		FileInputStream fis = null;
		try {
			sftpChannel.cd(env.getLandingZone());
			fis = new FileInputStream(file);
			sftpChannel.put(fis, changeFileName + HDE.MEASURE_FILE_NAME_EXTENSION_TXT);
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

	public String sendCommand(String command) {
		StringBuilder outputBuffer = new StringBuilder();
		InputStream commandOutput = null;
		try {
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			channel.connect();
			commandOutput = channel.getInputStream();
			int readByte = commandOutput.read();

			while (readByte != 0xffffffff) {
				outputBuffer.append((char) readByte);
				readByte = commandOutput.read();
			}

			channel.disconnect();
		} catch (IOException ioX) {
			log.severe("Problem occurred while executing command " + ioX.getMessage());
			throw new IllegalStateException(
					"Problem occurred while executing command " + command, ioX);
		} catch (JSchException jschX) {
			log.severe("Problem occurred while running SSH service" + jschX.getMessage());
			throw new IllegalStateException(
					"Problem occurred while executing command " + command,
					jschX);
		} finally {
			if (commandOutput != null) {
				try {
					commandOutput.close();
				} catch (IOException e) {
					throw new IllegalStateException("Problem occurred while closing input stream.");
				}
			}
		}

		return outputBuffer.toString();
	}

	public String sendCommandWithSleep(String command, int sleepTimeInMilliSecond) {
		StringBuilder outputBuffer = new StringBuilder();

		try {
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);
			channel.connect();

			// Wait for DS job to do the job and disconnect after that ?
			Thread.sleep(sleepTimeInMilliSecond);

			channel.disconnect();
		} catch (JSchException jschX) {
			log.severe("Problem occurred while executing command " + jschX.getMessage());
			throw new IllegalStateException(
					"Problem occurred while executing command " + command,
					jschX);
		} catch (InterruptedException e) {
			log.severe("Problem occurred while executing command " + e.getMessage());
			throw new IllegalStateException(
					"Problem occurred while executing command " + command, e);
		}

		return outputBuffer.toString();
	}
	
	private String getFileNameWithPattern(String measureName, String clientID, String projectID, String env, int mYear) {
		
		CoreRepoImpl corRep= new CoreRepoImpl();
		String measureSet= corRep.getMeasureSet(measureName, env);
		Date date = new Date();
		SimpleDateFormat dateDDMMYYY=new SimpleDateFormat("MMddyyyyHHmmss");//ddMMyyyyHHmm
		String dateAppender=dateDDMMYYY.format(date);
		
		String changeFileName=projectID+"_"+clientID+"_"+measureName+"_"+measureSet+"_"+dateAppender;
		return changeFileName;
	}
	
	static public void close() {
		session.disconnect();
	}
}
