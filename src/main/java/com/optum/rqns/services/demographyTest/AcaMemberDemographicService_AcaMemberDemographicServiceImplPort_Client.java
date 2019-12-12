
package com.optum.rqns.services.demographyTest;

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

import com.optum.rqns.services.utils.DataBaseConnect;



/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-27T18:22:18.186+05:30
 * Generated source version: 2.7.18
 * 
 */
public final class AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.rqns.optum.com/", "AcaMemberDemographicService");

    public AcaMemberDemographicService_AcaMemberDemographicServiceImplPort_Client() {
    }

    public  String acaMeberDemography() throws java.lang.Exception {
    	String sReturn="";
    	String sSecondreturn="";
    	String sFst_name="";
    	String sLst_name="";
    	String sMdl_name="";
    	String  sDob_date="";
    	String sGdr_cd="";
    	String sAdr_ln1="";
    	String sAdr_ln2="";
    	String sCity_nm="";
    	String sSt_cd="";
    	String sZip_cd="";
    	String sTel_Nm="";
    	/*System.setProperty("javax.net.ssl.keyStore","C:/CRQS/Webservices/Soap/rqns_tst.jks");
        System.setProperty("javax.net.ssl.keyStorePassword","changeit");
        System.setProperty("javax.net.ssl.trustStore","C:/CRQS/Webservices/Soap/cpc_client_truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword","changeit");*/
        String _getAcaMemberDemographicInfoByMbrIDAndClient_memberID = null;
        String _getAcaMemberDemographicInfoByMbrIDAndClient_modifierID = null;
        String _getAcaMemberDemographicInfoByMbrIDAndClient_clientName = null;
        String _getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID=null;
        URL wsdlURL = AcaMemberDemographicService_Service.WSDL_LOCATION;
     
      
        AcaMemberDemographicService_Service ss = new AcaMemberDemographicService_Service(wsdlURL, SERVICE_NAME);
        AcaMemberDemographicService port = ss.getAcaMemberDemographicServiceImplPort();  
        
        String sRequestSqlFinal="";
        {
        String sRequestSql="select count(*) from (select m_adj.mbr_id,m_adj.mbr_mod_id,m_adj.mbr_sub_pln_adj_strt_dt,m_adj.mbr_sub_pln_adj_end_dt,m_glb.mbr_glb_id,vw_clnt.sub_cli_org_nm,vw_clnt.clnt_guid from";
        sRequestSql=sRequestSql+" MBR_ENRL_ADJ m_adj ,CS_MBR_GLB_ID m_glb,vw_cs_clnt_guid_mod vw_clnt where m_adj.mbr_id=m_glb.mbr_id and m_adj.mbr_mod_id=m_glb.mbr_mod_id";
        sRequestSql=sRequestSql+" and vw_clnt.sub_cli_sk=m_adj.sub_cli_sk and m_adj.sub_cli_sk=m_glb.sub_cli_sk  and m_glb.mbr_glb_id is  not null order by m_adj.mbr_sub_pln_adj_strt_dt desc ) where rownum=1";
        ResultSet rs=DataBaseConnect.getRsList("TEST", sRequestSql);
        int iCount=0;
         while (rs.next()){
         	iCount = rs.getInt(1);
         }
         
         if (iCount==1)
         {
        	  sRequestSqlFinal="select m_adj.mbr_id as mbr_id,m_adj.mbr_mod_id,m_adj.mbr_sub_pln_adj_strt_dt,m_adj.mbr_sub_pln_adj_end_dt,m_glb.mbr_glb_id,vw_clnt.sub_cli_org_nm,vw_clnt.clnt_guid from";
        	  sRequestSqlFinal=sRequestSqlFinal+" MBR_ENRL_ADJ m_adj ,CS_MBR_GLB_ID m_glb,vw_cs_clnt_guid_mod vw_clnt where m_adj.mbr_id=m_glb.mbr_id and m_adj.mbr_mod_id=m_glb.mbr_mod_id";
        	  sRequestSqlFinal=sRequestSqlFinal+" and vw_clnt.sub_cli_sk=m_adj.sub_cli_sk and m_adj.sub_cli_sk=m_glb.sub_cli_sk  and m_glb.mbr_glb_id is  not null order by m_adj.mbr_sub_pln_adj_strt_dt desc";
         System.out.println(sRequestSqlFinal);
         	ResultSet rs1=DataBaseConnect.getRsList("TEST", sRequestSqlFinal);
         	 while (rs1.next()){
         		_getAcaMemberDemographicInfoByMbrIDAndClient_memberID=rs1.getString(1);
         		//_getEligibleAcaMembersByMbrIDAndClient_memberID=_getEligibleAcaMembersByMbrIDAndClient_memberID.toString();
         		_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID=rs1.getString(2);
         		_getAcaMemberDemographicInfoByMbrIDAndClient_clientName=rs1.getString(6);
         		// _getEligibleAcaMembersByMbrIDAndClient_eligStrtDt=rs1.getString(3);
         		// _getEligibleAcaMembersByMbrIDAndClient_eligEndDt=rs1.getString(4);
         		_getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID=rs1.getString(5);
         		// System.out.println("Start date:"+rs1.getString(3)); //2016-01-01 00:00:00
         		// System.out.println("End date:"+rs1.getString(4));//2016-05-31 00:00:00
         	break;
         	 }

         }
         String sResponseSql="select m.mbr_id,m.mbr_mod_id ,m.mbr_fst_nm,m.mbr_lst_nm,m.mbr_midl_nm,m.mbr_dob_dt,m.mbr_gdr_cd,ma.adr_ln_1_txt ,ma.adr_ln_2_txt,ma.city_nm,ma.st_cd,ma.zip_cd,ma.tel_num_txt from mbr m, mbr_adr ma where m.mbr_id=ma.mbr_id and m.mbr_mod_id=ma.mbr_mod_id and  m.mbr_id='"+_getAcaMemberDemographicInfoByMbrIDAndClient_memberID+"' and m.mbr_mod_id='"+_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID+"'";
         System.out.println(sResponseSql);
      	ResultSet rs2=DataBaseConnect.getRsList("TEST", sResponseSql);
      	 while (rs2.next()){
      		 
      		 sFst_name=rs2.getString(3);
      		 sLst_name=rs2.getString(4);
      		 sMdl_name=rs2.getString(5);
      		 sDob_date=rs2.getString(6);
      		 sGdr_cd=rs2.getString(7);
      		 sAdr_ln1=rs2.getString(8);
      		 sAdr_ln2=rs2.getString(9);
      		 sCity_nm=rs2.getString(10);
      		 sSt_cd=rs2.getString(11);
      		 sZip_cd=rs2.getString(12);
      		 sTel_Nm=rs2.getString(13);
      		
      		 
      		 break;
      	 }
      	 
         System.out.println("Invoking getAcaMemberDemographicInfoByMbrIDAndClient...");
       // java.lang.String _getAcaMemberDemographicInfoByMbrIDAndClient_memberID = "150045";
       // java.lang.String _getAcaMemberDemographicInfoByMbrIDAndClient_modifierID = "543";
      //  java.lang.String _getAcaMemberDemographicInfoByMbrIDAndClient_clientName = "UnitedHealth Group Employee and Individual Commercial - UNET";
        com.optum.rqns.services.demographyTest.ServiceMetaData _getAcaMemberDemographicInfoByMbrIDAndClient_metaData = new com.optum.rqns.services.demographyTest.ServiceMetaData();
        _getAcaMemberDemographicInfoByMbrIDAndClient_metaData.setAppId("5317c8af4dd6bec7b46c2083018b8ae6");
        try {
            com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo _getAcaMemberDemographicInfoByMbrIDAndClient__return = port.getAcaMemberDemographicInfoByMbrIDAndClient(_getAcaMemberDemographicInfoByMbrIDAndClient_memberID, _getAcaMemberDemographicInfoByMbrIDAndClient_modifierID, _getAcaMemberDemographicInfoByMbrIDAndClient_clientName, _getAcaMemberDemographicInfoByMbrIDAndClient_metaData);
            System.out.println("getAcaMemberDemographicInfoByMbrIDAndClient.result=" + _getAcaMemberDemographicInfoByMbrIDAndClient__return.acaMemberDemographicDetails.get(0).firstName);
            
            AcaMemberDemographicDetails oRecord = _getAcaMemberDemographicInfoByMbrIDAndClient__return.acaMemberDemographicDetails.get(0);
            
            
            if (_getAcaMemberDemographicInfoByMbrIDAndClient_memberID.equals(oRecord.memberID) &&
            		_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID.equals(oRecord.memberIDModifier) &&
            		sFst_name.equals(oRecord.firstName) &&
            		sLst_name.equals(oRecord.lastName) &&
            		sMdl_name.equals(oRecord.middleName) &&
            		sDob_date.equals(oRecord.dateOfBirth) &&
            		sGdr_cd.equals(oRecord.gender) &&
            		sAdr_ln1.equals(oRecord.addressLine1) &&
            		sAdr_ln2.equals(oRecord.addressLine2) &&
            		sCity_nm.equals(oRecord.addressCity) &&
            		sSt_cd.equals(oRecord.addressState) &&
            		sZip_cd.equals(oRecord.addressZipcode) &&
            		sTel_Nm.equals(oRecord.homePhone))
      
					{
						
			
            	 sReturn="getAcaMemberDemographicInfoByMbrIDAndClient  --------Passed:-------";
            	
            	 sReturn=sReturn+" ************************Request******************************************";
            	sReturn=sReturn+ " Member ID:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_memberID;
            	sReturn=sReturn+ " Member Mod ID:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID;
            	sReturn=sReturn+ " Client Name:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_clientName;
            
            	
            	sReturn=sReturn+"************************Response******************************************";
            	sReturn=sReturn+ " Member ID:- " +oRecord.memberID;
            	sReturn=sReturn+ " Member Mod ID:- " +oRecord.memberIDModifier;
            	sReturn=sReturn+ " First Name:- " +oRecord.firstName;
            	sReturn=sReturn+ " Last Name:- " +oRecord.lastName;
            	
            	sReturn=sReturn+ " Middle Name:- " +oRecord.middleName;
            	sReturn=sReturn+ " DOB - " +oRecord.dateOfBirth;
            	sReturn=sReturn+ " Gender:- " +oRecord.gender;
            	sReturn=sReturn+ " Adress1:- " +oRecord.addressLine1;
            	sReturn=sReturn+ " Address2:- " +oRecord.addressLine2;
            	sReturn=sReturn+ " City - " +oRecord.addressCity;
            	sReturn=sReturn+ " State:- " +oRecord.addressState;
            	sReturn=sReturn+ " Zip:- " +oRecord.addressZipcode;
            	sReturn=sReturn+ " Phone:- " +oRecord.homePhone;
            	
            	
            }
            else
            {
            	sReturn="getAcaMemberDemographicInfoByMbrIDAndClient  --------Failed:-------";
            	
           	 sReturn=sReturn+" ************************Request******************************************";
           	sReturn=sReturn+ " Member ID:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID;
           	sReturn=sReturn+ " Client Name:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_clientName;
           
           	
           	sReturn=sReturn+"************************Response******************************************";
           	sReturn=sReturn+ " Member ID:- " +oRecord.memberID;
           	sReturn=sReturn+ " Member Mod ID:- " +oRecord.memberIDModifier;
           	sReturn=sReturn+ " First Name:- " +oRecord.firstName;
           	sReturn=sReturn+ " Last Name:- " +oRecord.lastName;
           	
           	sReturn=sReturn+ " Middle Name:- " +oRecord.middleName;
           	sReturn=sReturn+ " DOB - " +oRecord.dateOfBirth;
           	sReturn=sReturn+ " Gender:- " +oRecord.gender;
           	sReturn=sReturn+ " Adress1:- " +oRecord.addressLine1;
           	sReturn=sReturn+ " Address2:- " +oRecord.addressLine2;
           	sReturn=sReturn+ " City - " +oRecord.addressCity;
           	sReturn=sReturn+ " State:- " +oRecord.addressState;
           	sReturn=sReturn+ " Zip:- " +oRecord.addressZipcode;
           	sReturn=sReturn+ " Phone:- " +oRecord.homePhone;
            }

            
            
            
            
            
            
            
            
            
            System.out.println(_getAcaMemberDemographicInfoByMbrIDAndClient__return.getAcaMemberDemographicDetails().get(0).lastName);
            System.out.println(_getAcaMemberDemographicInfoByMbrIDAndClient__return.getAcaMemberDemographicDetails().get(0).middleName);
            System.out.println(_getAcaMemberDemographicInfoByMbrIDAndClient__return.getAcaMemberDemographicDetails().get(0).addressLine1);
            System.out.println(_getAcaMemberDemographicInfoByMbrIDAndClient__return.getAcaMemberDemographicDetails().get(0).addressLine2);
        } catch (ServiceException_Exception e) { 
            System.out.println("Expected exception: ServiceException has occurred.");
            System.out.println(e.toString());
            sReturn="Service failed";
        }
            }
        {
        System.out.println("Invoking getAcaMemberDemographicInfoByGlbMbrIDAndClient...");
     //   java.lang.String _getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID = "_getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID255381279";
      //  java.lang.String _getAcaMemberDemographicInfoByGlbMbrIDAndClient_clientName = "_getAcaMemberDemographicInfoByGlbMbrIDAndClient_clientName-408730414";
        com.optum.rqns.services.demographyTest.ServiceMetaData _getAcaMemberDemographicInfoByGlbMbrIDAndClient_metaData = new com.optum.rqns.services.demographyTest.ServiceMetaData();
        _getAcaMemberDemographicInfoByGlbMbrIDAndClient_metaData.setAppId("5317c8af4dd6bec7b46c2083018b8ae6");
        try {
            com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo _getAcaMemberDemographicInfoByGlbMbrIDAndClient__return = port.getAcaMemberDemographicInfoByGlbMbrIDAndClient(_getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID, _getAcaMemberDemographicInfoByMbrIDAndClient_clientName, _getAcaMemberDemographicInfoByGlbMbrIDAndClient_metaData);
            AcaMemberDemographicDetails oRecord = _getAcaMemberDemographicInfoByGlbMbrIDAndClient__return.acaMemberDemographicDetails.get(0);
            if (_getAcaMemberDemographicInfoByMbrIDAndClient_memberID.equals(oRecord.memberID) &&
            		_getAcaMemberDemographicInfoByMbrIDAndClient_modifierID.equals(oRecord.memberIDModifier) &&
            		sFst_name.equals(oRecord.firstName) &&
            		sLst_name.equals(oRecord.lastName) &&
            		sMdl_name.equals(oRecord.middleName) &&
            		sDob_date.equals(oRecord.dateOfBirth) &&
            		sGdr_cd.equals(oRecord.gender) &&
            		sAdr_ln1.equals(oRecord.addressLine1) &&
            		sAdr_ln2.equals(oRecord.addressLine2) &&
            		sCity_nm.equals(oRecord.addressCity) &&
            		sSt_cd.equals(oRecord.addressState) &&
            		sZip_cd.equals(oRecord.addressZipcode) &&
            		sTel_Nm.equals(oRecord.homePhone))
      
					{
						
			
            	sSecondreturn="getAcaMemberDemographicInfoByGlbMbrIDAndClient  --------Passed:-------";
            	
            	 sSecondreturn=sSecondreturn+" ************************Request******************************************";
                	sSecondreturn=sSecondreturn+ " GLobal Member ID:- " +_getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID;
               
                	sSecondreturn=sSecondreturn+ " Client Name:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_clientName;
                
                	
                	sSecondreturn=sSecondreturn+"************************Response******************************************";
                	sSecondreturn=sSecondreturn+ " Member ID:- " +oRecord.memberID;
                	sSecondreturn=sSecondreturn+ " Member Mod ID:- " +oRecord.memberIDModifier;
                	sSecondreturn=sSecondreturn+ " Global Member ID:- " +oRecord.globalMemberID;
            	sSecondreturn=sSecondreturn+ " First Name:- " +oRecord.firstName;
            	sSecondreturn=sSecondreturn+ " Last Name:- " +oRecord.lastName;
            	
            	sSecondreturn=sSecondreturn+ " Middle Name:- " +oRecord.middleName;
            	sSecondreturn=sSecondreturn+ " DOB - " +oRecord.dateOfBirth;
            	sSecondreturn=sSecondreturn+ " Gender:- " +oRecord.gender;
            	sSecondreturn=sSecondreturn+ " Adress1:- " +oRecord.addressLine1;
            	sSecondreturn=sSecondreturn+ " Address2:- " +oRecord.addressLine2;
            	sSecondreturn=sSecondreturn+ " City - " +oRecord.addressCity;
            	sSecondreturn=sSecondreturn+ " State:- " +oRecord.addressState;
            	sSecondreturn=sSecondreturn+ " Zip:- " +oRecord.addressZipcode;
            	sSecondreturn=sSecondreturn+ " Phone:- " +oRecord.homePhone;
            	
            	
            }
            else
            {
            	sSecondreturn="getAcaMemberDemographicInfoByGlbMbrIDAndClient  --------Failed:-------";
            	
           	 sSecondreturn=sSecondreturn+" ************************Request******************************************";
           	sSecondreturn=sSecondreturn+ " GLobal Member ID:- " +_getAcaMemberDemographicInfoByGlbMbrIDAndClient_globalMemberID;
          
           	sSecondreturn=sSecondreturn+ " Client Name:- " +_getAcaMemberDemographicInfoByMbrIDAndClient_clientName;
           
           	
           	sSecondreturn=sSecondreturn+"************************Response******************************************";
           	sSecondreturn=sSecondreturn+ " Member ID:- " +oRecord.memberID;
           	sSecondreturn=sSecondreturn+ " Member Mod ID:- " +oRecord.memberIDModifier;
           	sSecondreturn=sSecondreturn+ " Global Member ID:- " +oRecord.globalMemberID;
           	sSecondreturn=sSecondreturn+ " First Name:- " +oRecord.firstName;
           	sSecondreturn=sSecondreturn+ " Last Name:- " +oRecord.lastName;
           	
           	sSecondreturn=sSecondreturn+ " Middle Name:- " +oRecord.middleName;
           	sSecondreturn=sSecondreturn+ " DOB - " +oRecord.dateOfBirth;
           	sSecondreturn=sSecondreturn+ " Gender:- " +oRecord.gender;
           	sSecondreturn=sSecondreturn+ " Adress1:- " +oRecord.addressLine1;
           	sSecondreturn=sSecondreturn+ " Address2:- " +oRecord.addressLine2;
           	sSecondreturn=sSecondreturn+ " City - " +oRecord.addressCity;
           	sSecondreturn=sSecondreturn+ " State:- " +oRecord.addressState;
           	sSecondreturn=sSecondreturn+ " Zip:- " +oRecord.addressZipcode;
           	sSecondreturn=sSecondreturn+ " Phone:- " +oRecord.homePhone;
            }

        } catch (ServiceException_Exception e) { 
            System.out.println("Expected exception: ServiceException has occurred.");
            System.out.println(e.toString());
        }
            }
        System.out.println(sReturn+sSecondreturn);
        return(sReturn+sSecondreturn);
      //  System.exit(0);
    }

}