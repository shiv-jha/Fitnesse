
package com.optum.rqns.services.gap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.gap package. 
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

    private final static QName _AddGapStatusInfoResponse_QNAME = new QName("http://services.rqns.optum.com/", "addGapStatusInfoResponse");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _AddGapStatusInfo_QNAME = new QName("http://services.rqns.optum.com/", "addGapStatusInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.gap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddGapStatusInfo }
     * 
     */
    public AddGapStatusInfo createAddGapStatusInfo() {
        return new AddGapStatusInfo();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link AddGapStatusInfoResponse }
     * 
     */
    public AddGapStatusInfoResponse createAddGapStatusInfoResponse() {
        return new AddGapStatusInfoResponse();
    }

    /**
     * Create an instance of {@link GapStatusInfo }
     * 
     */
    public GapStatusInfo createGapStatusInfo() {
        return new GapStatusInfo();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGapStatusInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "addGapStatusInfoResponse")
    public JAXBElement<AddGapStatusInfoResponse> createAddGapStatusInfoResponse(AddGapStatusInfoResponse value) {
        return new JAXBElement<AddGapStatusInfoResponse>(_AddGapStatusInfoResponse_QNAME, AddGapStatusInfoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGapStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "addGapStatusInfo")
    public JAXBElement<AddGapStatusInfo> createAddGapStatusInfo(AddGapStatusInfo value) {
        return new JAXBElement<AddGapStatusInfo>(_AddGapStatusInfo_QNAME, AddGapStatusInfo.class, null, value);
    }

}
