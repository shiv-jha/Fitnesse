package com.optum.rqns.services.hichistory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * The service port type for HicHistoryService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-25T16:45:51.870+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://services.rqns.optum.com/", name = "HicHistoryService")
@XmlSeeAlso({ObjectFactory.class})
public interface HicHistoryService {

    /**
     * The operation fetches member hic history information by member hic
     */
    @WebMethod(action = "getHicHistory")
    @RequestWrapper(localName = "getHicHistory", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.hichistory.GetHicHistory")
    @ResponseWrapper(localName = "getHicHistoryResponse", targetNamespace = "http://services.rqns.optum.com/", className = "com.optum.rqns.services.hichistory.GetHicHistoryResponse")
    public void getHicHistory(
        @WebParam(name = "hicNumber", targetNamespace = "")
        java.lang.String hicNumber,
        @WebParam(name = "metaData", targetNamespace = "")
        com.optum.rqns.services.hichistory.ServiceMetaData metaData,
        @WebParam(mode = WebParam.Mode.OUT, name = "inputHicNumber", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> inputHicNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "hicCount", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Integer> hicCount,
        @WebParam(mode = WebParam.Mode.OUT, name = "hicDetails", targetNamespace = "")
        javax.xml.ws.Holder<java.util.List<com.optum.rqns.services.hichistory.HicDetails>> hicDetails,
        @WebParam(mode = WebParam.Mode.OUT, name = "errorMsg", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> errorMsg
    ) throws ServiceException_Exception;
}
