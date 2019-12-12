
package com.optum.rqns.services.hicTest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.hicTest package. 
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

    private final static QName _GetHicHistoryResponse_QNAME = new QName("http://services.rqns.optum.com/", "getHicHistoryResponse");
    private final static QName _GetHicHistory_QNAME = new QName("http://services.rqns.optum.com/", "getHicHistory");
    private final static QName _HicDetails_QNAME = new QName("http://services.rqns.optum.com/", "hicDetails");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.hicTest
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
     * Create an instance of {@link GetHicHistoryResponse }
     * 
     */
    public GetHicHistoryResponse createGetHicHistoryResponse() {
        return new GetHicHistoryResponse();
    }

    /**
     * Create an instance of {@link GetHicHistory }
     * 
     */
    public GetHicHistory createGetHicHistory() {
        return new GetHicHistory();
    }

    /**
     * Create an instance of {@link HicDetails }
     * 
     */
    public HicDetails createHicDetails() {
        return new HicDetails();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHicHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getHicHistoryResponse")
    public JAXBElement<GetHicHistoryResponse> createGetHicHistoryResponse(GetHicHistoryResponse value) {
        return new JAXBElement<GetHicHistoryResponse>(_GetHicHistoryResponse_QNAME, GetHicHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHicHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getHicHistory")
    public JAXBElement<GetHicHistory> createGetHicHistory(GetHicHistory value) {
        return new JAXBElement<GetHicHistory>(_GetHicHistory_QNAME, GetHicHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HicDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "hicDetails")
    public JAXBElement<HicDetails> createHicDetails(HicDetails value) {
        return new JAXBElement<HicDetails>(_HicDetails_QNAME, HicDetails.class, null, value);
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
