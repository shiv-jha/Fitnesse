package com.optum.hde.fitnesse.measure.run;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import com.optum.hde.fitnesse.Measure;
import com.optum.hde.fitnesse.Environ;
import com.optum.hde.fitnesse.Properties;

public class UnixCommandExecutor {
	public static String landingPath;
	private static final Logger log = Logger.getLogger(UnixCommandExecutor.class.getName());
	static Properties properties = Properties.MAP;


	public static String runMeasure(Environ env, int measYr, Measure measureInfo) throws IOException {
		log.info("Inside unixcommandexecutor run measure");
		SSHService sh = new SSHService(env.envId);
		String measureFileName = sh.copyFiles(env, measYr, measureInfo);
		landingPath = env.getLandingZone();
		log.info("Namrata - landingpath inside runmeasure - " + landingPath);
		
		//Namrata - Landing zone path is taken from properties file
		//String command = "sed -i 's/\r$//g' /hde/measures/landing/" + measureFileName + ".txt";
		String command = "sed -i 's/\r$//g' " + landingPath + "/" + measureFileName + ".txt";
		log.info("sed for txt : " + command);	
		String result = sh.sendCommand(command);
		
		//Namrata - Landing zone path is taken from properties file
		//command = "sed -i 's/\r$//g' /hde/measures/landing/" + measureFileName + ".trg";
		command = "sed -i 's/\r$//g' " + landingPath + "/" + measureFileName + ".trg";
		log.info("sed for trg : " + command);	
		result = sh.sendCommand(command);
		
		//Namrata - Landing zone path is taken from properties file
		//command = "gzip /hde/measures/landing/" + measureFileName + ".txt";
		command = "gzip " + landingPath + "/" + measureFileName + ".txt";
		log.info("gzip for txt : " + command);			
		result = sh.sendCommand(command);
		
		//Namrata - Landing zone path is taken from properties file
		//command = "chmod 777 /hde/measures/landing/*.*";
		command = "chmod 777 " + landingPath + "/" + measureFileName + "*.*";
		log.info("chmod for both : " + command);
		result = sh.sendCommand(command);
	
		/*
		command = "/hde/scripts/measures/" + measureInfo.getScriptName() + " " + measureInfo.getMeasureName();
		log.info("Executed command: " + command);
		result = SSHService.SESSION.sendCommandWithSleep(command, 25000);
		*/
		log.info(result);
		
		log.info("Namrata - Commented running the scripts");
		
		return measureFileName;
	}
	

	public static String runMemberMonth(Environ env, int measYr, Measure measureInfo) throws IOException {
		SSHService sh = new SSHService(env.envId);
		String memberMonthFileName = sh.copyMemberMonthFiles(env, measYr, measureInfo);
		landingPath = env.getLandingZone();
		log.info("Namrata - landingpath inside runmembermonth - " + landingPath);

		
		String command = "sed -i 's/\r$//g' " + landingPath + "/" + memberMonthFileName + ".txt";
		String result = sh.sendCommand(command);
		
		command = "sed -i 's/\r$//g' "+ landingPath + "/" + memberMonthFileName + ".trg";
		result = sh.sendCommand(command);
		
		command = "gzip "+ landingPath + "/" + memberMonthFileName + ".txt";
		result = sh.sendCommand(command);
		
		command = "chmod 777 "+ landingPath + "/" + "*.*";
		result = sh.sendCommand(command);
		
/*		command = "rm /hde/scripts/measures/Configurations/"+env.clientId+"_MBRMTHMD_List.config";
		result = SSHService.SESSION.sendCommand(command);
		
		command = "/hde/scripts/measures/hde_measures_MBRFiles.sh";
		log.info("Executed command: " + command);
		result = SSHService.SESSION.sendCommandWithSleep(command, 15000);
*/		log.info(result);
		
		return memberMonthFileName;
	}

	public static String runMeasureAndMBRData(Environ env, int measYr, Measure measureInfo) {
		SSHService sh = new SSHService(env.envId);
		String memberMonthFileName = sh.copyMemberMonthFiles(env, measYr, measureInfo);
		String measureFileName = sh.copyFiles(env, measYr, measureInfo);
		landingPath = env.getLandingZone();
		
		// sed on both abx data and rx file
		String command = "sed -i 's/\r$//g' "+ landingPath + "/" + measureFileName + ".txt";
		String result = sh.sendCommand(command);
		command = "sed -i 's/\r$//g' " + landingPath + "/" + memberMonthFileName + ".txt";
		result = sh.sendCommand(command);
		
		// sed trg files
		command = "sed -i 's/\r$//g' " + landingPath + "/" + measureFileName + ".trg";
		result = sh.sendCommand(command);
		command = "sed -i 's/\r$//g' " + landingPath + "/" + memberMonthFileName + ".trg";
		result = sh.sendCommand(command);
		
		// gzip both files
		command = "gzip " + landingPath + "/" + measureFileName + ".txt";
		result = sh.sendCommand(command);
		command = "gzip " + landingPath + "/" + memberMonthFileName + ".txt	";
		result = sh.sendCommand(command);
		
		command = "chmod 777 " + landingPath + "/" + "*.*";
		result = sh.sendCommand(command);
		
		//command = "/hde/scripts/measures/" + measureInfo.getScriptName() + " " + measureInfo.getMeasureName();
		//log.info("Executed command: " + command);
		//result = SSHService.SESSION.sendCommandWithSleep(command, 25000);
		log.info(result);
		
		return memberMonthFileName;
	}
}
