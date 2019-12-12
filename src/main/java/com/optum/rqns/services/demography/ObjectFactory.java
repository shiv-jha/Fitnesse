
package com.optum.rqns.services.demography;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.demography package. 
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

    private final static QName _AcaMemberDemographicInfo_QNAME = new QName("http://services.rqns.optum.com/", "AcaMemberDemographicInfo");
    private final static QName _GetAcaMemberDemographicInfoByGlbMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getAcaMemberDemographicInfoByGlbMbrIDAndClient");
    private final static QName _GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getAcaMemberDemographicInfoByGlbMbrIDAndClientResponse");
    private final static QName _AcaMemberDemographicDetails_QNAME = new QName("http://services.rqns.optum.com/", "AcaMemberDemographicDetails");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetAcaMemberDemographicInfoByMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getAcaMemberDemographicInfoByMbrIDAndClientResponse");
    private final static QName _GetAcaMemberDemographicInfoByMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getAcaMemberDemographicInfoByMbrIDAndClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.demography
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcaMemberDemographicDetails }
     * 
     */
    public AcaMemberDemographicDetails createAcaMemberDemographicDetails() {
        return new AcaMemberDemographicDetails();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetAcaMemberDemographicInfoByMbrIDAndClientResponse }
     * 
     */
    public GetAcaMemberDemographicInfoByMbrIDAndClientResponse createGetAcaMemberDemographicInfoByMbrIDAndClientResponse() {
        return new GetAcaMemberDemographicInfoByMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link GetAcaMemberDemographicInfoByMbrIDAndClient }
     * 
     */
    public GetAcaMemberDemographicInfoByMbrIDAndClient createGetAcaMemberDemographicInfoByMbrIDAndClient() {
        return new GetAcaMemberDemographicInfoByMbrIDAndClient();
    }

    /**
     * Create an instance of {@link GetAcaMemberDemographicInfoByGlbMbrIDAndClient }
     * 
     */
    public GetAcaMemberDemographicInfoByGlbMbrIDAndClient createGetAcaMemberDemographicInfoByGlbMbrIDAndClient() {
        return new GetAcaMemberDemographicInfoByGlbMbrIDAndClient();
    }

    /**
     * Create an instance of {@link GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse }
     * 
     */
    public GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse createGetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse() {
        return new GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link AcaMemberDemographicInfo }
     * 
     */
    public AcaMemberDemographicInfo createAcaMemberDemographicInfo() {
        return new AcaMemberDemographicInfo();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcaMemberDemographicInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "AcaMemberDemographicInfo")
    public JAXBElement<AcaMemberDemographicInfo> createAcaMemberDemographicInfo(AcaMemberDemographicInfo value) {
        return new JAXBElement<AcaMemberDemographicInfo>(_AcaMemberDemographicInfo_QNAME, AcaMemberDemographicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcaMemberDemographicInfoByGlbMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getAcaMemberDemographicInfoByGlbMbrIDAndClient")
    public JAXBElement<GetAcaMemberDemographicInfoByGlbMbrIDAndClient> createGetAcaMemberDemographicInfoByGlbMbrIDAndClient(GetAcaMemberDemographicInfoByGlbMbrIDAndClient value) {
        return new JAXBElement<GetAcaMemberDemographicInfoByGlbMbrIDAndClient>(_GetAcaMemberDemographicInfoByGlbMbrIDAndClient_QNAME, GetAcaMemberDemographicInfoByGlbMbrIDAndClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getAcaMemberDemographicInfoByGlbMbrIDAndClientResponse")
    public JAXBElement<GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse> createGetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse(GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse value) {
        return new JAXBElement<GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse>(_GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse_QNAME, GetAcaMemberDemographicInfoByGlbMbrIDAndClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcaMemberDemographicDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "AcaMemberDemographicDetails")
    public JAXBElement<AcaMemberDemographicDetails> createAcaMemberDemographicDetails(AcaMemberDemographicDetails value) {
        return new JAXBElement<AcaMemberDemographicDetails>(_AcaMemberDemographicDetails_QNAME, AcaMemberDemographicDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcaMemberDemographicInfoByMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getAcaMemberDemographicInfoByMbrIDAndClientResponse")
    public JAXBElement<GetAcaMemberDemographicInfoByMbrIDAndClientResponse> createGetAcaMemberDemographicInfoByMbrIDAndClientResponse(GetAcaMemberDemographicInfoByMbrIDAndClientResponse value) {
        return new JAXBElement<GetAcaMemberDemographicInfoByMbrIDAndClientResponse>(_GetAcaMemberDemographicInfoByMbrIDAndClientResponse_QNAME, GetAcaMemberDemographicInfoByMbrIDAndClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAcaMemberDemographicInfoByMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getAcaMemberDemographicInfoByMbrIDAndClient")
    public JAXBElement<GetAcaMemberDemographicInfoByMbrIDAndClient> createGetAcaMemberDemographicInfoByMbrIDAndClient(GetAcaMemberDemographicInfoByMbrIDAndClient value) {
        return new JAXBElement<GetAcaMemberDemographicInfoByMbrIDAndClient>(_GetAcaMemberDemographicInfoByMbrIDAndClient_QNAME, GetAcaMemberDemographicInfoByMbrIDAndClient.class, null, value);
    }

}
