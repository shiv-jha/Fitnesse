package com.optum.hde.fitnesse.fixtures;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;



public class Zippingfile {
	
		public String compressFileToUnixZip(String file, String gzipFile) {
        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(gzipFile);
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while((len=fis.read(buffer)) != -1){
                gzipOS.write(buffer, 0, len);
            }

            gzipOS.close();
            fos.close();
            fis.close();
            return "Pass";
        } catch (Exception e) {
            e.printStackTrace();
            return "Fail" + e.getMessage();
        }
       
        
    }

}
