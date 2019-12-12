
package com.optum.rqns.services.eligiblity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.eligiblity package. 
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

    private final static QName _GetEligibleAcaMembersByMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleAcaMembersByMbrIDAndClient");
    private final static QName _AcaMemberEligibilityInfo_QNAME = new QName("http://services.rqns.optum.com/", "AcaMemberEligibilityInfo");
    private final static QName _GetEligibleAcaMembersByGlbMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleAcaMembersByGlbMbrIDAndClientResponse");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetEligibleAcaMembersByMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleAcaMembersByMbrIDAndClientResponse");
    private final static QName _GetEligibleAcaMembersByGlbMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getEligibleAcaMembersByGlbMbrIDAndClient");
    private final static QName _AcaMemberEligibilityDetails_QNAME = new QName("http://services.rqns.optum.com/", "AcaMemberEligibilityDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.eligiblity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEligibleAcaMembersByGlbMbrIDAndClient }
     * 
     */
    public GetEligibleAcaMembersByGlbMbrIDAndClient createGetEligibleAcaMembersByGlbMbrIDAndClient() {
        return new GetEligibleAcaMembersByGlbMbrIDAndClient();
    }

    /**
     * Create an instance of {@link AcaMemberEligibilityDetails }
     * 
     */
    public AcaMemberEligibilityDetails createAcaMemberEligibilityDetails() {
        return new AcaMemberEligibilityDetails();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetEligibleAcaMembersByMbrIDAndClientResponse }
     * 
     */
    public GetEligibleAcaMembersByMbrIDAndClientResponse createGetEligibleAcaMembersByMbrIDAndClientResponse() {
        return new GetEligibleAcaMembersByMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link AcaMemberEligibilityInfo }
     * 
     */
    public AcaMemberEligibilityInfo createAcaMemberEligibilityInfo() {
        return new AcaMemberEligibilityInfo();
    }

    /**
     * Create an instance of {@link GetEligibleAcaMembersByGlbMbrIDAndClientResponse }
     * 
     */
    public GetEligibleAcaMembersByGlbMbrIDAndClientResponse createGetEligibleAcaMembersByGlbMbrIDAndClientResponse() {
        return new GetEligibleAcaMembersByGlbMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link GetEligibleAcaMembersByMbrIDAndClient }
     * 
     */
    public GetEligibleAcaMembersByMbrIDAndClient createGetEligibleAcaMembersByMbrIDAndClient() {
        return new GetEligibleAcaMembersByMbrIDAndClient();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleAcaMembersByMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleAcaMembersByMbrIDAndClient")
    public JAXBElement<GetEligibleAcaMembersByMbrIDAndClient> createGetEligibleAcaMembersByMbrIDAndClient(GetEligibleAcaMembersByMbrIDAndClient value) {
        return new JAXBElement<GetEligibleAcaMembersByMbrIDAndClient>(_GetEligibleAcaMembersByMbrIDAndClient_QNAME, GetEligibleAcaMembersByMbrIDAndClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcaMemberEligibilityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "AcaMemberEligibilityInfo")
    public JAXBElement<AcaMemberEligibilityInfo> createAcaMemberEligibilityInfo(AcaMemberEligibilityInfo value) {
        return new JAXBElement<AcaMemberEligibilityInfo>(_AcaMemberEligibilityInfo_QNAME, AcaMemberEligibilityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleAcaMembersByGlbMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleAcaMembersByGlbMbrIDAndClientResponse")
    public JAXBElement<GetEligibleAcaMembersByGlbMbrIDAndClientResponse> createGetEligibleAcaMembersByGlbMbrIDAndClientResponse(GetEligibleAcaMembersByGlbMbrIDAndClientResponse value) {
        return new JAXBElement<GetEligibleAcaMembersByGlbMbrIDAndClientResponse>(_GetEligibleAcaMembersByGlbMbrIDAndClientResponse_QNAME, GetEligibleAcaMembersByGlbMbrIDAndClientResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleAcaMembersByMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleAcaMembersByMbrIDAndClientResponse")
    public JAXBElement<GetEligibleAcaMembersByMbrIDAndClientResponse> createGetEligibleAcaMembersByMbrIDAndClientResponse(GetEligibleAcaMembersByMbrIDAndClientResponse value) {
        return new JAXBElement<GetEligibleAcaMembersByMbrIDAndClientResponse>(_GetEligibleAcaMembersByMbrIDAndClientResponse_QNAME, GetEligibleAcaMembersByMbrIDAndClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEligibleAcaMembersByGlbMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getEligibleAcaMembersByGlbMbrIDAndClient")
    public JAXBElement<GetEligibleAcaMembersByGlbMbrIDAndClient> createGetEligibleAcaMembersByGlbMbrIDAndClient(GetEligibleAcaMembersByGlbMbrIDAndClient value) {
        return new JAXBElement<GetEligibleAcaMembersByGlbMbrIDAndClient>(_GetEligibleAcaMembersByGlbMbrIDAndClient_QNAME, GetEligibleAcaMembersByGlbMbrIDAndClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcaMemberEligibilityDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "AcaMemberEligibilityDetails")
    public JAXBElement<AcaMemberEligibilityDetails> createAcaMemberEligibilityDetails(AcaMemberEligibilityDetails value) {
        return new JAXBElement<AcaMemberEligibilityDetails>(_AcaMemberEligibilityDetails_QNAME, AcaMemberEligibilityDetails.class, null, value);
    }

}
