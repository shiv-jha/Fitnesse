
package com.optum.rqns.services.supplemental;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.supplemental package. 
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

    private final static QName _AddSupplementalInfo_QNAME = new QName("http://services.rqns.optum.com/", "addSupplementalInfo");
    private final static QName _AddSupplementalInfoResponse_QNAME = new QName("http://services.rqns.optum.com/", "addSupplementalInfoResponse");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.supplemental
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddSupplementalInfo }
     * 
     */
    public AddSupplementalInfo createAddSupplementalInfo() {
        return new AddSupplementalInfo();
    }

    /**
     * Create an instance of {@link AddSupplementalInfoResponse }
     * 
     */
    public AddSupplementalInfoResponse createAddSupplementalInfoResponse() {
        return new AddSupplementalInfoResponse();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link SupplementalInfo }
     * 
     */
    public SupplementalInfo createSupplementalInfo() {
        return new SupplementalInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSupplementalInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "addSupplementalInfo")
    public JAXBElement<AddSupplementalInfo> createAddSupplementalInfo(AddSupplementalInfo value) {
        return new JAXBElement<AddSupplementalInfo>(_AddSupplementalInfo_QNAME, AddSupplementalInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSupplementalInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "addSupplementalInfoResponse")
    public JAXBElement<AddSupplementalInfoResponse> createAddSupplementalInfoResponse(AddSupplementalInfoResponse value) {
        return new JAXBElement<AddSupplementalInfoResponse>(_AddSupplementalInfoResponse_QNAME, AddSupplementalInfoResponse.class, null, value);
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
