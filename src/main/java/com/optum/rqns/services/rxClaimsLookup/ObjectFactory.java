
package com.optum.rqns.services.rxClaimsLookup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.rxClaimsLookup package. 
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

    private final static QName _RXClaimsInfo_QNAME = new QName("http://services.rqns.optum.com/", "RXClaimsInfo");
    private final static QName _RXClaimDetails_QNAME = new QName("http://services.rqns.optum.com/", "RXClaimDetails");
    private final static QName _GetRXClaimsByMbrIDAndClient_QNAME = new QName("http://services.rqns.optum.com/", "getRXClaimsByMbrIDAndClient");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetRXClaimsByMbrIDAndClientResponse_QNAME = new QName("http://services.rqns.optum.com/", "getRXClaimsByMbrIDAndClientResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.rxClaimsLookup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetRXClaimsByMbrIDAndClientResponse }
     * 
     */
    public GetRXClaimsByMbrIDAndClientResponse createGetRXClaimsByMbrIDAndClientResponse() {
        return new GetRXClaimsByMbrIDAndClientResponse();
    }

    /**
     * Create an instance of {@link RxClaimsInfo }
     * 
     */
    public RxClaimsInfo createRxClaimsInfo() {
        return new RxClaimsInfo();
    }

    /**
     * Create an instance of {@link RxClaimDetails }
     * 
     */
    public RxClaimDetails createRxClaimDetails() {
        return new RxClaimDetails();
    }

    /**
     * Create an instance of {@link GetRXClaimsByMbrIDAndClient }
     * 
     */
    public GetRXClaimsByMbrIDAndClient createGetRXClaimsByMbrIDAndClient() {
        return new GetRXClaimsByMbrIDAndClient();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RxClaimsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "RXClaimsInfo")
    public JAXBElement<RxClaimsInfo> createRXClaimsInfo(RxClaimsInfo value) {
        return new JAXBElement<RxClaimsInfo>(_RXClaimsInfo_QNAME, RxClaimsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RxClaimDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "RXClaimDetails")
    public JAXBElement<RxClaimDetails> createRXClaimDetails(RxClaimDetails value) {
        return new JAXBElement<RxClaimDetails>(_RXClaimDetails_QNAME, RxClaimDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRXClaimsByMbrIDAndClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getRXClaimsByMbrIDAndClient")
    public JAXBElement<GetRXClaimsByMbrIDAndClient> createGetRXClaimsByMbrIDAndClient(GetRXClaimsByMbrIDAndClient value) {
        return new JAXBElement<GetRXClaimsByMbrIDAndClient>(_GetRXClaimsByMbrIDAndClient_QNAME, GetRXClaimsByMbrIDAndClient.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRXClaimsByMbrIDAndClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getRXClaimsByMbrIDAndClientResponse")
    public JAXBElement<GetRXClaimsByMbrIDAndClientResponse> createGetRXClaimsByMbrIDAndClientResponse(GetRXClaimsByMbrIDAndClientResponse value) {
        return new JAXBElement<GetRXClaimsByMbrIDAndClientResponse>(_GetRXClaimsByMbrIDAndClientResponse_QNAME, GetRXClaimsByMbrIDAndClientResponse.class, null, value);
    }

}
