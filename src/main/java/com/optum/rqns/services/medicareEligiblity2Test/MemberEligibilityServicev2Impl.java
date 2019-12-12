
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.medicareEligiblity2Test;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T15:16:28.975+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "memberEligibilityServicev2",
                      portName = "MemberEligibilityServiceImplv2Port",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/memberEligibilityServicev2?wsdl",
                      endpointInterface = "com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityServicev2")
                      
public class MemberEligibilityServicev2Impl implements MemberEligibilityServicev2 {

    private static final Logger LOG = Logger.getLogger(MemberEligibilityServicev2Impl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityServicev2#getEligibleMembers(com.optum.rqns.services.medicareEligiblity2Test.GetEligibleMembers  getEligibleMembers )*
     */
    public com.optum.rqns.services.medicareEligiblity2Test.GetEligibleMembersResponsev2 getEligibleMembers(GetEligibleMembers getEligibleMembers) throws ServiceException_Exception    { 
        LOG.info("Executing operation getEligibleMembers");
        System.out.println(getEligibleMembers);
        try {
            com.optum.rqns.services.medicareEligiblity2Test.GetEligibleMembersResponsev2 _return = new com.optum.rqns.services.medicareEligiblity2Test.GetEligibleMembersResponsev2();
            com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityInfov2 _returnMemberEligibilityInfov2 = new com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityInfov2();
            com.optum.rqns.services.medicareEligiblity2Test.MemberInfo _returnMemberEligibilityInfov2MemberInfo = new com.optum.rqns.services.medicareEligiblity2Test.MemberInfo();
            _returnMemberEligibilityInfov2MemberInfo.setDateOfBirth("DateOfBirth710469355");
            _returnMemberEligibilityInfov2MemberInfo.setGender("Gender-1097924956");
            _returnMemberEligibilityInfov2.setMemberInfo(_returnMemberEligibilityInfov2MemberInfo);
            com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityInfov2.MemberHicHistoryList _returnMemberEligibilityInfov2MemberHicHistoryList = new com.optum.rqns.services.medicareEligiblity2Test.MemberEligibilityInfov2.MemberHicHistoryList();
            java.util.List<com.optum.rqns.services.medicareEligiblity2Test.MemberHicHistoryv2> _returnMemberEligibilityInfov2MemberHicHistoryListMemberHicHistoryv2 = new java.util.ArrayList<com.optum.rqns.services.medicareEligiblity2Test.MemberHicHistoryv2>();
            _returnMemberEligibilityInfov2MemberHicHistoryList.getMemberHicHistoryv2().addAll(_returnMemberEligibilityInfov2MemberHicHistoryListMemberHicHistoryv2);
            _returnMemberEligibilityInfov2.setMemberHicHistoryList(_returnMemberEligibilityInfov2MemberHicHistoryList);
            _returnMemberEligibilityInfov2.setErrorCd(Integer.valueOf(1591057853));
            _returnMemberEligibilityInfov2.setErrorMsg("ErrorMsg-1374019053");
            _return.setMemberEligibilityInfov2(_returnMemberEligibilityInfov2);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
