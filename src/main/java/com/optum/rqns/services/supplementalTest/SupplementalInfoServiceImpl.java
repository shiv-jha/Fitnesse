
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.supplementalTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-02T12:44:17.409+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "SupplementalInfoService",
                      portName = "SupplementalInfoServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8444/tst/rqns-services-web/services/SupplementalInfoService?wsdl",
                      endpointInterface = "com.optum.rqns.services.supplementalTest.SupplementalInfoService")
                      
public class SupplementalInfoServiceImpl implements SupplementalInfoService {

    private static final Logger LOG = Logger.getLogger(SupplementalInfoServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.supplementalTest.SupplementalInfoService#addSupplementalInfo(com.optum.rqns.services.supplementalTest.ServiceMetaData  serviceMetaData ,)com.optum.rqns.services.supplementalTest.SupplementalInfo  supplementalInfo ,)java.lang.Integer  responseCode ,)java.lang.String  responseMessage )*
     */
    public void addSupplementalInfo(com.optum.rqns.services.supplementalTest.ServiceMetaData serviceMetaData,com.optum.rqns.services.supplementalTest.SupplementalInfo supplementalInfo,javax.xml.ws.Holder<java.lang.Integer> responseCode,javax.xml.ws.Holder<java.lang.String> responseMessage) throws ServiceException_Exception    { 
        LOG.info("Executing operation addSupplementalInfo");
        System.out.println(serviceMetaData);
        System.out.println(supplementalInfo);
        try {
            java.lang.Integer responseCodeValue = Integer.valueOf(733038574);
            responseCode.value = responseCodeValue;
            java.lang.String responseMessageValue = "responseMessageValue291602782";
            responseMessage.value = responseMessageValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
