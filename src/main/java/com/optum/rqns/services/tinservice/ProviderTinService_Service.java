package com.optum.rqns.services.tinservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The service name for ProviderTinService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-25T16:49:48.791+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "providerTinService", 
                  wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/providerTinService?wsdl",
                  targetNamespace = "http://services.rqns.optum.com/") 
public class ProviderTinService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.rqns.optum.com/", "providerTinService");
    public final static QName ProviderTinServiceImplPort = new QName("http://services.rqns.optum.com/", "ProviderTinServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/providerTinService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ProviderTinService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/providerTinService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ProviderTinService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ProviderTinService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderTinService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProviderTinService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProviderTinService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ProviderTinService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * The service port for ProviderTinService
     *
     * @return
     *     returns ProviderTinService
     */
    @WebEndpoint(name = "ProviderTinServiceImplPort")
    public ProviderTinService getProviderTinServiceImplPort() {
        return super.getPort(ProviderTinServiceImplPort, ProviderTinService.class);
    }

    /**
     * The service port for ProviderTinService
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderTinService
     */
    @WebEndpoint(name = "ProviderTinServiceImplPort")
    public ProviderTinService getProviderTinServiceImplPort(WebServiceFeature... features) {
        return super.getPort(ProviderTinServiceImplPort, ProviderTinService.class, features);
    }

}
