
package com.optum.rqns.services.eligiblity;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.optum.rqns.services.eligiblity.AcaMemberEligibilityDetails;
import com.optum.rqns.services.eligiblity.ServiceException_Exception;
import com.optum.rqns.services.utils.DataBaseConnect;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-25T16:40:21.565+05:30
 * Generated source version: 2.7.18
 * 
 */
public final class AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.rqns.optum.com/", "AcaMemberEligibilityService");

    public AcaMemberEligibilityService_AcaMemberEligibilityServiceImplPort_Client() {
    }

    public  String acaMeberEligibility() throws java.lang.Exception {
    	
    	
    	String sReturn="";
    	String sReturnSecond="";
    	/*System.setProperty("javax.net.ssl.keyStore","C:/CRQS/Webservices/Soap/rqns_tst.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","changeit");
        System.setProperty("javax.net.ssl.trustStore","C:/CRQS/Webservices/Soap/cpc_client_truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");*/
        String _getEligibleAcaMembersByMbrIDAndClient_memberID = null;
        String _getEligibleAcaMembersByMbrIDAndClient_modifierID = null;
        String _getEligibleAcaMembersByMbrIDAndClient_clientName = null;
        String _getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID = null;
        String _getEligibleAcaMembersByMbrIDAndClient_clientID = null;
       String _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt = null;
       String _getEligibleAcaMembersByMbrIDAndClient_eligEndDt = null;
       String _getEligibleAcaMembersByMbrIDAndClient_subscriberID=null;
       String _getEligibleAcaMembersByMbrIDAndClient_planName=null;
        URL wsdlURL = AcaMemberEligibilityService_Service.WSDL_LOCATION;
        
      
        AcaMemberEligibilityService_Service ss = new AcaMemberEligibilityService_Service(wsdlURL, SERVICE_NAME);
        AcaMemberEligibilityService port = ss.getAcaMemberEligibilityServiceImplPort();  
        String sRequestSqlFinal="";
        {
        	 int iCount=1;
       /* String sRequestSql="select count(*) from (select m_adj.mbr_id,m_adj.mbr_mod_id,m_adj.mbr_sub_pln_adj_strt_dt,m_adj.mbr_sub_pln_adj_end_dt,m_glb.mbr_glb_id,vw_clnt.sub_cli_org_nm,vw_clnt.clnt_guid from";
        sRequestSql=sRequestSql+" MBR_ENRL_ADJ m_adj ,CS_MBR_GLB_ID m_glb,vw_cs_clnt_guid_mod vw_clnt where m_adj.mbr_id=m_glb.mbr_id and m_adj.mbr_mod_id=m_glb.mbr_mod_id";
        sRequestSql=sRequestSql+" and vw_clnt.sub_cli_sk=m_adj.sub_cli_sk and m_adj.sub_cli_sk=m_glb.sub_cli_sk  and m_glb.mbr_glb_id is  not null order by m_adj.mbr_sub_pln_adj_strt_dt desc ) where rownum=1";
        ResultSet rs=DataBaseConnect.getRsList("STAGE", sRequestSql);
       
         while (rs.next()){
         	iCount = rs.getInt(1);
         }
         */
         if (iCount==1)
         {
        	  sRequestSqlFinal="select m_adj.mbr_id,m_adj.mbr_mod_id,m_adj.mbr_sub_pln_adj_strt_dt,m_adj.mbr_sub_pln_adj_end_dt,m_glb.mbr_glb_id,vw_clnt.sub_cli_org_nm,vw_clnt.clnt_guid from";
        	  sRequestSqlFinal=sRequestSqlFinal+" MBR_ENRL_ADJ m_adj ,CS_MBR_GLB_ID m_glb,vw_cs_clnt_guid_mod vw_clnt where m_adj.mbr_id=m_glb.mbr_id and m_adj.mbr_mod_id=m_glb.mbr_mod_id";
        	  sRequestSqlFinal=sRequestSqlFinal+" and vw_clnt.sub_cli_sk=m_adj.sub_cli_sk and m_adj.sub_cli_sk=m_glb.sub_cli_sk  and m_glb.mbr_glb_id is  not null  ";
         //order by m_adj.mbr_sub_pln_adj_strt_dt desc
         	ResultSet rs1=DataBaseConnect.getRsList("STAGE", sRequestSqlFinal);
         	 while (rs1.next()){
         		 System.out.println(rs1.getString(1));
         		 System.out.println(rs1.getString(2));
         		 System.out.println(rs1.getString(3));
         		 System.out.println(rs1.getString(4));
         		 System.out.println(rs1.getString(5));
         		 System.out.println(rs1.getString(6));
         		 _getEligibleAcaMembersByMbrIDAndClient_memberID=rs1.getString(1);
         		 _getEligibleAcaMembersByMbrIDAndClient_modifierID=rs1.getString(2);
         		 _getEligibleAcaMembersByMbrIDAndClient_clientName=rs1.getString(6);
         		 _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt=rs1.getString(3);
         		 _getEligibleAcaMembersByMbrIDAndClient_eligEndDt=rs1.getString(4);
         		 _getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID=rs1.getString(5);
         		 _getEligibleAcaMembersByMbrIDAndClient_clientID=rs1.getString(6);
         		 break;
         	 }

         }
        System.out.println("Invoking getEligibleAcaMembersByMbrIDAndClient...");
        //java.lang.String _getEligibleAcaMembersByMbrIDAndClient_memberID = "_getEligibleAcaMembersByMbrIDAndClient_memberID442175183";
        //java.lang.String _getEligibleAcaMembersByMbrIDAndClient_modifierID = "_getEligibleAcaMembersByMbrIDAndClient_modifierID-2053702578";
        //java.lang.String _getEligibleAcaMembersByMbrIDAndClient_clientName = "_getEligibleAcaMembersByMbrIDAndClient_clientName-434732536";
        //java.lang.String _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt = "_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt-1946307634";
        //java.lang.String _getEligibleAcaMembersByMbrIDAndClient_eligEndDt = "_getEligibleAcaMembersByMbrIDAndClient_eligEndDt-217483578";
        com.optum.rqns.services.eligiblity.ServiceMetaData _getEligibleAcaMembersByMbrIDAndClient_metaData = new com.optum.rqns.services.eligiblity.ServiceMetaData();
        _getEligibleAcaMembersByMbrIDAndClient_metaData.setAppId("5317c8af4dd6bec7b46c2083018b8ae6");
     
        try {
            com.optum.rqns.services.eligiblity.AcaMemberEligibilityInfo _getEligibleAcaMembersByMbrIDAndClient__return = port.getEligibleAcaMembersByMbrIDAndClient(_getEligibleAcaMembersByMbrIDAndClient_memberID, _getEligibleAcaMembersByMbrIDAndClient_modifierID, _getEligibleAcaMembersByMbrIDAndClient_clientName, _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt, _getEligibleAcaMembersByMbrIDAndClient_eligEndDt, _getEligibleAcaMembersByMbrIDAndClient_metaData);
            System.out.println( "From Service:");
       	 com.optum.rqns.services.eligiblity.AcaMemberEligibilityDetails oRecord = _getEligibleAcaMembersByMbrIDAndClient__return.getAcaMemberEligibilityDetails().get(0);
       	 
           System.out.println(oRecord.memberID);
           System.out.println(oRecord.modifierID);
           System.out.println(oRecord.enrlBegDt);
           System.out.println(oRecord.enrlEndDt);
           System.out.println(oRecord.globalMemberID);
           System.out.println(oRecord.clientGuid);
           System.out.println(oRecord.subscriberID);
           System.out.println(oRecord.planNumber);
           if (_getEligibleAcaMembersByMbrIDAndClient_memberID.equals(oRecord.memberID) &&
           		_getEligibleAcaMembersByMbrIDAndClient_modifierID.equals(oRecord.modifierID) &&
           		_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt.equals(oRecord.enrlBegDt) &&
           		_getEligibleAcaMembersByMbrIDAndClient_eligEndDt.equals(oRecord.enrlEndDt) &&
           		_getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID.equals(oRecord.globalMemberID) &&
           		_getEligibleAcaMembersByMbrIDAndClient_clientID.equals(oRecord.clientGuid) &&
           		_getEligibleAcaMembersByMbrIDAndClient_subscriberID.equals(oRecord.subscriberID) &&
           		_getEligibleAcaMembersByMbrIDAndClient_planName.equals(oRecord.planNumber))
           {
           
           	 sReturn="getEligibleAcaMembersByMbrIDAndClient  --------Passed:-------";
           	
           	 sReturn=sReturn+" ************************Request******************************************";
           	sReturn=sReturn+ " Member ID:- " +_getEligibleAcaMembersByMbrIDAndClient_memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +_getEligibleAcaMembersByMbrIDAndClient_modifierID;
           	sReturn=sReturn+ " Client Name:- " +_getEligibleAcaMembersByMbrIDAndClient_clientName;
           	sReturn=sReturn+ " Start Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt;
           	sReturn=sReturn+ " End Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligEndDt;
           	
           	sReturn=sReturn+"************************Response******************************************";
           	sReturn=sReturn+ " Member ID:- " +oRecord.memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +oRecord.modifierID;
           	sReturn=sReturn+ " Start Date:- " +oRecord.enrlBegDt;
           	sReturn=sReturn+ " End Date:- " +oRecord.enrlEndDt;
           	
           	sReturn=sReturn+ " Global Member ID:- " +oRecord.globalMemberID;
           	sReturn=sReturn+ " client GUID- " +oRecord.clientGuid;
           	sReturn=sReturn+ " Subscriber ID:- " +oRecord.subscriberID;
           	sReturn=sReturn+ " Plan Number:- " +oRecord.planNumber;
           	
           	
           }
           else
           {
           	sReturn="getEligibleAcaMembersByMbrIDAndClient  --------Failed:-------";
           	
           	sReturn=sReturn+"************************Request******************************************";
           	sReturn=sReturn+ " Member ID:- " +_getEligibleAcaMembersByMbrIDAndClient_memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +_getEligibleAcaMembersByMbrIDAndClient_modifierID;
           	sReturn=sReturn+ " Client Name:- " +_getEligibleAcaMembersByMbrIDAndClient_clientName;
           	sReturn=sReturn+ " Start Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt;
           	sReturn=sReturn+ " End Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligEndDt;
           	
           	sReturn=sReturn+"************************Response******************************************";
           	sReturn=sReturn+ " Member ID:- " +oRecord.memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +oRecord.modifierID;
           	sReturn=sReturn+ " Start Date:- " +oRecord.enrlBegDt;
           	sReturn=sReturn+ " End Date:- " +oRecord.enrlEndDt;
           	
           	sReturn=sReturn+ " Global Member ID:- " +oRecord.globalMemberID;
           	sReturn=sReturn+ " client GUID- " +oRecord.clientGuid;
           	sReturn=sReturn+ " Subscriber ID:- " +oRecord.subscriberID;
           	sReturn=sReturn+ " Plan Number:- " +oRecord.planNumber;
           }

       } catch (ServiceException_Exception e) { 
           System.out.println("Expected exception: ServiceException has occurred.");
           System.out.println(e.toString());
       }
       
           }
       {
       System.out.println("Invoking getEligibleAcaMembersByGlbMbrIDAndClient...");
       //java.lang.String _getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID = "_getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID76148923";
       //java.lang.String _getEligibleAcaMembersByGlbMbrIDAndClient_clientName = "_getEligibleAcaMembersByGlbMbrIDAndClient_clientName1714271207";
       //java.lang.String _getEligibleAcaMembersByGlbMbrIDAndClient_eligStrtDt = "_getEligibleAcaMembersByGlbMbrIDAndClient_eligStrtDt2017513482";
       //java.lang.String _getEligibleAcaMembersByGlbMbrIDAndClient_eligEndDt = "_getEligibleAcaMembersByGlbMbrIDAndClient_eligEndDt-1575160102";
       com.optum.rqns.services.eligiblity.ServiceMetaData _getEligibleAcaMembersByGlbMbrIDAndClient_metaData = new com.optum.rqns.services.eligiblity.ServiceMetaData();
       _getEligibleAcaMembersByGlbMbrIDAndClient_metaData.setAppId("5317c8af4dd6bec7b46c2083018b8ae6");
       try {
           com.optum.rqns.services.eligiblity.AcaMemberEligibilityInfo _getEligibleAcaMembersByGlbMbrIDAndClient__return = port.getEligibleAcaMembersByGlbMbrIDAndClient(_getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID, _getEligibleAcaMembersByMbrIDAndClient_clientName, _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt, _getEligibleAcaMembersByMbrIDAndClient_eligEndDt, _getEligibleAcaMembersByGlbMbrIDAndClient_metaData);
           System.out.println( "From Service:");
      	 com.optum.rqns.services.eligiblity.AcaMemberEligibilityDetails oRecord = _getEligibleAcaMembersByGlbMbrIDAndClient__return.getAcaMemberEligibilityDetails().get(0);
      	 
          System.out.println(oRecord.memberID);
          System.out.println(oRecord.modifierID);
          System.out.println(oRecord.enrlBegDt);
          System.out.println(oRecord.enrlEndDt);
          System.out.println(oRecord.globalMemberID);
          System.out.println(oRecord.clientGuid);
          System.out.println(oRecord.subscriberID);
          System.out.println(oRecord.planNumber);
          if (_getEligibleAcaMembersByMbrIDAndClient_memberID.equals(oRecord.memberID) &&
          		_getEligibleAcaMembersByMbrIDAndClient_modifierID.equals(oRecord.modifierID) &&
          		_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt.equals(oRecord.enrlBegDt) &&
          		_getEligibleAcaMembersByMbrIDAndClient_eligEndDt.equals(oRecord.enrlEndDt) &&
          		_getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID.equals(oRecord.globalMemberID) &&
          		_getEligibleAcaMembersByMbrIDAndClient_clientID.equals(oRecord.clientGuid) &&
          		_getEligibleAcaMembersByMbrIDAndClient_subscriberID.equals(oRecord.subscriberID) &&
          		_getEligibleAcaMembersByMbrIDAndClient_planName.equals(oRecord.planNumber))
          {
          
       	   sReturnSecond="getEligibleAcaMembersByGlbMbrIDAndClient  --------Passed:-------";
          	
       	  sReturnSecond=sReturnSecond+"************************Request******************************************";
          
       	  sReturnSecond=sReturnSecond+ " Global Member  ID:- " +_getEligibleAcaMembersByGlbMbrIDAndClient_globalMemberID;
       	  sReturnSecond=sReturnSecond+ " Client Name:- " +_getEligibleAcaMembersByMbrIDAndClient_clientName;
       	  sReturnSecond=sReturnSecond+ " Start Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt;
       	  sReturnSecond=sReturnSecond+ " End Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligEndDt;
          	
       	  sReturnSecond=sReturnSecond+" ************************Response******************************************";
       	  sReturnSecond=sReturnSecond+ " Member ID:- " +oRecord.memberID;
       	  sReturnSecond=sReturnSecond+ " Member Mod ID:- " +oRecord.modifierID;
       	  sReturnSecond=sReturnSecond+ " Start Date:- " +oRecord.enrlBegDt;
       	  sReturnSecond=sReturnSecond+" End Date:- " +oRecord.enrlEndDt;
          	
       	  sReturnSecond=sReturnSecond+ " Global Member ID:- " +oRecord.globalMemberID;
       	  sReturnSecond=sReturnSecond+ " client GUID- " +oRecord.clientGuid;
       	  sReturnSecond=sReturnSecond+ " Subscriber ID:- " +oRecord.subscriberID;
       	  sReturnSecond=sReturnSecond+ " Plan Number:- " +oRecord.planNumber;
          	
          	
          }
          else
          {
       	   sReturnSecond="getEligibleAcaMembersByGlbMbrIDAndClient  --------Failed:-------";
          	
       	   sReturnSecond=sReturnSecond+"************************Request******************************************";
       	   sReturnSecond=sReturnSecond+ " Member ID:- " +_getEligibleAcaMembersByMbrIDAndClient_memberID;
       	   sReturnSecond=sReturnSecond+ " Member Mod ID:- " +_getEligibleAcaMembersByMbrIDAndClient_modifierID;
       	   sReturnSecond=sReturnSecond+" Client Name:- " +_getEligibleAcaMembersByMbrIDAndClient_clientName;
       	   sReturnSecond=sReturnSecond+ " Start Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligStrtDt;
       	   sReturnSecond=sReturnSecond+ " End Date:- " +_getEligibleAcaMembersByMbrIDAndClient_eligEndDt;
          	
       	   sReturnSecond=sReturnSecond+" ************************Response******************************************";
       	   sReturnSecond=sReturnSecond+ " Member ID:- " +oRecord.memberID;
       	   sReturnSecond=sReturnSecond+" Member Mod ID:- " +oRecord.modifierID;
       	   sReturnSecond=sReturnSecond+ " Start Date:- " +oRecord.enrlBegDt;
       	   sReturnSecond=sReturnSecond+ " End Date:- " +oRecord.enrlEndDt;
          	
       	   sReturnSecond=sReturnSecond+ " Global Member ID:- " +oRecord.globalMemberID;
       	   sReturnSecond=sReturnSecond+ " client GUID- " +oRecord.clientGuid;
       	   sReturnSecond=sReturnSecond+ " Subscriber ID:- " +oRecord.subscriberID;
       	   sReturnSecond=sReturnSecond+ " Plan Number:- " +oRecord.planNumber;
          }
       } catch (ServiceException_Exception e) { 
           System.out.println("Expected exception: ServiceException has occurred.");
           System.out.println(e.toString());
       }
           }

     System.out.println(sReturn+ sReturnSecond);
     return(sReturn+ sReturnSecond);
   }

}
