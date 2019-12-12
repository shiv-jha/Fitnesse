
package com.optum.rqns.services.medicareEligiblityProd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.medicareEligiblityProd package. 
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

    private final static QName _GetEligibleMcaidMembersByGlbMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMcaidMembersByGlbMbrIDAndClientResponse");
    private final static QName _MedicaidMemberEligibilityInfo_QNAME = new QName("http://services.rqns.optum.com/", "MedicaidMemberEligibilityInfo");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetEligibleMcaidMembersByMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMcaidMembersByMbrIDAndClientResponse");
    private final static QName _GetEligibleMcaidMembersByGlbMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMcaidMembersByGlbMbrIDAndClient");
    private final static QName _MedicaidMemberEligibilityDetails_QNAME = new QName("http://services.rqns.optum.com/", "MedicaidMemberEligibilityDetails");
    private final static QName _GetEligibleMCAIDMembersByGlbMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMCAIDMembersByGlbMbrIDAndClient");
    private final static QName _GetEligibleMcaidMembersByMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleMcaidMembersByMbrIDAndClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.medicareEligiblityProd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEligibleMcaidMembersByGlbMbrIDAndClient }
     * 
     */
    public GetEligibleMcaidMembersByGlbMbrIDAndClient createGetEligibleMcaidMembersByGlbMbrIDAndClient() {
        return new GetEligibleMcaidMembersByGlbMbrIDAndClient();
    }

    /**
     * Create an instance of {@link GetEligibleMcaidMembersByMbrIDAndClient }
     * 
     */
    public GetEligibleMcaidMembersByMbrIDAndClient createGetEligibleMcaidMembersByMbrIDAndClient() {
        return new GetEligibleMcaidMembersByMbrIDAndClient();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetEligibleMcaidMembersByMbrIDAndClientResponse }
     * 
     */
    public GetEligibleMcaidMembersByMbrIDAndClientResponse createGetEligibleMcaidMembersByMbrIDAndClientResponse() {
        return new GetEligibleMcaidMembersByMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link MedicaidMemberEligibilityDetails }
     * 
     */
    public MedicaidMemberEligibilityDetails createMedicaidMemberEligibilityDetails() {
        return new MedicaidMemberEligibilityDetails();
    }

    /**
     * Create an instance of {@link MedicaidMemberEligibilityInfo }
     * 
     */
    public MedicaidMemberEligibilityInfo createMedicaidMemberEligibilityInfo() {
        return new MedicaidMemberEligibilityInfo();
    }

    /**
     * Create an instance of {@link GetEligibleMcaidMembersByGlbMbrIDAndClientResponse }
     * 
     */
    public GetEligibleMcaidMembersByGlbMbrIDAndClientResponse createGetEligibleMcaidMembersByGlbMbrIDAndClientResponse() {
        return new GetEligibleMcaidMembersByGlbMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMcaidMembersByGlbMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMcaidMembersByGlbMbrIDAndClientResponse")
    public JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClientResponse> createGetEligibleMcaidMembersByGlbMbrIDAndClientResponse(GetEligibleMcaidMembersByGlbMbrIDAndClientResponse value) {
        return new JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClientResponse>(_GetEligibleMcaidMembersByGlbMbrIDAndClientResponse_QNAME, GetEligibleMcaidMembersByGlbMbrIDAndClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicaidMemberEligibilityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "MedicaidMemberEligibilityInfo")
    public JAXBElement<MedicaidMemberEligibilityInfo> createMedicaidMemberEligibilityInfo(MedicaidMemberEligibilityInfo value) {
        return new JAXBElement<MedicaidMemberEligibilityInfo>(_MedicaidMemberEligibilityInfo_QNAME, MedicaidMemberEligibilityInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMcaidMembersByMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMcaidMembersByMbrIDAndClientResponse")
    public JAXBElement<GetEligibleMcaidMembersByMbrIDAndClientResponse> createGetEligibleMcaidMembersByMbrIDAndClientResponse(GetEligibleMcaidMembersByMbrIDAndClientResponse value) {
        return new JAXBElement<GetEligibleMcaidMembersByMbrIDAndClientResponse>(_GetEligibleMcaidMembersByMbrIDAndClientResponse_QNAME, GetEligibleMcaidMembersByMbrIDAndClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMcaidMembersByGlbMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMcaidMembersByGlbMbrIDAndClient")
    public JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClient> createGetEligibleMcaidMembersByGlbMbrIDAndClient(GetEligibleMcaidMembersByGlbMbrIDAndClient value) {
        return new JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClient>(_GetEligibleMcaidMembersByGlbMbrIDAndClient_QNAME, GetEligibleMcaidMembersByGlbMbrIDAndClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicaidMemberEligibilityDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "MedicaidMemberEligibilityDetails")
    public JAXBElement<MedicaidMemberEligibilityDetails> createMedicaidMemberEligibilityDetails(MedicaidMemberEligibilityDetails value) {
        return new JAXBElement<MedicaidMemberEligibilityDetails>(_MedicaidMemberEligibilityDetails_QNAME, MedicaidMemberEligibilityDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMcaidMembersByGlbMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMCAIDMembersByGlbMbrIDAndClient")
    public JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClient> createGetEligibleMCAIDMembersByGlbMbrIDAndClient(GetEligibleMcaidMembersByGlbMbrIDAndClient value) {
        return new JAXBElement<GetEligibleMcaidMembersByGlbMbrIDAndClient>(_GetEligibleMCAIDMembersByGlbMbrIDAndClient_QNAME, GetEligibleMcaidMembersByGlbMbrIDAndClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleMcaidMembersByMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleMcaidMembersByMbrIDAndClient")
    public JAXBElement<GetEligibleMcaidMembersByMbrIDAndClient> createGetEligibleMcaidMembersByMbrIDAndClient(GetEligibleMcaidMembersByMbrIDAndClient value) {
        return new JAXBElement<GetEligibleMcaidMembersByMbrIDAndClient>(_GetEligibleMcaidMembersByMbrIDAndClient_QNAME, GetEligibleMcaidMembersByMbrIDAndClient.class, null, value);
    }

}
