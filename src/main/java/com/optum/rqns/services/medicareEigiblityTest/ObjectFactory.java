
package com.optum.rqns.services.medicareEigiblityTest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.medicareEigiblityTest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEligibleMembersResponse_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMembersResponse");
    private final static QName _GetEligibleMembers_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMembers");
    private final static QName _MemberEligibilityInfo_QNAME = new QName("http://services.rqns.optum.com/", "memberEligibilityInfo");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.medicareEigiblityTest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MemberEligibilityInfo }
     * 
     */
    public MemberEligibilityInfo createMemberEligibilityInfo() {
        return new MemberEligibilityInfo();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetEligibleMembersResponse }
     * 
     */
    public GetEligibleMembersResponse createGetEligibleMembersResponse() {
        return new GetEligibleMembersResponse();
    }

    /**
     * Create an instance of {@link GetEligibleMembers }
     * 
     */
    public GetEligibleMembers createGetEligibleMembers() {
        return new GetEligibleMembers();
    }

    /**
     * Create an instance of {@link MemberInfo }
     * 
     */
    public MemberInfo createMemberInfo() {
        return new MemberInfo();
    }

    /**
     * Create an instance of {@link MemberHicHistory }
     * 
     */
    public MemberHicHistory createMemberHicHistory() {
        return new MemberHicHistory();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link MemberEligibilityInfo.MemberHicHistoryList }
     * 
     */
    public MemberEligibilityInfo.MemberHicHistoryList createMemberEligibilityInfoMemberHicHistoryList() {
        return new MemberEligibilityInfo.MemberHicHistoryList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMembersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMembersResponse")
    public JAXBElement<GetEligibleMembersResponse> createGetEligibleMembersResponse(GetEligibleMembersResponse value) {
        return new JAXBElement<GetEligibleMembersResponse>(_GetEligibleMembersResponse_QNAME, GetEligibleMembersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMembers")
    public JAXBElement<GetEligibleMembers> createGetEligibleMembers(GetEligibleMembers value) {
        return new JAXBElement<GetEligibleMembers>(_GetEligibleMembers_QNAME, GetEligibleMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberEligibilityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "memberEligibilityInfo")
    public JAXBElement<MemberEligibilityInfo> createMemberEligibilityInfo(MemberEligibilityInfo value) {
        return new JAXBElement<MemberEligibilityInfo>(_MemberEligibilityInfo_QNAME, MemberEligibilityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

}
