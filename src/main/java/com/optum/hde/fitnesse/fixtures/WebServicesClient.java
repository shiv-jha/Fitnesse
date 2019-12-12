package com.optum.hde.fitnesse.fixtures;

import com.optum.rqns.services.demographyTest.AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client;
import com.optum.rqns.services.eligiblityTest.AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client;
import com.optum.rqns.services.gapTest.GapStatusInfoService_GapStatusInfoServiceImplPort_Client;
import com.optum.rqns.services.hicTest.HicHistoryService_HicHistoryServiceImplPort_Client;
import com.optum.rqns.services.medicaideligiblityTest.MedicaidMemberEligibilityService_MedicaidMemberEligibilityServiceImplPort_Client;
import com.optum.rqns.services.medicareDemographyTest.MemberDemographicService_MemberDemographicServiceImplPort_Client;
import com.optum.rqns.services.medicareEigiblityTest.MemberEligibilityService_MemberEligibilityServiceImplPort_Client;
import com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityServicev2_MemberEligibilityServiceImplv2Port_Client;
import com.optum.rqns.services.rxClaimsLookupTest.RXClaimsLookUpService_RXClaimsLookUpServiceImplPort_Client;
import com.optum.rqns.services.supplementalTest.SupplementalInfoService_SupplementalInfoServiceImplPort_Client;
import com.optum.rqns.services.tinTest.ProviderTinService_ProviderTinServiceImplPort_Client;

//import com.optum.rqns.services.GapStatusInfoService_GapStatusInfoServiceImplPort_Client;
//import com.optum.rqns.services.supplemental.*;
public class WebServicesClient {
	public String  callRqnsWebServices(String serviceName) throws Exception
	{
		String sReturn="";
		System.setProperty("javax.net.ssl.keyStore","E:/Automation/Soap/rqns_tst.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","changeit");
        System.setProperty("javax.net.ssl.trustStore","E:/Automation/Soap/cpc_client_truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");
		switch (serviceName) {
			
		case "getHicHistory":
			
			HicHistoryService_HicHistoryServiceImplPort_Client obj=new HicHistoryService_HicHistoryServiceImplPort_Client();
			sReturn=obj.hicServiceCall();
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
		
		
		case "getSupplemental":
			SupplementalInfoService_SupplementalInfoServiceImplPort_Client obj5=new SupplementalInfoService_SupplementalInfoServiceImplPort_Client();
			sReturn=obj5.supplementalService();
			break;
			
		case "getGapStatus":
			GapStatusInfoService_GapStatusInfoServiceImplPort_Client obj6=new GapStatusInfoService_GapStatusInfoServiceImplPort_Client();
			sReturn=obj6.gapService();
			break;
		
		case "getMedicareEligiblity":
			MemberEligibilityService_MemberEligibilityServiceImplPort_Client obj7=new MemberEligibilityService_MemberEligibilityServiceImplPort_Client();
			sReturn=obj7.medicareMeberEligiblity();
			break;
			
		case "getMedicareDemography":
			MemberDemographicService_MemberDemographicServiceImplPort_Client obj8=new MemberDemographicService_MemberDemographicServiceImplPort_Client();
			sReturn=obj8.medicareDemography();
			break;
			
		case "getMedicareEligiblity2":
			MemberEligibilityServicev2_MemberEligibilityServiceImplv2Port_Client obj9=new MemberEligibilityServicev2_MemberEligibilityServiceImplv2Port_Client();
			sReturn=obj9.medicaidMeberEligiblity2();
			break;
			
		case "rxClaimsLookup":
			RXClaimsLookUpService_RXClaimsLookUpServiceImplPort_Client obj10=new RXClaimsLookUpService_RXClaimsLookUpServiceImplPort_Client();
			sReturn=obj10.rxClaimsLookup();
			break;
		
		case "npiLookUp":
			//RXClaimsLookUpService_RXClaimsLookUpServiceImplPort_Client obj11=new RXClaimsLookUpService_RXClaimsLookUpServiceImplPort_Client();
			//sReturn=obj10.rxClaimsLookup();
			sReturn="This service is not available in test environment- Issue with WSDL";
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
