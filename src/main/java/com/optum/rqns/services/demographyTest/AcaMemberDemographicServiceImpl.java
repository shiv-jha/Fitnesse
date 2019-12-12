
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.demographyTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-27T18:22:18.296+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "AcaMemberDemographicService",
                      portName = "AcaMemberDemographicServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/AcaMemberDemographicService?wsdl",
                      endpointInterface = "com.optum.rqns.services.demographyTest.AcaMemberDemographicService")
                      
public class AcaMemberDemographicServiceImpl implements AcaMemberDemographicService {

    private static final Logger LOG = Logger.getLogger(AcaMemberDemographicServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.demographyTest.AcaMemberDemographicService#getAcaMemberDemographicInfoByMbrIDAndClient(java.lang.String  memberID ,)java.lang.String  modifierID ,)java.lang.String  clientName ,)com.optum.rqns.services.demographyTest.ServiceMetaData  metaData )*
     */
    public com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo getAcaMemberDemographicInfoByMbrIDAndClient(java.lang.String memberID,java.lang.String modifierID,java.lang.String clientName,com.optum.rqns.services.demographyTest.ServiceMetaData metaData) throws ServiceException_Exception    { 
        LOG.info("Executing operation getAcaMemberDemographicInfoByMbrIDAndClient");
        System.out.println(memberID);
        System.out.println(modifierID);
        System.out.println(clientName);
        System.out.println(metaData);
        try {
            com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo _return = new com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo();
            _return.setReturnCode(1546935461);
            _return.setReturnCodeDesc("ReturnCodeDesc-1895802348");
            _return.setSource("Source500659591");
            java.util.List<com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails> _returnAcaMemberDemographicDetails = new java.util.ArrayList<com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails>();
            com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails _returnAcaMemberDemographicDetailsVal1 = new com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails();
            _returnAcaMemberDemographicDetailsVal1.setClientGuid("ClientGuid-1988442115");
            _returnAcaMemberDemographicDetailsVal1.setMemberID("MemberID-119836983");
            _returnAcaMemberDemographicDetailsVal1.setMemberIDModifier("MemberIDModifier368123022");
            _returnAcaMemberDemographicDetailsVal1.setGlobalMemberID("GlobalMemberID946114408");
            _returnAcaMemberDemographicDetailsVal1.setPlanNumber("PlanNumber642070864");
            _returnAcaMemberDemographicDetailsVal1.setSubscriberID("SubscriberID1218491991");
            _returnAcaMemberDemographicDetailsVal1.setFirstName("FirstName2063605351");
            _returnAcaMemberDemographicDetailsVal1.setMiddleName("MiddleName382620119");
            _returnAcaMemberDemographicDetailsVal1.setLastName("LastName-1334047204");
            _returnAcaMemberDemographicDetailsVal1.setOriginalStartDate("OriginalStartDate-589496278");
            _returnAcaMemberDemographicDetailsVal1.setLatestEndDate("LatestEndDate1702635530");
            _returnAcaMemberDemographicDetailsVal1.setHomePhone("HomePhone1796392551");
            _returnAcaMemberDemographicDetailsVal1.setAddressLine1("AddressLine11043804055");
            _returnAcaMemberDemographicDetailsVal1.setAddressLine2("AddressLine2-1982890440");
            _returnAcaMemberDemographicDetailsVal1.setAddressCity("AddressCity-315658135");
            _returnAcaMemberDemographicDetailsVal1.setAddressState("AddressState523930050");
            _returnAcaMemberDemographicDetailsVal1.setAddressZipcode("AddressZipcode1714955503");
            _returnAcaMemberDemographicDetailsVal1.setDateOfBirth("DateOfBirth1462015254");
            _returnAcaMemberDemographicDetailsVal1.setGender("Gender236566068");
            _returnAcaMemberDemographicDetailsVal1.setUCardID("UCardID573193933");
            _returnAcaMemberDemographicDetails.add(_returnAcaMemberDemographicDetailsVal1);
            _return.getAcaMemberDemographicDetails().addAll(_returnAcaMemberDemographicDetails);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

    /* (non-Javadoc)
     * @see com.optum.rqns.services.demographyTest.AcaMemberDemographicService#getAcaMemberDemographicInfoByGlbMbrIDAndClient(java.lang.String  globalMemberID ,)java.lang.String  clientName ,)com.optum.rqns.services.demographyTest.ServiceMetaData  metaData )*
     */
    public com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo getAcaMemberDemographicInfoByGlbMbrIDAndClient(java.lang.String globalMemberID,java.lang.String clientName,com.optum.rqns.services.demographyTest.ServiceMetaData metaData) throws ServiceException_Exception    { 
        LOG.info("Executing operation getAcaMemberDemographicInfoByGlbMbrIDAndClient");
        System.out.println(globalMemberID);
        System.out.println(clientName);
        System.out.println(metaData);
        try {
            com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo _return = new com.optum.rqns.services.demographyTest.AcaMemberDemographicInfo();
            _return.setReturnCode(-4558434);
            _return.setReturnCodeDesc("ReturnCodeDesc769490369");
            _return.setSource("Source-401196985");
            java.util.List<com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails> _returnAcaMemberDemographicDetails = new java.util.ArrayList<com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails>();
            com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails _returnAcaMemberDemographicDetailsVal1 = new com.optum.rqns.services.demographyTest.AcaMemberDemographicDetails();
            _returnAcaMemberDemographicDetailsVal1.setClientGuid("ClientGuid1098223625");
            _returnAcaMemberDemographicDetailsVal1.setMemberID("MemberID1958413571");
            _returnAcaMemberDemographicDetailsVal1.setMemberIDModifier("MemberIDModifier1131003802");
            _returnAcaMemberDemographicDetailsVal1.setGlobalMemberID("GlobalMemberID805585251");
            _returnAcaMemberDemographicDetailsVal1.setPlanNumber("PlanNumber-1491705028");
            _returnAcaMemberDemographicDetailsVal1.setSubscriberID("SubscriberID-1265725650");
            _returnAcaMemberDemographicDetailsVal1.setFirstName("FirstName2135934642");
            _returnAcaMemberDemographicDetailsVal1.setMiddleName("MiddleName1849703200");
            _returnAcaMemberDemographicDetailsVal1.setLastName("LastName1257317199");
            _returnAcaMemberDemographicDetailsVal1.setOriginalStartDate("OriginalStartDate969395963");
            _returnAcaMemberDemographicDetailsVal1.setLatestEndDate("LatestEndDate986847816");
            _returnAcaMemberDemographicDetailsVal1.setHomePhone("HomePhone-1062831070");
            _returnAcaMemberDemographicDetailsVal1.setAddressLine1("AddressLine11127826554");
            _returnAcaMemberDemographicDetailsVal1.setAddressLine2("AddressLine2-1662243487");
            _returnAcaMemberDemographicDetailsVal1.setAddressCity("AddressCity80934799");
            _returnAcaMemberDemographicDetailsVal1.setAddressState("AddressState1681409419");
            _returnAcaMemberDemographicDetailsVal1.setAddressZipcode("AddressZipcode-631806307");
            _returnAcaMemberDemographicDetailsVal1.setDateOfBirth("DateOfBirth377895435");
            _returnAcaMemberDemographicDetailsVal1.setGender("Gender-804236109");
            _returnAcaMemberDemographicDetailsVal1.setUCardID("UCardID-1894866000");
            _returnAcaMemberDemographicDetails.add(_returnAcaMemberDemographicDetailsVal1);
            _return.getAcaMemberDemographicDetails().addAll(_returnAcaMemberDemographicDetails);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
