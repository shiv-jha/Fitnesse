
package com.optum.rqns.services.npiLookupStage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.optum.rqns.services.npiLookupStage package. 
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

    private final static QName _GetClientProviderInfoByProviderIDAndClientNameResponse_QNAME = new QName("http://services.rqns.optum.com/", "getClientProviderInfoByProviderIDAndClientNameResponse");
    private final static QName _GetClientProviderInfoByNpiAndClientName_QNAME = new QName("http://services.rqns.optum.com/", "getClientProviderInfoByNpiAndClientName");
    private final static QName _GetClientP360ProviderInfoByGlobalID_QNAME = new QName("http://services.rqns.optum.com/", "getClientP360ProviderInfoByGlobalID");
    private final static QName _GetClientP360ProviderInfoByGlobalIDResponse_QNAME = new QName("http://services.rqns.optum.com/", "getClientP360ProviderInfoByGlobalIDResponse");
    private final static QName _GetClientProviderInfoByNpiAndClientNameResponse_QNAME = new QName("http://services.rqns.optum.com/", "getClientProviderInfoByNpiAndClientNameResponse");
    private final static QName _ServiceException_QNAME = new QName("http://services.rqns.optum.com/", "ServiceException");
    private final static QName _GetNppesProviderInfoByNpiResponse_QNAME = new QName("http://services.rqns.optum.com/", "getNppesProviderInfoByNpiResponse");
    private final static QName _GetNppesProviderInfoByNpi_QNAME = new QName("http://services.rqns.optum.com/", "getNppesProviderInfoByNpi");
    private final static QName _GetClientProviderInfoByProviderIDAndClientName_QNAME = new QName("http://services.rqns.optum.com/", "getClientProviderInfoByProviderIDAndClientName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.optum.rqns.services.npiLookupStage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClientP360ProviderInfoByGlobalID }
     * 
     */
    public GetClientP360ProviderInfoByGlobalID createGetClientP360ProviderInfoByGlobalID() {
        return new GetClientP360ProviderInfoByGlobalID();
    }

    /**
     * Create an instance of {@link GetClientP360ProviderInfoByGlobalIDResponse }
     * 
     */
    public GetClientP360ProviderInfoByGlobalIDResponse createGetClientP360ProviderInfoByGlobalIDResponse() {
        return new GetClientP360ProviderInfoByGlobalIDResponse();
    }

    /**
     * Create an instance of {@link GetClientProviderInfoByNpiAndClientNameResponse }
     * 
     */
    public GetClientProviderInfoByNpiAndClientNameResponse createGetClientProviderInfoByNpiAndClientNameResponse() {
        return new GetClientProviderInfoByNpiAndClientNameResponse();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link GetNppesProviderInfoByNpiResponse }
     * 
     */
    public GetNppesProviderInfoByNpiResponse createGetNppesProviderInfoByNpiResponse() {
        return new GetNppesProviderInfoByNpiResponse();
    }

    /**
     * Create an instance of {@link GetNppesProviderInfoByNpi }
     * 
     */
    public GetNppesProviderInfoByNpi createGetNppesProviderInfoByNpi() {
        return new GetNppesProviderInfoByNpi();
    }

    /**
     * Create an instance of {@link GetClientProviderInfoByProviderIDAndClientName }
     * 
     */
    public GetClientProviderInfoByProviderIDAndClientName createGetClientProviderInfoByProviderIDAndClientName() {
        return new GetClientProviderInfoByProviderIDAndClientName();
    }

    /**
     * Create an instance of {@link GetClientProviderInfoByNpiAndClientName }
     * 
     */
    public GetClientProviderInfoByNpiAndClientName createGetClientProviderInfoByNpiAndClientName() {
        return new GetClientProviderInfoByNpiAndClientName();
    }

    /**
     * Create an instance of {@link GetClientProviderInfoByProviderIDAndClientNameResponse }
     * 
     */
    public GetClientProviderInfoByProviderIDAndClientNameResponse createGetClientProviderInfoByProviderIDAndClientNameResponse() {
        return new GetClientProviderInfoByProviderIDAndClientNameResponse();
    }

    /**
     * Create an instance of {@link ProviderAffiliationDetails }
     * 
     */
    public ProviderAffiliationDetails createProviderAffiliationDetails() {
        return new ProviderAffiliationDetails();
    }

    /**
     * Create an instance of {@link ProviderAffiliationInfo }
     * 
     */
    public ProviderAffiliationInfo createProviderAffiliationInfo() {
        return new ProviderAffiliationInfo();
    }

    /**
     * Create an instance of {@link ProviderAddressDetails }
     * 
     */
    public ProviderAddressDetails createProviderAddressDetails() {
        return new ProviderAddressDetails();
    }

    /**
     * Create an instance of {@link ProviderAddressInfo }
     * 
     */
    public ProviderAddressInfo createProviderAddressInfo() {
        return new ProviderAddressInfo();
    }

    /**
     * Create an instance of {@link ProviderDemographicInfo }
     * 
     */
    public ProviderDemographicInfo createProviderDemographicInfo() {
        return new ProviderDemographicInfo();
    }

    /**
     * Create an instance of {@link ProviderDemographicDetails }
     * 
     */
    public ProviderDemographicDetails createProviderDemographicDetails() {
        return new ProviderDemographicDetails();
    }

    /**
     * Create an instance of {@link ProviderDetails }
     * 
     */
    public ProviderDetails createProviderDetails() {
        return new ProviderDetails();
    }

    /**
     * Create an instance of {@link ServiceMetaData }
     * 
     */
    public ServiceMetaData createServiceMetaData() {
        return new ServiceMetaData();
    }

    /**
     * Create an instance of {@link ProviderInfo }
     * 
     */
    public ProviderInfo createProviderInfo() {
        return new ProviderInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProviderInfoByProviderIDAndClientNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientProviderInfoByProviderIDAndClientNameResponse")
    public JAXBElement<GetClientProviderInfoByProviderIDAndClientNameResponse> createGetClientProviderInfoByProviderIDAndClientNameResponse(GetClientProviderInfoByProviderIDAndClientNameResponse value) {
        return new JAXBElement<GetClientProviderInfoByProviderIDAndClientNameResponse>(_GetClientProviderInfoByProviderIDAndClientNameResponse_QNAME, GetClientProviderInfoByProviderIDAndClientNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProviderInfoByNpiAndClientName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientProviderInfoByNpiAndClientName")
    public JAXBElement<GetClientProviderInfoByNpiAndClientName> createGetClientProviderInfoByNpiAndClientName(GetClientProviderInfoByNpiAndClientName value) {
        return new JAXBElement<GetClientProviderInfoByNpiAndClientName>(_GetClientProviderInfoByNpiAndClientName_QNAME, GetClientProviderInfoByNpiAndClientName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientP360ProviderInfoByGlobalID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientP360ProviderInfoByGlobalID")
    public JAXBElement<GetClientP360ProviderInfoByGlobalID> createGetClientP360ProviderInfoByGlobalID(GetClientP360ProviderInfoByGlobalID value) {
        return new JAXBElement<GetClientP360ProviderInfoByGlobalID>(_GetClientP360ProviderInfoByGlobalID_QNAME, GetClientP360ProviderInfoByGlobalID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientP360ProviderInfoByGlobalIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientP360ProviderInfoByGlobalIDResponse")
    public JAXBElement<GetClientP360ProviderInfoByGlobalIDResponse> createGetClientP360ProviderInfoByGlobalIDResponse(GetClientP360ProviderInfoByGlobalIDResponse value) {
        return new JAXBElement<GetClientP360ProviderInfoByGlobalIDResponse>(_GetClientP360ProviderInfoByGlobalIDResponse_QNAME, GetClientP360ProviderInfoByGlobalIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProviderInfoByNpiAndClientNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientProviderInfoByNpiAndClientNameResponse")
    public JAXBElement<GetClientProviderInfoByNpiAndClientNameResponse> createGetClientProviderInfoByNpiAndClientNameResponse(GetClientProviderInfoByNpiAndClientNameResponse value) {
        return new JAXBElement<GetClientProviderInfoByNpiAndClientNameResponse>(_GetClientProviderInfoByNpiAndClientNameResponse_QNAME, GetClientProviderInfoByNpiAndClientNameResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNppesProviderInfoByNpiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getNppesProviderInfoByNpiResponse")
    public JAXBElement<GetNppesProviderInfoByNpiResponse> createGetNppesProviderInfoByNpiResponse(GetNppesProviderInfoByNpiResponse value) {
        return new JAXBElement<GetNppesProviderInfoByNpiResponse>(_GetNppesProviderInfoByNpiResponse_QNAME, GetNppesProviderInfoByNpiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNppesProviderInfoByNpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getNppesProviderInfoByNpi")
    public JAXBElement<GetNppesProviderInfoByNpi> createGetNppesProviderInfoByNpi(GetNppesProviderInfoByNpi value) {
        return new JAXBElement<GetNppesProviderInfoByNpi>(_GetNppesProviderInfoByNpi_QNAME, GetNppesProviderInfoByNpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientProviderInfoByProviderIDAndClientName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.rqns.optum.com/", name = "getClientProviderInfoByProviderIDAndClientName")
    public JAXBElement<GetClientProviderInfoByProviderIDAndClientName> createGetClientProviderInfoByProviderIDAndClientName(GetClientProviderInfoByProviderIDAndClientName value) {
        return new JAXBElement<GetClientProviderInfoByProviderIDAndClientName>(_GetClientProviderInfoByProviderIDAndClientName_QNAME, GetClientProviderInfoByProviderIDAndClientName.class, null, value);
    }

}
