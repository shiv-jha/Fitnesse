package com.optum.rqns.services.supplemental;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * The service port type for SupplementalInfoService
 *
 * This class was generated by Apache CXF 3.1.11
 * 2017-07-03T10:34:37.814-05:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://services.rqns.optum.com/", name = "SupplementalInfoService")
@XmlSeeAlso({ObjectFactory.class})
public interface SupplementalInfoService {

    /**
     * The operation saves supplemental information
     */
    @WebMethod(action = "addSupplementalInfo")
    @RequestWrapper(localName = "addSupplementalInfo", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.supplemental.AddSupplementalInfo")
    @ResponseWrapper(localName = "addSupplementalInfoResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.supplemental.AddSupplementalInfoResponse")
    public void addSupplementalInfo(
        @WebParam(name = "serviceMetaData", targetNamespace = "")
        com.optum.rqns.services.supplemental.ServiceMetaData serviceMetaData,
        @WebParam(name = "supplementalInfo", targetNamespace = "")
        com.optum.rqns.services.supplemental.SupplementalInfo supplementalInfo,
        @WebParam(mode = WebParam.Mode.OUT, name = "responseCode", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> responseCode,
        @WebParam(mode = WebParam.Mode.OUT, name = "responseMessage", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> responseMessage
    ) throws ServiceException_Exception;
}
