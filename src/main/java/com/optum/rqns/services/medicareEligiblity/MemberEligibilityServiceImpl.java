
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.medicareEligiblity;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T13:21:12.040+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "memberEligibilityService",
                      portName = "MemberEligibilityServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/memberEligibilityService?wsdl",
                      endpointInterface = "com.optum.rqns.services.medicareEligiblity.MemberEligibilityService")
                      
public class MemberEligibilityServiceImpl implements MemberEligibilityService {

    private static final Logger LOG = Logger.getLogger(MemberEligibilityServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.medicareEligiblity.MemberEligibilityService#getEligibleMembers(com.optum.rqns.services.medicareEligiblity.GetEligibleMembers  getEligibleMembers )*
     */
    public com.optum.rqns.services.medicareEligiblity.GetEligibleMembersResponse getEligibleMembers(GetEligibleMembers getEligibleMembers) throws ServiceException_Exception    { 
        LOG.info("Executing operation getEligibleMembers");
        System.out.println(getEligibleMembers);
        try {
            com.optum.rqns.services.medicareEligiblity.GetEligibleMembersResponse _return = new com.optum.rqns.services.medicareEligiblity.GetEligibleMembersResponse();
            com.optum.rqns.services.medicareEligiblity.MemberEligibilityInfo _returnMemberEligibilityInfo = new com.optum.rqns.services.medicareEligiblity.MemberEligibilityInfo();
            com.optum.rqns.services.medicareEligiblity.MemberInfo _returnMemberEligibilityInfoMemberInfo = new com.optum.rqns.services.medicareEligiblity.MemberInfo();
            _returnMemberEligibilityInfoMemberInfo.setDateOfBirth("DateOfBirth1000180153");
            _returnMemberEligibilityInfoMemberInfo.setGender("Gender-413275605");
            _returnMemberEligibilityInfo.setMemberInfo(_returnMemberEligibilityInfoMemberInfo);
            com.optum.rqns.services.medicareEligiblity.MemberEligibilityInfo.MemberHicHistoryList _returnMemberEligibilityInfoMemberHicHistoryList = new com.optum.rqns.services.medicareEligiblity.MemberEligibilityInfo.MemberHicHistoryList();
            java.util.List<com.optum.rqns.services.medicareEligiblity.MemberHicHistory> _returnMemberEligibilityInfoMemberHicHistoryListMemberHicHistory = new java.util.ArrayList<com.optum.rqns.services.medicareEligiblity.MemberHicHistory>();
            _returnMemberEligibilityInfoMemberHicHistoryList.getMemberHicHistory().addAll(_returnMemberEligibilityInfoMemberHicHistoryListMemberHicHistory);
            _returnMemberEligibilityInfo.setMemberHicHistoryList(_returnMemberEligibilityInfoMemberHicHistoryList);
            _return.setMemberEligibilityInfo(_returnMemberEligibilityInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}