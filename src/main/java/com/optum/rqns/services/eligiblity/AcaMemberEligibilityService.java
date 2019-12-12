package com.optum.rqns.services.eligiblity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * The service port type for AcaMemberEligibilityService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-25T16:40:21.706+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://services.rqns.optum.com/", name = "AcaMemberEligibilityService")
@XmlSeeAlso({ObjectFactory.class})
public interface AcaMemberEligibilityService {

    /**
     * The operation fetches member eligibility information by member id and client name
     */
    @WebMethod(action = "getEligibleAcaMembersByMbrIDAndClient")
    @RequestWrapper(localName = "getEligibleAcaMembersByMbrIDAndClient", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.eligiblity.GetEligibleAcaMembersByMbrIDAndClient")
    @ResponseWrapper(localName = "getEligibleAcaMembersByMbrIDAndClientResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.eligiblity.GetEligibleAcaMembersByMbrIDAndClientResponse")
    @WebResult(name = "eligibilityInfo", targetNamespace = "")
    public com.optum.rqns.services.eligiblity.AcaMemberEligibilityInfo getEligibleAcaMembersByMbrIDAndClient(
        @WebParam(name = "memberID", targetNamespace = "")
        java.lang.String memberID,
        @WebParam(name = "modifierID", targetNamespace = "")
        java.lang.String modifierID,
        @WebParam(name = "clientName", targetNamespace = "")
        java.lang.String clientName,
        @WebParam(name = "eligStrtDt", targetNamespace = "")
        java.lang.String eligStrtDt,
        @WebParam(name = "eligEndDt", targetNamespace = "")
        java.lang.String eligEndDt,
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.eligiblity.ServiceMetaData metaData
    ) throws ServiceException_Exception;

    /**
     * The operation fetches member eligibility information by global member id and client name
     */
    @WebMethod(action = "getEligibleAcaMembersByGlbMbrIDAndClient")
    @RequestWrapper(localName = "getEligibleAcaMembersByGlbMbrIDAndClient", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.eligiblity.GetEligibleAcaMembersByGlbMbrIDAndClient")
    @ResponseWrapper(localName = "getEligibleAcaMembersByGlbMbrIDAndClientResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.eligiblity.GetEligibleAcaMembersByGlbMbrIDAndClientResponse")
    @WebResult(name = "eligibilityInfo", targetNamespace = "")
    public com.optum.rqns.services.eligiblity.AcaMemberEligibilityInfo getEligibleAcaMembersByGlbMbrIDAndClient(
        @WebParam(name = "globalMemberID", targetNamespace = "")
        java.lang.String globalMemberID,
        @WebParam(name = "clientName", targetNamespace = "")
        java.lang.String clientName,
        @WebParam(name = "eligStrtDt", targetNamespace = "")
        java.lang.String eligStrtDt,
        @WebParam(name = "eligEndDt", targetNamespace = "")
        java.lang.String eligEndDt,
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.eligiblity.ServiceMetaData metaData
    ) throws ServiceException_Exception;
}
