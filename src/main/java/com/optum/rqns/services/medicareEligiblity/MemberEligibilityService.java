package com.optum.rqns.services.medicareEligiblity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * The service port type for MemberEligibilityService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T13:21:12.066+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://services.rqns.optum.com/", name = "MemberEligibilityService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MemberEligibilityService {

    /**
     * The operation fetches members eligibility information by hic id and date range
     */
    @WebMethod(action = "getEligibleMembers")
    @WebResult(name = "getEligibleMembersResponse", targetNamespace = "http://services.rqns.optum.com/", partName = "getEligibleMembersResponse")
    public GetEligibleMembersResponse getEligibleMembers(
        @WebParam(partName = "getEligibleMembers", name = "getEligibleMembers", targetNamespace = "http://services.rqns.optum.com/")
        GetEligibleMembers getEligibleMembers
    ) throws ServiceException_Exception;
}
