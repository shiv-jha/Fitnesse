package com.optum.hde.fitnesse.fixtures;


import com.optum.rqns.services.demography.AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client;
import com.optum.rqns.services.eligiblity.AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client;
import com.optum.rqns.services.gap.GapStatusInfoService_GapStatusInfoServiceImplPort_Client;
import com.optum.rqns.services.hichistory.HicHistoryService_HicHistoryServiceImplPort_Client;
import com.optum.rqns.services.medicaideligiblity.MedicaidMemberEligibilityService_MedicaidMemberEligibilityServiceImplPort_Client;
import com.optum.rqns.services.supplemental.SupplementalInfoService_SupplementalInfoServiceImplPort_Client;
import com.optum.rqns.services.tinservice.ProviderTinService_ProviderTinServiceImplPort_Client;

//import com.optum.rqns.services.GapStatusInfoService_GapStatusInfoServiceImplPort_Client;
//import com.optum.rqns.services.supplemental.*;
public class WebServicesClientStage {
	public String  callRqnsWebServices(String serviceName) throws Exception
	{
		String sReturn="";
		System.setProperty("javax.net.ssl.keyStore","E:/Automation/Soap/Stage/rqns_stg.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","changeit");
        System.setProperty("javax.net.ssl.trustStore","E:/Automation/Soap/Stage/cpc_client_truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");
		switch (serviceName) {
			
		case "getHicHistory":
			
			HicHistoryService_HicHistoryServiceImplPort_Client obj=new HicHistoryService_HicHistoryServiceImplPort_Client();
			sReturn=obj.hicServiceCallStage();
			break;
			
		
		
		
		case "getSupplemental":
			SupplementalInfoService_SupplementalInfoServiceImplPort_Client obj5=new SupplementalInfoService_SupplementalInfoServiceImplPort_Client();
			sReturn=obj5.supplementalService();
			break;
			
		case "getGapStatus":
			GapStatusInfoService_GapStatusInfoServiceImplPort_Client obj6=new GapStatusInfoService_GapStatusInfoServiceImplPort_Client();
			sReturn=obj6.gapService();
			break;
		case "getProviderTinInfo":
			ProviderTinService_ProviderTinServiceImplPort_Client obj1=new ProviderTinService_ProviderTinServiceImplPort_Client();
			sReturn=obj1.tinServiceCall();
			break;
			
		case "getEligibleAcaMembers":
			AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client obj2=new AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client();
			sReturn=obj2.acaMeberEligibility();
			break;
			
		case "getAcaMemberDemographicInfo":
			AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client obj3=new AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client();
			sReturn=obj3.acaMeberDemography();
			break;
		
		case "getEligibleMcaidMembers":
			MedicaidMemberEligibilityService_MedicaidMemberEligibilityServiceImplPort_Client obj4=new MedicaidMemberEligibilityService_MedicaidMemberEligibilityServiceImplPort_Client();
			sReturn=obj4.medicaidMeberEligiblity();
			break;
			
		default:
			sReturn="No Matching service found";
		}
        /*
		String[] args={"hello"};
		//GapStatusInfoService_GapStatusInfoServiceImplPort_Client.main(args);
		switch (serviceName) {
		case "addSupplementalInfo":
			//SupplementalInfoService_SupplementalInfoServiceImplPort_Client.main(args);
			sReturn="Inserted data in A_suppl_scr_data table with Member ID "+ sReturn;
			break;
		case "addGapStatusInfo":
			GapStatusInfoService_GapStatusInfoServiceImplPort_Client.main(args);
			sReturn="Inserted data in A_MBR_RVW_RSLT table with Gap ID "+ sReturn;
			break;

		default:
			sReturn="Wrong Service name use name like:-addSupplementalInfo,addGapStatusInfo";
			break;
		}*/
		return sReturn;
		
	}
	
	
}
