package com.optum.rqns.services.medicareEligiblity;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The service name for MemberEligibilityService
 *
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T15:17:36.324+05:30
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "memberEligibilityServicev2", 
                  wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/memberEligibilityServicev2?wsdl",
                  targetNamespace = "http://services.rqns.optum.com/") 
public class MemberEligibilityServicev2_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.rqns.optum.com/", "memberEligibilityServicev2");
    public final static QName MemberEligibilityServiceImplv2Port = new QName("http://services.rqns.optum.com/", "MemberEligibilityServiceImplv2Port");
    static {
        URL url = null;
        try {
            url = new URL("https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/memberEligibilityServicev2?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MemberEligibilityServicev2_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/memberEligibilityServicev2?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MemberEligibilityServicev2_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MemberEligibilityServicev2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MemberEligibilityServicev2_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberEligibilityServicev2_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberEligibilityServicev2_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public MemberEligibilityServicev2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * The service port for MemberEligibilityService
     *
     * @return
     *     returns MemberEligibilityServicev2
     */
    @WebEndpoint(name = "MemberEligibilityServiceImplv2Port")
    public MemberEligibilityServicev2 getMemberEligibilityServiceImplv2Port() {
        return super.getPort(MemberEligibilityServiceImplv2Port, MemberEligibilityServicev2.class);
    }

    /**
     * The service port for MemberEligibilityService
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MemberEligibilityServicev2
     */
    @WebEndpoint(name = "MemberEligibilityServiceImplv2Port")
    public MemberEligibilityServicev2 getMemberEligibilityServiceImplv2Port(WebServiceFeature... features) {
        return super.getPort(MemberEligibilityServiceImplv2Port, MemberEligibilityServicev2.class, features);
    }

}
