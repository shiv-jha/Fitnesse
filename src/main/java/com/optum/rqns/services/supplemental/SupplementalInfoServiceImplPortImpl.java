
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.supplemental;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-07-03T10:34:37.776-05:00
 * Generated source version: 3.1.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "SupplementalInfoService",
                      portName = "SupplementalInfoServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/rqns-services-web/services/SupplementalInfoService?wsdl",
                      endpointInterface = "com.optum.rqns.services.supplemental.SupplementalInfoService")
                      
public class SupplementalInfoServiceImplPortImpl implements SupplementalInfoService {

    private static final Logger LOG = Logger.getLogger(SupplementalInfoServiceImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.supplemental.SupplementalInfoService#addSupplementalInfo(com.optum.rqns.services.supplemental.ServiceMetaData serviceMetaData, com.optum.rqns.services.supplemental.SupplementalInfo supplementalInfo, java.lang.Integer responseCode, java.lang.String responseMessage)*
     */
    public void addSupplementalInfo(com.optum.rqns.services.supplemental.ServiceMetaData serviceMetaData, com.optum.rqns.services.supplemental.SupplementalInfo supplementalInfo, javax.xml.ws.Holder<java.lang.Integer> responseCode, javax.xml.ws.Holder<java.lang.String> responseMessage) throws ServiceException_Exception   { 
        LOG.info("Executing operation addSupplementalInfo");
        System.out.println(serviceMetaData);
        System.out.println(supplementalInfo);
        try {
            java.lang.Integer responseCodeValue = Integer.valueOf(1099304312);
            responseCode.value = responseCodeValue;
            java.lang.String responseMessageValue = "responseMessageValue1737811773";
            responseMessage.value = responseMessageValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
