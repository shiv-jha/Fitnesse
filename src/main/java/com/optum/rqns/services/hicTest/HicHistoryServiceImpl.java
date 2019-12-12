
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.hicTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-26T19:47:22.822+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "hicHistoryService",
                      portName = "HicHistoryServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/hicHistoryService?wsdl",
                      endpointInterface = "com.optum.rqns.services.hicTest.HicHistoryService")
                      
public class HicHistoryServiceImpl implements HicHistoryService {

    private static final Logger LOG = Logger.getLogger(HicHistoryServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.hicTest.HicHistoryService#getHicHistory(java.lang.String  hicNumber ,)com.optum.rqns.services.hicTest.ServiceMetaData  metaData ,)java.lang.String  inputHicNumber ,)java.lang.Integer  hicCount ,)java.util.List<com.optum.rqns.services.hicTest.HicDetails>  hicDetails ,)java.lang.String  errorMsg )*
     */
    public void getHicHistory(java.lang.String hicNumber,com.optum.rqns.services.hicTest.ServiceMetaData metaData,javax.xml.ws.Holder<java.lang.String> inputHicNumber,javax.xml.ws.Holder<java.lang.Integer> hicCount,javax.xml.ws.Holder<java.util.List<com.optum.rqns.services.hicTest.HicDetails>> hicDetails,javax.xml.ws.Holder<java.lang.String> errorMsg) throws ServiceException_Exception    { 
        LOG.info("Executing operation getHicHistory");
        System.out.println(hicNumber);
        System.out.println(metaData);
        try {
            java.lang.String inputHicNumberValue = "inputHicNumberValue90413396";
            inputHicNumber.value = inputHicNumberValue;
            int hicCountValue = 1768423143;
            hicCount.value = hicCountValue;
            java.util.List<com.optum.rqns.services.hicTest.HicDetails> hicDetailsValue = new java.util.ArrayList<com.optum.rqns.services.hicTest.HicDetails>();
            com.optum.rqns.services.hicTest.HicDetails hicDetailsValueVal1 = new com.optum.rqns.services.hicTest.HicDetails();
            hicDetailsValueVal1.setHicNumber("HicNumber370866415");
            hicDetailsValueVal1.setHicStrtDt("HicStrtDt2144582443");
            hicDetailsValueVal1.setHicEndDt("HicEndDt-1322233916");
            hicDetailsValueVal1.setHicSource("HicSource-1512497889");
            hicDetailsValue.add(hicDetailsValueVal1);
            hicDetails.value = hicDetailsValue;
            java.lang.String errorMsgValue = "errorMsgValue2099941686";
            errorMsg.value = errorMsgValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}