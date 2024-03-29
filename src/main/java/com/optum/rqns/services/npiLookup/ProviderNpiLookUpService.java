package com.optum.rqns.services.npiLookup;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * The service port type for ProviderNpiLookUpService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T15:06:15.053+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://services.rqns.optum.com/", name = "ProviderNpiLookUpService")
@XmlSeeAlso({ObjectFactory.class})
public interface ProviderNpiLookUpService {

    /**
     * The operation fetches provider details by globalProviderID and client name
     */
    @WebMethod(action = "getClientP360ProviderInfoByGlobalID")
    @RequestWrapper(localName = "getClientP360ProviderInfoByGlobalID", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientP360ProviderInfoByGlobalID")
    @ResponseWrapper(localName = "getClientP360ProviderInfoByGlobalIDResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientP360ProviderInfoByGlobalIDResponse")
    @WebResult(name = "providerDemographicInfo", targetNamespace = "")
    public com.optum.rqns.services.npiLookup.ProviderDemographicInfo getClientP360ProviderInfoByGlobalID(
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.npiLookup.ServiceMetaData metaData,
        @WebParam(name = "globalProviderID", targetNamespace = "")
        java.lang.String globalProviderID,
        @WebParam(name = "clientName", targetNamespace = "")
        java.lang.String clientName
    ) throws ServiceException_Exception;

    /**
     * The operation fetches provider details by providerNpiId
     */
    @WebMethod(action = "getNppesProviderInfoByNpi")
    @RequestWrapper(localName = "getNppesProviderInfoByNpi", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetNppesProviderInfoByNpi")
    @ResponseWrapper(localName = "getNppesProviderInfoByNpiResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetNppesProviderInfoByNpiResponse")
    @WebResult(name = "providerInfo", targetNamespace = "")
    public com.optum.rqns.services.npiLookup.ProviderInfo getNppesProviderInfoByNpi(
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.npiLookup.ServiceMetaData metaData,
        @WebParam(name = "providerNpiID", targetNamespace = "")
        java.lang.Long providerNpiID
    ) throws ServiceException_Exception;

    /**
     * The operation fetches provider details by healthPlanProviderID, modifierID and client name
     */
    @WebMethod(action = "getClientProviderInfoByProviderIDAndClientName")
    @RequestWrapper(localName = "getClientProviderInfoByProviderIDAndClientName", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientProviderInfoByProviderIDAndClientName")
    @ResponseWrapper(localName = "getClientProviderInfoByProviderIDAndClientNameResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientProviderInfoByProviderIDAndClientNameResponse")
    @WebResult(name = "providerDemographicInfo", targetNamespace = "")
    public com.optum.rqns.services.npiLookup.ProviderDemographicInfo getClientProviderInfoByProviderIDAndClientName(
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.npiLookup.ServiceMetaData metaData,
        @WebParam(name = "healthPlanProviderID", targetNamespace = "")
        java.lang.String healthPlanProviderID,
        @WebParam(name = "modifierID", targetNamespace = "")
        java.lang.String modifierID,
        @WebParam(name = "clientName", targetNamespace = "")
        java.lang.String clientName
    ) throws ServiceException_Exception;

    /**
     * The operation fetches provider details by providerNpiId and client name
     */
    @WebMethod(action = "getClientProviderInfoByNpiAndClientName")
    @RequestWrapper(localName = "getClientProviderInfoByNpiAndClientName", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientProviderInfoByNpiAndClientName")
    @ResponseWrapper(localName = "getClientProviderInfoByNpiAndClientNameResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.npiLookup.GetClientProviderInfoByNpiAndClientNameResponse")
    @WebResult(name = "providerDemographicInfo", targetNamespace = "")
    public com.optum.rqns.services.npiLookup.ProviderDemographicInfo getClientProviderInfoByNpiAndClientName(
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.npiLookup.ServiceMetaData metaData,
        @WebParam(name = "providerNpiId", targetNamespace = "")
        java.lang.String providerNpiId,
        @WebParam(name = "clientName", targetNamespace = "")
        java.lang.String clientName
    ) throws ServiceException_Exception;
}
