package com.optum.hde.fitnesse.fixtures;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.CreateRequest;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.CreateResponse;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;

public class RallyTestCaseStatusUpdates

{
	public RallyTestCaseStatusUpdates()
	{
		
	}
	
	private static String testCaseRef, testSetOID, testFolderOID, userStoryRef;  
	//public static void main(String [] args) throws URISyntaxException, IOException, ParseException
	//{/*
		//  String tc_name = args[0];
		//  String status = args[1];
		//  String test_set = args[2];
		//  String comment = args[3];
//*/
		//sendTestResultToRally("CS_FieldLevelErrorValidations_PharmacyNewFCDFile61","Pass","Automation_PlaceHolder","This is executed from Fitnesse");
		//sendTestResultToRally("US26715-Persist the full 837I","Pass","Inbound837_Test","This is for demo purpose");
		
		// sendTestResultToRally(tc_name,status,test_set,comment);
	//}
	
static Boolean UpdateRally = true;  


public  void sendTestResultToRally(String currentMethodName, String TestResult,  
String TestSet, String notes) throws URISyntaxException, IOException, ParseException {  
// currentMethodName = testCaseName  
String objectId = getTestCaseObjectId(currentMethodName);  
testSetOID = getTestSetOID(TestSet); 
System.out.println("test case id is " + objectId);
System.out.println("test set id is " + testSetOID);
/* 
* if testcase OID is succesfully returned then 'UpdateRally = true' if 
227.   * 'UpdateRally = true' then create new test result if testcase OID is 
228.   * not succesfully created then 'UpdateRally = false' and in that case 
229.   * create new testcase in rally 
230.   */  
//if (UpdateRally) {  
createNewTestResult(objectId, TestResult, TestSet, notes);  
//}
}
 // converts date to the specific format that rally accepts  
private static String getISO8601StringForDate(Date date) {  
 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);  
  dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));  
  return dateFormat.format(date);  
 }  
 // returns the testcase's object ID from rally  
 public static String getTestCaseObjectId(String currentMethodName) throws URISyntaxException, IOException {  
  //RallyRestApi restApi = new RallyRestApi(new URI("https://rally1.rallydev.com"),  
   // "_9kkVuUbaTbeJHnbctSrmEm0Ifk3kLsi6fsjnhHjac"); 
  RallyRestApi restApi = new RallyRestApi(new URI("https://rally1.rallydev.com"),  
		  "_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA"); 

  try {  
  // fetch testcase info from db by 'currentMethodName'  
  QueryRequest testCaseRequest = new QueryRequest("TestCase");  
   testCaseRequest.setFetch(new Fetch("FormattedID", "Name"));  
   testCaseRequest.setQueryFilter(new QueryFilter("Name", "=", currentMethodName));  
   // "UpdateTestResult"  
   // testCaseRequest.setQueryFilter(new QueryFilter("FormattedID",  
   // "=", "TC55042"));  
   QueryResponse testCaseQueryResponse = restApi.query(testCaseRequest);  
   /* 
    * if testcase found in rally set the testcase's OID to the variable 
   * 'testCaseRef' if testcase not found then set 'updateRally=false' 
  */  
   if (testCaseQueryResponse.getTotalResultCount() > 0) {  
   JsonObject testCaseJsonObject = testCaseQueryResponse.getResults().get(0).getAsJsonObject();  
    System.out.println("Test Case Object: " + testCaseJsonObject);  
  String testCaseUrl = testCaseQueryResponse.getResults().get(0).getAsJsonObject().get("_ref")  
      .getAsString();  
   testCaseRef = testCaseUrl.substring(testCaseUrl.lastIndexOf("/") + 1, testCaseUrl.length());  
   System.out.println("Test Case ObjectId : " + testCaseRef);  
   UpdateRally = true;  
   } else {  
  UpdateRally = false;  
    System.out  
     .println("Test Case did not find in Rally, so skipping Rally update for " + currentMethodName);  
   }  
  } catch (Exception e) {  
  e.printStackTrace();  
  } finally {  
  restApi.close();  
 }  
  return testCaseRef;  
}  
 // creates new test result object in rally  
public static void createNewTestResult(String objectId, String rallyTestResult, String TestSet, String notes)  
  throws URISyntaxException, IOException {  
 // ITestResult testResult;  
 //Configuration conf = new Configuration();  
 RallyRestApi restApi = new RallyRestApi(new URI("https://rally1.rallydev.com"),  
		 "_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA");  
 restApi.setApplicationName("Test Result");  
 Date date = new Date();  
 String now = getISO8601StringForDate(date);  
  System.out.println("Timestamp: " + now);  
 try {  
 // Create result  
 System.out.println("Creating new test result for " + objectId);  
 JsonObject newTestCaseResult = new JsonObject();  
 //newTestCaseResult.addProperty("Build",  
  //  InitActions.War_Qualifier + "-" + InitActions.War_Version + "-" + conf.getProperty("build.number")); 
 
 newTestCaseResult.addProperty("Build",  "1001"); 
  newTestCaseResult.addProperty("Verdict", rallyTestResult);  
  newTestCaseResult.addProperty("Date", now);  
   newTestCaseResult.addProperty("Notes", notes);  
   //newTestCaseResult.addProperty("TestSet", testSetOID);  
   newTestCaseResult.addProperty("TestCase", objectId); 
   newTestCaseResult.addProperty("Attachment", "E:/Automation/abc.txt");
   CreateRequest createRequest = new CreateRequest("testcaseresult", newTestCaseResult);  
   System.out.println("Create Test Result Request: " + createRequest.getBody().toString());  
  CreateResponse createResponse = restApi.create(createRequest);  
  // System.out.println("Create Test Result Response: " +  
  // createResponse.getObject());  
   /* 
    * check if creation of test result object is a success/failure if 
   * fails, return the error 
   */  
  if (createResponse.wasSuccessful()) {  
    System.out.println("Test result created successfully in Rally");  
  } else {  
   System.out.println("The test result could not be created in Rally.");  
    String[] createErrors;  
  createErrors = createResponse.getErrors();  
    System.out.println("Error occurred creating Test Result: ");  
   for (int i = 0; i < createErrors.length; i++) {  
     System.out.println(createErrors[i]);  
   }  
  }  
 } catch (Exception e) {  
  e.printStackTrace();  
} finally {  
   restApi.close();  
 }  
 
}
 
 
 
 
 
 
 
 
 public static String getTestSetOID(String TestsetName) throws URISyntaxException, IOException {  
 RallyRestApi restApi = new RallyRestApi(new URI("https://rally1.rallydev.com"),  
		 "_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA");  
 String testSetOID = "";  
try {  
  // fetch testset from db by 'TestsetName'  
  QueryRequest TestSetQuery = new QueryRequest("TestSet");  
 TestSetQuery.setFetch(new Fetch("FormattedID", "Name"));  
  TestSetQuery.setQueryFilter(new QueryFilter("Name", "=", TestsetName));  
  QueryResponse TestSetResultResponse = restApi.query(TestSetQuery);  
  /* 
  * if query returns expected testset then set the variable 
  * 'testSetOID' if false, returns empty string 
   */  
  if (TestSetResultResponse.wasSuccessful()) {  
   if (TestSetResultResponse.getResults().size() > 0) {  
   JsonObject testSetJsonObject = TestSetResultResponse.getResults().get(0).getAsJsonObject();  
  System.out.println("Test Set Object: " + testSetJsonObject);  
   String testSetUrl = TestSetResultResponse.getResults().get(0).getAsJsonObject().get("_ref")  
     .getAsString();  
    testSetOID = testSetUrl.substring(testSetUrl.lastIndexOf("/") + 1, testSetUrl.length());  
   System.out.println("testSetOID: " + testSetOID);  
  }  
  } else {  
  testSetOID = "";  
  }  
  } catch (Exception e) {  
  e.printStackTrace();  
 } finally {  
   restApi.close();  
  }  
  return testSetOID;  
 }  
 // Find Test Folder OOID  
 public static String getTestFolderOID(String TestFolderName) throws URISyntaxException, IOException {  
  RallyRestApi restApi = new RallyRestApi(new URI("https://rally1.rallydev.com"),  
   "_gj7Z3knETui37ZgsAuIU8CJ1p9FHZ0J6jOufafprooA");  
 String testSetOID = "";  
try {  
   // fetch testset from db by 'TestsetName'  
  QueryRequest TestFolderQuery = new QueryRequest("TestFolder");  
   TestFolderQuery.setFetch(new Fetch("FormattedID", "Name"));  
   TestFolderQuery.setQueryFilter(new QueryFilter("Name", "=", TestFolderName));  
  QueryResponse TestFolderResultResponse = restApi.query(TestFolderQuery);  
  /* 
    * if query returns expected TestFolder then set the variable 
   * 'testSetOID' if failse, returns empty string 
    */  
   if (TestFolderResultResponse.wasSuccessful()) {  
    JsonObject testFolderJsonObject = TestFolderResultResponse.getResults().get(0).getAsJsonObject();  
   System.out.println("Test Set Object: " + testFolderJsonObject);  
   String testFolderUrl = TestFolderResultResponse.getResults().get(0).getAsJsonObject().get("_ref")  
     .getAsString();  
   testFolderOID = testFolderUrl.substring(testFolderUrl.lastIndexOf("/") + 1, testFolderUrl.length());  
   System.out.println("testFolderOID: " + testFolderOID);  
  } else {  
   testFolderOID = "";  
  }  
 } catch (Exception e) {  
  e.printStackTrace();  
  } finally {  
   restApi.close();  
  }  
  return testFolderOID;  
 }  

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
