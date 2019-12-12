package com.optum.hde.fitnesse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

import com.optum.stk.core.STK;
import com.optum.stk.errors.STKValidatorException;

public enum Properties {

	MAP;
	private java.util.Properties prop = new java.util.Properties();

	private Properties() {
		String propertiesFilePath = HDE.USER_DIR + File.separator + "fitnesse.properties";
		try {
			if (STK.validator().isValidFilePath(new File(propertiesFilePath).toURI().getPath())) {
				FileInputStream in = new FileInputStream(propertiesFilePath);
				// Load properties
				try {
					prop.load(in);
				} catch (IOException io) {
					//Logger.getLogger(Properties.class.getName()).severe("Not able to load propeties file fitnesse.properties" + io.getMessage());
					throw new IllegalStateException("Not able to load propeties file fitnesse.properties");
				}  finally {
					in.close();
				}
				//Logger.getLogger(Properties.class.getName()).info("Properties loaded");
			} else {
				//Logger.getLogger(Properties.class.getName()).severe("Security issue: Path is not valid ? ");
			}
		} catch (IOException io) {
			//Logger.getLogger(Properties.class.getName()).severe("Not able to load propeties file fitnesse.properties" + io.getMessage());
			throw new IllegalStateException("Not able to load propeties file fitnesse.properties");
		} catch (STKValidatorException e) {
			//Logger.getLogger(Properties.class.getName()).severe("Not able to load propeties file fitnesse.properties" + e.getMessage());
			throw new IllegalStateException("Not able to load propeties file fitnesse.properties");
		} catch (Exception e) {
			//Logger.getLogger(Properties.class.getName()).severe("Not able to load propeties file fitnesse.properties" + e.getMessage());
			throw new IllegalStateException("Not able to load propeties file fitnesse.properties");
		}
	}

	public String getProperty(String key) {
		return (String) prop.get(key);
	}

}
