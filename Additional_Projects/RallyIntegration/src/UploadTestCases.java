import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.CreateRequest;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.CreateResponse;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;
import com.rallydev.rest.util.Ref;


public class UploadTestCases {

	public static void readXLSFile(String sPath,String sName,String sApiKey,String sProjectRef,String sFolder) throws IOException
	{
		String sFile=sPath+"\\"+sName;
		InputStream ExcelFileToRead = new FileInputStream(sFile);
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);
		String[] storysplitted;
		String story = null;
		
		if(sName.contains("_"))
		{
			story=sName.split("_")[0];
		}
		
		else
			
		{
			System.out.println("story name is  not given in right format , exiting the tool");
			System.exit(0);
		}
		System.out.println("Concerned story is "+ story);
	//	story="US396651";
		
		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row; 
		HSSFCell cell;
		 ArrayList< String> input= new ArrayList<String>();
		 ArrayList< String> expected= new ArrayList<String>();
		 
		//Iterator rows = sheet.rowIterator();
		//int irow=0;

		//row=(HSSFRow) rows.next();
		//row=(HSSFRow) rows.next();
		 String tcname="";
		boolean bflag=false;
		int j;
		try
		{
			int irow=1;
		
			
		
		
		
		//	for (int i=2;i<100;i++)
			//{
			//	String story = sheet.getRow(irow).getCell(0).getStringCellValue();
				//if(story!="")
				//{
					//story = sheet.getRow(irow).getCell(0).getStringCellValue();
					//System.out.println(sheet.getRow(irow).getCell(1).getStringCellValue());
			try
			{
					for( j=irow;j<=100;j++)
					{
						
						
						
						
						
					//	System.out.println(sheet.getRow(j).getCell(0).getStringCellValue());
						if(!sheet.getRow(j).getCell(1).getStringCellValue().toLowerCase().equals("step1") && !sheet.getRow(j).getCell(1).getStringCellValue().toLowerCase().equals("step 1") )
						{
						//	System.out.println(sheet.getRow(j).getCell(1).getStringCellValue());
							input.add(sheet.getRow(j).getCell(2).getStringCellValue());
							expected.add(sheet.getRow(j).getCell(3).getStringCellValue());
							bflag=true;
						}
						else
						{	
							
							if(bflag)
						{
								UploadTestCases.createNewTestCase(sApiKey,sProjectRef,story,tcname,input,expected,sFolder);
							//	System.out.println("Story- "+ tcname);
							for(int iter=0;iter<input.size();iter++)
							{
								
							//System.out.println(input.get(iter).toString());
							//System.out.println(expected.get(iter).toString());
							}
							System.out.println("next");
							bflag=false;
						}
							input.clear();
							expected.clear();
							tcname="";
							tcname=sheet.getRow(j).getCell(0).getStringCellValue();
							input.add(sheet.getRow(j).getCell(2).getStringCellValue());
							expected.add(sheet.getRow(j).getCell(3).getStringCellValue());
							bflag=true;
							//System.out.println(sheet.getRow(j).getCell(0).getStringCellValue());
							//System.out.println(sheet.getRow(j).getCell(1).getStringCellValue());
					//		story = sheet.getRow(j).getCell(0).getStringCellValue();
						}
						
						
					}
			}
			catch(Exception e)
			{
				UploadTestCases.createNewTestCase(sApiKey,sProjectRef,story,tcname,input,expected,sFolder);
				//System.out.println("Story- "+ tcname);
				for(int iter=0;iter<input.size();iter++)
				{
					
			//	System.out.println(input.get(iter).toString());
				//System.out.println(expected.get(iter).toString());
				}
				//System.out.println("next");
				bflag=false;
			}
					
							
					
				//}
				
		//	}
			
			
			//cells.
//			while (cells.hasNext())
//			{
//				cell=(HSSFCell) cells.next();
//		
//				if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING)
//				{
//					System.out.print(cell.getStringCellValue()+" ");
//				}
//				else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
//				{
//					System.out.print(cell.getNumericCellValue()+" ");
//				}
//				else
//				{
//					//U Can Handel Boolean, Formula, Errors
//				}
//			}
		
		//	System.out.println(irow);
		
	
		//System.out.println(irow);
		}
		catch(Exception e)
		{e.printStackTrace();
			
		}
	}
	
	public static void writeXLSFile() throws IOException {
		
		String excelFileName = "C:/Test.xls";//name of excel file

		String sheetName = "Sheet1";//name of sheet

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(sheetName) ;

		//iterating r number of rows
		for (int r=0;r < 5; r++ )
		{
			HSSFRow row = sheet.createRow(r);
	
			//iterating c number of columns
			for (int c=0;c < 5; c++ )
			{
				HSSFCell cell = row.createCell(c);
				
				cell.setCellValue("Cell "+r+" "+c);
			}
		}
		
		FileOutputStream fileOut = new FileOutputStream(excelFileName);
		
		//write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		
//	String sFolderInput=args[0];  //"E:\\TestCases"
//	String sFile=args[1];  //"US396651_provider_speciality.xls"
//	String sApiKey=args[2];  //"_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA"
//	String sProjectRef=  args[3];      //"48616024248";  //args[3]; //
//	String sParentFolder=args[4];  //"Parent_folder" args[3];
//	String sChildFolder=args[5];  //"Child_FOlder" args[3];
	
	String sFolderInput="E:\\TestCases";
	String sFile="US474392_SupPrvInclusion_QA_Test_Cases.xls";
	String sApiKey="_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA";
	String sProjectRef="48616024248";
	String sParentFolder="PI4";
			String sChildFolder="Sprint4";
	String sFolder=sFOlderRef(sApiKey,"/project/"+sProjectRef,sParentFolder,sChildFolder);
	//48616024248d
		readXLSFile(sFolderInput,sFile,sApiKey,"/project/"+sProjectRef,sFolder );
		
		

	}
	
	
	public static String sFOlderRef(String sApiKey,String sProjectRef,String sParentFOlder,String sChildFolder) throws IOException
	{
		 String host = "https://rally1.rallydev.com";
		 String childFolderRef="";
	        String apiKey = sApiKey;//"_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA"; 
	        
	       
	        RallyRestApi restApi = null;
	        try {
	        	
	        	String projectRef =sProjectRef; // "/project/"+"48615449275";  
	        //	48615449275
	            restApi = new RallyRestApi(new URI(host),apiKey);
	System.out.println("Creating a test folder...");
    JsonObject newTF = new JsonObject();
    newTF.addProperty("Name", sParentFOlder);
    newTF.addProperty("Project", projectRef); 
   
     
    CreateRequest createRequest1 = new CreateRequest("testfolder", newTF);
    CreateResponse createResponse1 = restApi.create(createRequest1);  
    if (createResponse1.wasSuccessful()) {
    	
    	    System.out.println(String.format("Created %s", createResponse1.getObject().get("_ref").getAsString()));          
    	    String folderRef = Ref.getRelativeRef(createResponse1.getObject().get("_ref").getAsString());
    	    System.out.println(String.format("\nReading TestFolder %s...",folderRef));
            System.out.println("Creating a child test folder...");
            JsonObject newChildTF = new JsonObject();
            newChildTF.addProperty("Name", sChildFolder);
            newChildTF.addProperty("Project", projectRef); 
            newChildTF.addProperty("Parent", folderRef); 

             
            CreateRequest createRequest2 = new CreateRequest("testfolder", newChildTF);
            CreateResponse createResponse2 = restApi.create(createRequest2);  
            if (createResponse2.wasSuccessful()) {
            	
            	    System.out.println(String.format("Created %s", createResponse2.getObject().get("_ref").getAsString()));          
	             childFolderRef = Ref.getRelativeRef(createResponse2.getObject().get("_ref").getAsString());
	            		System.out.println(String.format("\nReading Child TestFolder %s...",childFolderRef));
            }
	
    }
    
	}
	        catch (Exception e){
                e.printStackTrace();
         }
         finally {
                restApi.close();
         }
	    return  childFolderRef;   
	
	}

	
	public static void createNewTestCase(String sApiKey,String sProjectRef,String sStory,String currentMethodName,ArrayList< String> desc,ArrayList< String> expected,String sFolder) 
		    throws URISyntaxException, IOException{
		 String host = "https://rally1.rallydev.com";

	        String apiKey = sApiKey;//"_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA"; 
	        
	       
	        RallyRestApi restApi = null;
	        try {
	        	
	        	String projectRef =sProjectRef; // "/project/"+"48615449275";  
	        //	48615449275
	            restApi = new RallyRestApi(new URI(host),apiKey);
	        	String storyFormattedID = sStory;
	        	QueryRequest storyRequest = new QueryRequest("HierarchicalRequirement");
	        	storyRequest.setFetch(new Fetch("FormattedID","Name","Changesets"));
	        	storyRequest.setQueryFilter(new QueryFilter("FormattedID", "=", storyFormattedID));
	        	QueryResponse storyQueryResponse = restApi.query(storyRequest);
	        	JsonObject storyJsonObject = storyQueryResponse.getResults().get(0).getAsJsonObject();
	        	String storyRef = storyJsonObject.get("_ref").getAsString();
	        	
	        	
	        	
	        	
	        	
	        	
//	        	 QueryRequest tests = new QueryRequest("Test Case");
//	        	 tests.setFetch(new Fetch("FormattedID","Name","Owner","Test Folder"));
//	        	// tests.setQueryFilter(new QueryFilter("TestFolder.Name", "=", "TF10641"));
//	        	// QueryFilter grandChildren = new QueryFilter("TestFolder.Parent.Name", "=", "Configurator");
//	        	
//	        	 QueryFilter children = new QueryFilter("TestFolder.Name", "=", "Opportunity");
////	        	 QueryFilter grandChildren = new QueryFilter("TestFolder.Parent.Name", "=", "TestFolderParent1");
//	        	// tests.setQueryFilter(children.and(grandChildren));
//	        	 tests.setQueryFilter(children);
//	
////	        
//	        	 QueryResponse folderQueryResponse = restApi.query(tests);
//	        	
//	        	 
//		        	JsonObject folderJsonObject = folderQueryResponse.getResults().getAsJsonObject();
//		        	String folderRef = folderJsonObject.get("_ref").getAsString();
//		        	
	        	
	        	//String storyRef = Ref.getRelativeRef(createResponse.getObject().get("_ref").getAsString());
             //   System.out.println(String.format("\nReading Story %s...", storyRef));
                System.out.println(Ref.isRef(storyRef));
                //System.out.println(Ref.isRef(folderRef));
	        	
		    //    restApi.setApplicationName("Test Case");             
		         try {
		                //Create test case
		                JsonObject newTestCase = new JsonObject();
		                newTestCase.addProperty("Name", currentMethodName);
		                newTestCase.addProperty("Description", "Created by Rally");
		                newTestCase.addProperty("Project", projectRef);
		                newTestCase.addProperty("Type", "Functional");
		                newTestCase.addProperty("Method", "Automated");
		                newTestCase.addProperty("DefectStatus", "NONE");
		                newTestCase.addProperty("WorkProduct", storyRef);
		                newTestCase.addProperty("TestFolder", sFolder);
		                //newTestCase.addProperty(property, value);
		            CreateRequest createRequest = new CreateRequest("testcase",
		                newTestCase);
		            CreateResponse createResponse = restApi.create(createRequest);
		          //  createResponse.
		                if (createResponse.wasSuccessful()){
		                System.out.println("Test case created successfully");
		                }
		                else {
		                System.out.println("The test case could not be created");
		                String[] createErrors;
		                createErrors = createResponse.getErrors();
		                System.out.println("Error occurred creating Test Case: ");
		                for (int i=0; i<createErrors.length;i++) {
		                   System.out.println(createErrors[i]);
		               }
		                }
		                
		                String testcaseRef = Ref.getRelativeRef(createResponse.getObject().get("_ref").getAsString());
		                
		                for (int iStep=0;iStep<desc.size();iStep++)
		                {
			                System.out.println(testcaseRef);
			                JsonObject stepOne = new JsonObject();
	
			                stepOne.addProperty("Input", desc.get(iStep).toString());
			                stepOne.addProperty("ExpectedResult",expected.get(iStep).toString());
			                stepOne.addProperty("TestCase", testcaseRef); //specify test case object id in place of 12345
	
			                CreateRequest createStepRequest = new CreateRequest("testcasestep", stepOne);
			                createResponse = restApi.create(createStepRequest);
			                System.out.println(createResponse.wasSuccessful());
			                
		                }

		         }catch (Exception e){
		                e.printStackTrace();
		         }
		         finally {
		                restApi.close();
		         }
	        }
	        catch(Exception e)
	        {
	        	
	}
	}
	
}