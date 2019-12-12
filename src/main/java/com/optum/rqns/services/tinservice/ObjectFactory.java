
package com.optum.rqns.services.tinservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.tinservice package. 
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

    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetProviderTinInfoResponse_QNAME = new QName("http://services.rqns.optum.com/", "getProviderTinInfoResponse");
    private final static QName _ProviderTinInfo_QNAME = new QName("http://services.rqns.optum.com/", "providerTinInfo");
    private final static QName _GetProviderTinInfo_QNAME = new QName("http://services.rqns.optum.com/", "getProviderTinInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.tinservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProviderTinInfo }
     * 
     */
    public GetProviderTinInfo createGetProviderTinInfo() {
        return new GetProviderTinInfo();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetProviderTinInfoResponse }
     * 
     */
    public GetProviderTinInfoResponse createGetProviderTinInfoResponse() {
        return new GetProviderTinInfoResponse();
    }

    /**
     * Create an instance of {@link ProviderTinInfo }
     * 
     */
    public ProviderTinInfo createProviderTinInfo() {
        return new ProviderTinInfo();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderTinInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getProviderTinInfoResponse")
    public JAXBElement<GetProviderTinInfoResponse> createGetProviderTinInfoResponse(GetProviderTinInfoResponse value) {
        return new JAXBElement<GetProviderTinInfoResponse>(_GetProviderTinInfoResponse_QNAME, GetProviderTinInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTinInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "providerTinInfo")
    public JAXBElement<ProviderTinInfo> createProviderTinInfo(ProviderTinInfo value) {
        return new JAXBElement<ProviderTinInfo>(_ProviderTinInfo_QNAME, ProviderTinInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderTinInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getProviderTinInfo")
    public JAXBElement<GetProviderTinInfo> createGetProviderTinInfo(GetProviderTinInfo value) {
        return new JAXBElement<GetProviderTinInfo>(_GetProviderTinInfo_QNAME, GetProviderTinInfo.class, null, value);
    }

}
