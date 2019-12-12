package com.optum.hde.fitnesse.fixtures;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.optum.rqns.services.utils.DataBaseConnect;
public class Extract {
	
public Extract() {
		
	}

public String  validateAsmExtractHeading(String formatFile,String actualFile,String sFolder) throws IOException 
{
	BufferedReader br1 = null;
    BufferedReader br2 = null;
    String sCurrentLine;
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    br1 = new BufferedReader(new FileReader(sFolder+formatFile));
    br2 = new BufferedReader(new FileReader(sFolder+actualFile));
    
    while ((sCurrentLine = br1.readLine()) != null) {
        list1.add(sCurrentLine);
        break;
    }
    while ((sCurrentLine = br2.readLine()) != null) {
        list2.add(sCurrentLine);
        break;
    }
    Iterator it=list1.iterator();
    String msg="";
    int iCount=0;
    int iExpectedCount=list1.size();
    int iActualCount=list2.size();
    if (iExpectedCount==iActualCount)
    {
    	for (int iIterator=0;iIterator<iExpectedCount;iIterator++)
    	if(list1.get(iIterator).contains(list2.get(iIterator)))
    	{
    		
    	}
    	else
    			{
    				msg="Not matches" + " desire format:-" +list1.get(iIterator).toString() +" But in file "+ list2.get(iIterator).toString();	
    			break;
    			}
    }
    else
    {
    	msg="Failed- Count mismatch in format "+iExpectedCount + " in actual "+ iActualCount; 
    }
    /*while(it.hasNext())
    {
    	if ( !(it.toString().equals(list2.get(iCount).toString())))
    	{
    		msg="Not matches" + " desire format:-" +it.toString() +" But in file "+ list2.get(iCount).toString();
    		 break;
    	}
    	iCount=iCount+1;
    }*/
    if (msg=="")
    	msg="Passed all validation  with "+list1.get(0).toString();
    return msg;
}

/**
 * Unzip it
 * @param zipFile input zip file
 * @param output zip file output folder
 * @return 
 */
public String unzipFileFromFolder(String zipFile, String outputFolder){

 byte[] buffer = new byte[1024];
String returnval = zipFile +"  "+outputFolder;
 try{

	//create output directory is not exists
	File folder = new File(outputFolder);
	if(!folder.exists()){
		folder.mkdir();
	}

	//get the zip file content
	zipFile=outputFolder+zipFile;
	ZipInputStream zis =new ZipInputStream(new FileInputStream(zipFile));
	//get the zipped file list entry
	ZipEntry ze = zis.getNextEntry();
	returnval=ze.toString();
	while(ze!=null){

	   String fileName = ze.getName();
       File newFile = new File(outputFolder + File.separator + fileName);

       System.out.println("file unzip : "+ newFile.getAbsoluteFile());

        //create all non exists folders
        //else you will hit FileNotFoundException for compressed folder
        new File(newFile.getParent()).mkdirs();

        FileOutputStream fos = new FileOutputStream(newFile);

        int len;
        while ((len = zis.read(buffer)) > 0) {
   		fos.write(buffer, 0, len);
        }

        fos.close();
        ze = zis.getNextEntry();
	}

    zis.closeEntry();
	zis.close();

	System.out.println("Done");

}catch(IOException ex){
   ex.printStackTrace();
}
 return returnval;

}



public String extractFileFromFolder(String zipFile, String outputFolder){

	 byte[] buffer = new byte[1024];
	String returnval = zipFile +"  "+outputFolder;
	 try{

		//create output directory is not exists
		File folder = new File(outputFolder);
		if(!folder.exists()){
			folder.mkdir();
		}

		//get the zip file content
		zipFile=outputFolder+zipFile;
		ZipInputStream zis =new ZipInputStream(new FileInputStream(zipFile));
		//get the zipped file list entry
		ZipEntry ze = zis.getNextEntry();
		returnval=ze.toString();
		while(ze!=null){

		   String fileName = ze.getName();
	       File newFile = new File(outputFolder + File.separator + fileName);

	       System.out.println("file unzip : "+ newFile.getAbsoluteFile());

	        //create all non exists folders
	        //else you will hit FileNotFoundException for compressed folder
	        new File(newFile.getParent()).mkdirs();

	        FileOutputStream fos = new FileOutputStream(newFile);

	        int len;
	        while ((len = zis.read(buffer)) > 0) {
	   		fos.write(buffer, 0, len);
	        }

	        fos.close();
	        ze = zis.getNextEntry();
		}

	    zis.closeEntry();
		zis.close();

		System.out.println("Done");

	}catch(IOException ex){
	   ex.printStackTrace();
	}
	 return returnval;

	}


private File getLatestFilefromDir(String dirPath){
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    if (files == null || files.length == 0) {
        return null;
    }

    File lastModifiedFile = files[0];
    for (int i = 1; i < files.length; i++) {
       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
           lastModifiedFile = files[i];
       }
    }
    return lastModifiedFile;
}
public String verifyCdoExtractByType(String sGeneratedFile,String sEnv,String sFileType) throws Exception
{
	BufferedReader reader = new BufferedReader(new FileReader(new File(sGeneratedFile)));//"C:\\imp\\test.txt"
	String inputLine = null;
	List<HashMap<String,String>> listRecord = new ArrayList<HashMap<String,String>>();
	HashMap<String,String> config=new HashMap<String,String>();
	
//	dictionary

	String   inputHeader = reader.readLine();
	String[] words1 = inputHeader.split("\\|");
	int iFIleLength=words1.length;
	//System.out.println(words1[0]);
	//System.out.println(words1[1]);
	String[] lines;
	while((inputLine = reader.readLine()) != null)
	{
		//System.out.println(inputLine);
		lines=inputLine.split("\\|");
		//System.out.println("count is "+lines.length);
	//	System.out.println(lines[0]);
		//int icounter=0;
		
		HashMap<String,String> dictionary = new HashMap<String,String>();
	for (int j=0;j<lines.length;j++) {
		//System.out.println(w);
		//System.out.println(lines[icounter]);
		if(lines[j]=="")
			continue;
		dictionary.put(words1[j], lines[j]);
		//icounter=icounter+1;
	}
		HashMap<String, String> dictonary1 = dictionary;
		listRecord.add(dictonary1);
		//System.out.println("existence: "+listRecord.get(0).isEmpty());
	//	dictionary.remove(key)
	}

	String sSqlCOunt="";
	String sSqlConfig="";
	String sTblNm="";
	if(sFileType.equalsIgnoreCase("TRR"))
	{
	 sSqlCOunt="select count(*) as rCount from etl_cms_field_config where cms_Extr_Typ_sk=2";
	 sSqlConfig="select BUS_FIELD_NM,DB_FIELD_NM from etl_cms_field_config where cms_Extr_Typ_sk=2 order by  sort_ordr";
	 sTblNm="CMS_TRR";
	}
	else if(sFileType.equalsIgnoreCase("MOR12"))
	{
		 sSqlCOunt="select count(*) as rCount from etl_cms_field_config where cms_Extr_Typ_sk=4";
		 sSqlConfig="select BUS_FIELD_NM,DB_FIELD_NM from etl_cms_field_config where cms_Extr_Typ_sk=4 order by  sort_ordr";
		 sTblNm="CMS_MOR_V12";
	}
	 ResultSet rsCount=DataBaseConnect.getRsList(sEnv+"-DW", sSqlCOunt);//"PROD-DW"
	 rsCount.next();
	 if(iFIleLength==rsCount.getInt("rCount"))
	 {
		 System.out.println("Passed   Total record in config table and no of columns in header -extract file matches");
	 }
	 else
	 {
		 System.out.println("Failed   Total record in config table and no of columns in header -extract file not matches"); 
	 }
	 System.out.println("record count is "+ rsCount.getInt("rCount"));
	 
	
	 ResultSet rsConfig=DataBaseConnect.getRsList(sEnv+"-DW", sSqlConfig);
	/// rsConfig.re
	 while(rsConfig.next())
	 {
		 config.put(rsConfig.getString(1), rsConfig.getString(2));
		 //System.out.println("Key: "+rsConfig.getString(1)+"  Value:-"+ rsConfig.getString(2));
	 }
	 String val="";
     for (int listCount=0;listCount<listRecord.size();listCount++)
     {	
 
    	 Iterator it=listRecord.get(0).entrySet().iterator();
    	 String sCms_trr=listRecord.get(0).get("UniqueRecordKey");
    	 
    	 String sSql="select * from "+sTblNm+" where cms_trr_sk="+sCms_trr;
    	 System.out.println("sql  "+sSql);
    	 ResultSet rs=DataBaseConnect.getRsList(sEnv+"-DW", sSql);
    	//while(rs.next())
    	 //System.out.println(rs.getString(1));
    	// String sResponseSql="z";
    	 while(rs.next())
    	 while(it.hasNext())
    	 { 
    		 Map.Entry pair=(Map.Entry)it.next();
    		// pair.getValue()
    		// System.out.println(pair.getKey());
    		//System.out.println(config.get(pair.getKey()));
    		// System.out.println(pair.getKey() +"  :-  " + pair.getValue());
    		if(pair.getValue().toString().equals(rs.getString(config.get(pair.getKey()))))
    		{
    			System.out.println("pass  Expected:"+ pair.getValue().toString() + " Actual:+  "+rs.getString(config.get(pair.getKey())));
    		}
    		else if(pair.getValue().toString().equals("") && rs.getString(config.get(pair.getKey()))==null)
    		{
    			System.out.println("pass  Expected:"+ pair.getValue().toString() + " Actual:+  "+rs.getString(config.get(pair.getKey())));
    		}
    		else
    		{
    			System.out.println("Failed  Expected:"+ pair.getValue().toString() + " Actual:+  "+rs.getString(config.get(pair.getKey())));
    		}
    	
    		 
    		
    		// System.out.println("Compare me: "+ pair.getValue()  +"  -"+ rs.getString(config.get(pair.getKey())) );
    		// pair.getValue();
    		 //rs.getString(config.get(pair.getKey()));
    	 }
    	 break;
     }

	reader.close();
	return val;

}

}
