package com.optum.rqns.services.eligiblityTest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The service name for AcaMemberEligibilityService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-26T19:53:03.518+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "AcaMemberEligibilityService", 
                  wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/AcaMemberEligibilityService?wsdl",
                  targetNamespace = "http://services.rqns.optum.com/") 
public class AcaMemberEligibilityService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.rqns.optum.com/", "AcaMemberEligibilityService");
    public final static QName AcaMemberEligibilityServiceImplPort = new QName("http://services.rqns.optum.com/", "AcaMemberEligibilityServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/AcaMemberEligibilityService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AcaMemberEligibilityService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/AcaMemberEligibilityService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AcaMemberEligibilityService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AcaMemberEligibilityService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AcaMemberEligibilityService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcaMemberEligibilityService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcaMemberEligibilityService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AcaMemberEligibilityService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * The service port for AcaMemberEligibilityService
     *
     * @return
     *     returns AcaMemberEligibilityService
     */
    @WebEndpoint(name = "AcaMemberEligibilityServiceImplPort")
    public AcaMemberEligibilityService getAcaMemberEligibilityServiceImplPort() {
        return super.getPort(AcaMemberEligibilityServiceImplPort, AcaMemberEligibilityService.class);
    }

    /**
     * The service port for AcaMemberEligibilityService
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AcaMemberEligibilityService
     */
    @WebEndpoint(name = "AcaMemberEligibilityServiceImplPort")
    public AcaMemberEligibilityService getAcaMemberEligibilityServiceImplPort(WebServiceFeature... features) {
        return super.getPort(AcaMemberEligibilityServiceImplPort, AcaMemberEligibilityService.class, features);
    }

}