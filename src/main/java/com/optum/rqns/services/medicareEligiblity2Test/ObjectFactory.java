
package com.optum.rqns.services.medicareEligiblity2Test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.medicareEligiblity2Test package. 
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
    private final static QName _MemberEligibilityInfov2_QNAME = new QName("http://services.rqns.optum.com/", "memberEligibilityInfov2");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetEligibleMembersResponsev2_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMembersResponsev2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.medicareEligiblity2Test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MemberEligibilityInfov2 }
     * 
     */
    public MemberEligibilityInfov2 createMemberEligibilityInfov2() {
        return new MemberEligibilityInfov2();
    }

    /**
     * Create an instance of {@link GetEligibleMembersResponsev2 }
     * 
     */
    public GetEligibleMembersResponsev2 createGetEligibleMembersResponsev2() {
        return new GetEligibleMembersResponsev2();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
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
     * Create an instance of {@link MemberHicHistoryv2 }
     * 
     */
    public MemberHicHistoryv2 createMemberHicHistoryv2() {
        return new MemberHicHistoryv2();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link MemberEligibilityInfov2 .MemberHicHistoryList }
     * 
     */
    public MemberEligibilityInfov2 .MemberHicHistoryList createMemberEligibilityInfov2MemberHicHistoryList() {
        return new MemberEligibilityInfov2 .MemberHicHistoryList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMembersResponsev2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMembersResponse")
    public JAXBElement<GetEligibleMembersResponsev2> createGetEligibleMembersResponse(GetEligibleMembersResponsev2 value) {
        return new JAXBElement<GetEligibleMembersResponsev2>(_GetEligibleMembersResponse_QNAME, GetEligibleMembersResponsev2 .class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberEligibilityInfov2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "memberEligibilityInfov2")
    public JAXBElement<MemberEligibilityInfov2> createMemberEligibilityInfov2(MemberEligibilityInfov2 value) {
        return new JAXBElement<MemberEligibilityInfov2>(_MemberEligibilityInfov2_QNAME, MemberEligibilityInfov2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMembersResponsev2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMembersResponsev2")
    public JAXBElement<GetEligibleMembersResponsev2> createGetEligibleMembersResponsev2(GetEligibleMembersResponsev2 value) {
        return new JAXBElement<GetEligibleMembersResponsev2>(_GetEligibleMembersResponsev2_QNAME, GetEligibleMembersResponsev2 .class, null, value);
    }

}
