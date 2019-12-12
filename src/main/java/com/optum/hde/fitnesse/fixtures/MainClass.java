package com.optum.hde.fitnesse.fixtures;

import java.io.IOException;

import com.jcraft.jsch.JSchException;

public class MainClass {

	public static void main(String[] args) {
		FileSupport fs = new FileSupport();
		try {
			fs.jobInToLocationZone("cd /cas/scripts/cornerstone/bin","apsrt1029", "wesbuser", "uT3MALxe");
		} catch (JSchException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
