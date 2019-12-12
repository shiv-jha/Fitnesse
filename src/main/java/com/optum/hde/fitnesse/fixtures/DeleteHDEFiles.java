package com.optum.hde.fitnesse.fixtures;

import java.io.File;
import java.io.IOException;

public class DeleteHDEFiles {
	
	public String DeleteHDEFilesFromInbound(String filetodelete) throws IOException {
        
		try {
			
        File file = new File("E:\\Automation\\Rahul\\paftrack\\" + filetodelete);
        
       file.delete();

        
		return "Pass";
		}
		catch (Exception e) {
            e.printStackTrace();
            return "Fail" + e.getMessage();
		}
}
}
