package dw;

import java.io.IOException;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.WebDriver;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.AWTException;

public class EtlJobRun {
	
	public EtlJobRun()
	{
		
	}	public static void main(String[] args) throws AWTException, InterruptedException
	{
		runJobWithUserPassJobStnTable("dsivapur","United@19","PAY_PAY_JS_M_CLM","APSRD5785","PAY_PAY_VAR_TST");
	}
	    
	public static  String runJobWithUserPassJobStnTable(String sUser,String sPass,String sJob ,String sWorkstn,String sTable) throws AWTException, InterruptedException {
		 WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/Automation/Fitnesse_Automation/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.ie.driver",conf.iedriver);
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//
//        //capabilities.setCapability("nativeEvents", true);    
//        capabilities.setCapability("unexpectedAlertBehaviour", "accept");
//        capabilities.setCapability("ignoreProtectedModeSettings", true);
//        capabilities.setCapability("disable-popup-blocking", true);
//        capabilities.setCapability("enablePersistentHover", true);
//        capabilities.setCapability("requireWindowFocus", true);
//        driver = new InternetExplorerDriver(capabilities);
		driver=new ChromeDriver();
        driver.manage().window().maximize();
        String msg="started";
       // System.setProperty("webdriver.ie.driver", properties.getProperty("ie.driver"));
		//driver=new InternetExplorerDriver(); 
		driver.get("https://apspp0511.uhc.com:16311/ibm/console/logon.jsp");
		  try {
			  	
			  driver.findElement(By.id("j_username")).sendKeys(sUser);
			  driver.findElement(By.id("j_password")).sendKeys(sPass);
			  driver.findElement(By.id("login-button")).click();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 try{
				 if (driver.findElement(By.name("action")).isDisplayed())
				 {
					 driver.findElement(By.name("submitBtn")).click();
				 }
			 	}
			 catch(NoSuchElementException e)
			 	{
				 msg="action chose failed";
			 	}
			 
			Thread.sleep(7000);
			 driver.switchTo().frame("isc_iframe");
			 
			// new Select (driver.findElement(By.id("modeling_EngineWidget"))).selectByVisibleText("MS_DEV_BMDM1 [twswdev] (Distributed)");
			 new Select(driver.findElement(By.xpath("//select[contains(@id, 'WDWCB')]"))).selectByIndex(4);
			 
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//input[contains(@id, 'PanelSubmitJobStream_2_StringJobStream')]")).sendKeys(sJob);
			
			   // driver.findElement(By.xpath("//td[2]/input")).sendKeys(sJob);
			   // msg="8";
			    //msg=driver.getPageSource();
			   
			    
			    //ns__1971061822_FormDataGp5b25c314
			   // name
			    driver.findElement(By.xpath("//input[contains(@name, 'PanelSubmitJobStream_2_StringWorkstation')]")).sendKeys(sWorkstn);
			    msg="9";
			    driver.findElement(By.xpath("//input[contains(@name, 'PanelSubmitJobStream_2_StringVariableTable')]")).sendKeys(sTable);
			    msg="10";
			    driver.findElement(By.xpath("//*[contains(@id, 'PanelSubmitJobStream_2_ButtonOK_action')]")).click();
			    msg="11";
			    Thread.sleep(4000);
			    //driver.findElement(By.xpath("//*[contains(@id, 'Button0_action')]")).click();
			    //driver.findElement(By.id("logout_nav_action")).click();
			   // t(By.id("logout_nav_action")).click();
			    msg="Job "+ "is successfully submitted";
			    driver.close();
			    driver.quit();
			 
		/*	 try{
				 if (driver.findElement(By.linkText("Design your workload")).isDisplayed())
				 {
					 driver.findElement(By.linkText("Design your workload")).click();
				 }
			 	}
			 catch(NoSuchElementException e)
			 	{
				 msg="Design your workload failed";
			 	}
			
			
			 msg="2";
				driver.switchTo().defaultContent();
				msg="3";
			    driver.findElement(By.xpath("//li[4]/span/span/span/span[2]")).click();
			    msg="4";
			  //  driver.findElement(By.name("Administration_button")).click();
			    //msg="5";
			    driver.findElement(By.xpath("//div[contains(text(),'Submit Predefined Job Streams')]")).click();
			    msg="6";                                         //     Submit Predefined Job Streams
			    //driver.findElement(By.id("dojoUnique15")).click();
			   Thread.sleep(5000);
			   driver.findElement(By.xpath("//div[contains(text(),'Submit Predefined Job Streams')]")).click();
			   Thread.sleep(5000);
			   
			   
			   Set sWindows=driver.getWindowHandles();
				int iCount=sWindows.size();
				msg=msg+iCount;
				for (Object o : sWindows) {
					msg=msg+"  "+o.toString();
				}
			 /*   //Go
			    driver.switchTo().frame("isc_iframe");
			    msg="7";
			   // new Select (driver.findElement(By.id("modeling_EngineWidget"))).selectByVisibleText("MS_DEV_BMDM1 [twswdev] (Distributed)");
			    //msg="8";
			    //driver.findElement(By.xpath("//input[@value='Go']")).click();
			    //msg="9";
			  //*[contains(@id, 'ctl00_btnAircraftMapCell')]
			    //driver.findElement(By.xpath("//input[contains(@id, 'PanelSubmitJobStream_2_StringJobStream_value_')]")).clear();
			    
			   // msg="name: " +driver.findElement(By.xpath("//form")).getAttribute("name");
			    
			   // driver.findElement(By.xpath("//input[contains(@id, 'PanelSubmitJobStream_2_StringJobStream')]")).sendKeys(sJob);
			    
			   // driver.findElement(By.xpath("//td[2]/input")).sendKeys(sJob);
			   // msg="8";
			    msg=driver.getPageSource();
			   
			    
			    //ns__1971061822_FormDataGp5b25c314
			   // name
			    driver.findElement(By.xpath("//input[contains(@name, 'PanelSubmitJobStream_2_StringWorkstation')]")).sendKeys(sWorkstn);
			    msg="9";
			    driver.findElement(By.xpath("//input[contains(@name, 'PanelSubmitJobStream_2_StringVariableTable')]")).sendKeys(sTable);
			    msg="10";
			    driver.findElement(By.xpath("//*[contains(@id, 'PanelSubmitJobStream_2_ButtonOK_action')]")).click();
			    msg="11";
			    driver.findElement(By.name("userButtonName")).click();
			    driver.findElement(By.id("logout_nav_action")).click();
			    driver.close();
			    
			  
			  /*   	//Give Description same as Job stream Name
			  	//driver.findElement(By.id("REQ.DESCRIPTION")).sendKeys(jobStreamName);
			  	driver.findElement(By.id(properties.getProperty("itg.Req.description"))).sendKeys(jobStreamName);
			  	
			  	//Select QA environment only
			  	if (envName.equalsIgnoreCase("STG") || envName.equalsIgnoreCase("STGNEW")) {
			  		//log.severe("Environment name " +envName + " is invalid. Test FAILED");
			  		return false;
			  	}else if (envName.equalsIgnoreCase("QANEW")) {
			  		new Select(driver.findElement(By.id(properties.getProperty("itg.Req.Environment")))).selectByVisibleText("TWS Stage Distributed");
			  	}else {
			  		new Select(driver.findElement(By.id(properties.getProperty("itg.Req.Environment")))).selectByVisibleText("TWS Development Distributed");
			  	}
			    Thread.sleep(1000);
			    new Select(driver.findElement(By.id(properties.getProperty("itg.Req.ActionType")))).selectByVisibleText("Pre-defined Submission");
			    new Select(driver.findElement(By.id(properties.getProperty("itg.Req.Job")))).selectByVisibleText("Job Stream");
			    
			    Thread.sleep(1000);
			    
			    //Select Job Family Field
			    //driver.findElement(By.id("P_21AUTOCOMP_IMG")).click();
			    driver.findElement(By.id(properties.getProperty("itg.Req.JobFamilyList"))).click();
			    Thread.sleep(2000);
			    driver.switchTo().frame(3);
			    //driver.findElement(By.xpath(".//*[@id = 'P.CULL_TEXT']")).sendKeys("HDE_HDE");
			    driver.findElement(By.xpath(properties.getProperty("itg.Req.ProjectKey"))).sendKeys(properties.getProperty("itg.Req.Project"));
				//driver.findElement(By.linkText("Find")).click();
				driver.findElement(By.linkText(properties.getProperty("itg.Req.Find"))).click();

				//log.info("Clicked Find button in Job Family pop up");
				Thread.sleep(4000);
				//log.info("waited after Find button");
			    driver.switchTo().frame(1);
				//driver.findElement(By.id("7.7.HDE_HDE.HDE_HDE")).click();
				driver.findElement(By.id(properties.getProperty("itg.Req.ProjectSelect"))).click();
			    driver.switchTo().defaultContent();
			    driver.switchTo().defaultContent(); 
				Thread.sleep(10000);

			    
			    //Select Action Field
			    //driver.findElement(By.id("P_24AUTOCOMP_IMG")).click();
			    driver.findElement(By.id(properties.getProperty("itg.Req.Action"))).click();
			    Thread.sleep(2000);
			    driver.switchTo().frame(3);
				//driver.findElement(By.linkText("Find")).click();
				driver.findElement(By.linkText(properties.getProperty("itg.Req.Find"))).click();
				//log.info("Clicked Find button in Action pop up");
				Thread.sleep(4000);
				//log.info("waited after Find button");
			    driver.switchTo().frame(1);
				//driver.findElement(By.id("6.6.submit.Submit")).click();
				driver.findElement(By.id(properties.getProperty("itg.Req.ActionSubmit"))).click();
				//log.info("Till Action = Submit its ok");
			    Thread.sleep(1000);
			    driver.switchTo().defaultContent();
			    driver.switchTo().defaultContent(); 

			    //Job Stream field
			    //log.info("Click on Job Stream button, Pop up opens");
			    //driver.findElement(By.xpath(".//*[@id='P_93AUTOCOMP_IMG']")).click();
			    driver.findElement(By.xpath(properties.getProperty("itg.Req.JobStreamList"))).click();
			    Thread.sleep(10000);
			    String currentUrl = driver.getCurrentUrl();
			    //log.info("Current Url after clicking the dia//log - " + currentUrl);
			    driver.switchTo().frame(3);
			    currentUrl = driver.getCurrentUrl();
			    //log.info("Current Url after clicking the dia//log - " + currentUrl);
			    //driver.findElement(By.xpath(".//*[@id = 'P.CULL_TEXT']")).sendKeys(jobStreamName);
			    driver.findElement(By.xpath(properties.getProperty("itg.Req.JobStreamField"))).click();
			    Thread.sleep(4000);
			    driver.findElement(By.xpath(properties.getProperty("itg.Req.JobStreamField"))).sendKeys(jobStreamName);
				driver.findElement(By.linkText("Find")).click();
				//log.info("Clicked Find button");
				Thread.sleep(50000);
				//log.info("waited after Find button");
			    driver.switchTo().frame(1);
			    currentUrl = driver.getCurrentUrl();
			    //log.info("Current Url after clicking the dia//log - " + currentUrl);
				java.util.List<WebElement> links = driver.findElements(By.tagName("tr"));
				//This is a workaround since the dynamic table element was not recognized
				if(links.size() == 3){
					links.get(2).click();
					//log.info("After Job stream is selected");
				}else {
					//log.severe("Got more than one ETL jobs in the list - Error out");
					return false;
				}
			    Thread.sleep(1000);
			    driver.switchTo().defaultContent();  
			    driver.switchTo().frame(3);
			    //driver.findElement(By.linkText("OK")).click();
			    driver.findElement(By.linkText(properties.getProperty("itg.Req.Ok"))).click();
			    driver.switchTo().defaultContent();
			    Thread.sleep(3000);

			    // Switch back to the Create New request form
			    //driver.findElement(By.linkText("Submit")).click();
			    driver.findElement(By.linkText(properties.getProperty("itg.Req.Submit"))).click();
			    //log.info("Clicked Submit button sucessfully back in the Create Request page");
				return true;*/
		  }catch (Exception e){
			 	//log.severe("Could not complete Creating ITG request");
			    //e.printStackTrace();
			  msg=msg+e.getMessage();
		  }
		return msg;
	 }

	 
}
