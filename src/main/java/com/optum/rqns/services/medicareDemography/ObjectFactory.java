
package com.optum.rqns.services.medicareDemography;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.medicareDemography package. 
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

    private final static QName _MemberDemographicInfo_QNAME = new QName("http://services.rqns.optum.com/", "memberDemographicInfo");
    private final static QName _GetMedicareMemberListInfoByHicId_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberListInfoByHicId");
    private final static QName _GetMedicareMemberListInfoByCardId_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberListInfoByCardId");
    private final static QName _GetMedicareMemberListInfoByCardIdResponse_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberListInfoByCardIdResponse");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetMedicareMemberLatestDemographicInfo_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberLatestDemographicInfo");
    private final static QName _GetMedicareMemberListInfoByHicIdResponse_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberListInfoByHicIdResponse");
    private final static QName _GetMedicareMemberLatestDemographicInfoResponse_QNAME = new QName("http://services.rqns.optum.com/", "getMedicareMemberLatestDemographicInfoResponse");
    private final static QName _MemberDemographicInfoList_QNAME = new QName("http://services.rqns.optum.com/", "memberDemographicInfoList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.medicareDemography
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMedicareMemberLatestDemographicInfoResponse }
     * 
     */
    public GetMedicareMemberLatestDemographicInfoResponse createGetMedicareMemberLatestDemographicInfoResponse() {
        return new GetMedicareMemberLatestDemographicInfoResponse();
    }

    /**
     * Create an instance of {@link MedicareMemberDemographicInfoList }
     * 
     */
    public MedicareMemberDemographicInfoList createMedicareMemberDemographicInfoList() {
        return new MedicareMemberDemographicInfoList();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetMedicareMemberLatestDemographicInfo }
     * 
     */
    public GetMedicareMemberLatestDemographicInfo createGetMedicareMemberLatestDemographicInfo() {
        return new GetMedicareMemberLatestDemographicInfo();
    }

    /**
     * Create an instance of {@link GetMedicareMemberListInfoByHicIdResponse }
     * 
     */
    public GetMedicareMemberListInfoByHicIdResponse createGetMedicareMemberListInfoByHicIdResponse() {
        return new GetMedicareMemberListInfoByHicIdResponse();
    }

    /**
     * Create an instance of {@link GetMedicareMemberListInfoByCardId }
     * 
     */
    public GetMedicareMemberListInfoByCardId createGetMedicareMemberListInfoByCardId() {
        return new GetMedicareMemberListInfoByCardId();
    }

    /**
     * Create an instance of {@link GetMedicareMemberListInfoByCardIdResponse }
     * 
     */
    public GetMedicareMemberListInfoByCardIdResponse createGetMedicareMemberListInfoByCardIdResponse() {
        return new GetMedicareMemberListInfoByCardIdResponse();
    }

    /**
     * Create an instance of {@link MedicareMemberDemographicInfo }
     * 
     */
    public MedicareMemberDemographicInfo createMedicareMemberDemographicInfo() {
        return new MedicareMemberDemographicInfo();
    }

    /**
     * Create an instance of {@link GetMedicareMemberListInfoByHicId }
     * 
     */
    public GetMedicareMemberListInfoByHicId createGetMedicareMemberListInfoByHicId() {
        return new GetMedicareMemberListInfoByHicId();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicareMemberDemographicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "memberDemographicInfo")
    public JAXBElement<MedicareMemberDemographicInfo> createMemberDemographicInfo(MedicareMemberDemographicInfo value) {
        return new JAXBElement<MedicareMemberDemographicInfo>(_MemberDemographicInfo_QNAME, MedicareMemberDemographicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberListInfoByHicId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberListInfoByHicId")
    public JAXBElement<GetMedicareMemberListInfoByHicId> createGetMedicareMemberListInfoByHicId(GetMedicareMemberListInfoByHicId value) {
        return new JAXBElement<GetMedicareMemberListInfoByHicId>(_GetMedicareMemberListInfoByHicId_QNAME, GetMedicareMemberListInfoByHicId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberListInfoByCardId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberListInfoByCardId")
    public JAXBElement<GetMedicareMemberListInfoByCardId> createGetMedicareMemberListInfoByCardId(GetMedicareMemberListInfoByCardId value) {
        return new JAXBElement<GetMedicareMemberListInfoByCardId>(_GetMedicareMemberListInfoByCardId_QNAME, GetMedicareMemberListInfoByCardId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberListInfoByCardIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberListInfoByCardIdResponse")
    public JAXBElement<GetMedicareMemberListInfoByCardIdResponse> createGetMedicareMemberListInfoByCardIdResponse(GetMedicareMemberListInfoByCardIdResponse value) {
        return new JAXBElement<GetMedicareMemberListInfoByCardIdResponse>(_GetMedicareMemberListInfoByCardIdResponse_QNAME, GetMedicareMemberListInfoByCardIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberLatestDemographicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberLatestDemographicInfo")
    public JAXBElement<GetMedicareMemberLatestDemographicInfo> createGetMedicareMemberLatestDemographicInfo(GetMedicareMemberLatestDemographicInfo value) {
        return new JAXBElement<GetMedicareMemberLatestDemographicInfo>(_GetMedicareMemberLatestDemographicInfo_QNAME, GetMedicareMemberLatestDemographicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberListInfoByHicIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberListInfoByHicIdResponse")
    public JAXBElement<GetMedicareMemberListInfoByHicIdResponse> createGetMedicareMemberListInfoByHicIdResponse(GetMedicareMemberListInfoByHicIdResponse value) {
        return new JAXBElement<GetMedicareMemberListInfoByHicIdResponse>(_GetMedicareMemberListInfoByHicIdResponse_QNAME, GetMedicareMemberListInfoByHicIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicareMemberLatestDemographicInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getMedicareMemberLatestDemographicInfoResponse")
    public JAXBElement<GetMedicareMemberLatestDemographicInfoResponse> createGetMedicareMemberLatestDemographicInfoResponse(GetMedicareMemberLatestDemographicInfoResponse value) {
        return new JAXBElement<GetMedicareMemberLatestDemographicInfoResponse>(_GetMedicareMemberLatestDemographicInfoResponse_QNAME, GetMedicareMemberLatestDemographicInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicareMemberDemographicInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "memberDemographicInfoList")
    public JAXBElement<MedicareMemberDemographicInfoList> createMemberDemographicInfoList(MedicareMemberDemographicInfoList value) {
        return new JAXBElement<MedicareMemberDemographicInfoList>(_MemberDemographicInfoList_QNAME, MedicareMemberDemographicInfoList.class, null, value);
    }

}
