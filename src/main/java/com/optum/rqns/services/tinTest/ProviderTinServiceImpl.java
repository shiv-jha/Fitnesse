
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.optum.rqns.services.tinTest;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-27T14:29:53.992+05:30
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "providerTinService",
                      portName = "ProviderTinServiceImplPort",
                      targetNamespace = "http://services.rqns.optum.com/",
                      wsdlLocation = "https://trustbroker-stg-svcs.optum.com:8443/tst/rqns-services-web/services/providerTinService?wsdl",
                      endpointInterface = "com.optum.rqns.services.tinTest.ProviderTinService")
                      
public class ProviderTinServiceImpl implements ProviderTinService {

    private static final Logger LOG = Logger.getLogger(ProviderTinServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.optum.rqns.services.tinTest.ProviderTinService#getProviderTinInfo(com.optum.rqns.services.tinTest.GetProviderTinInfo  getProviderTinInfo )*
     */
    public com.optum.rqns.services.tinTest.GetProviderTinInfoResponse getProviderTinInfo(GetProviderTinInfo getProviderTinInfo) throws ServiceException_Exception    { 
        LOG.info("Executing operation getProviderTinInfo");
        System.out.println(getProviderTinInfo);
        try {
            com.optum.rqns.services.tinTest.GetProviderTinInfoResponse _return = new com.optum.rqns.services.tinTest.GetProviderTinInfoResponse();
            com.optum.rqns.services.tinTest.ProviderTinInfo _returnProviderTinInfo = new com.optum.rqns.services.tinTest.ProviderTinInfo();
            _returnProviderTinInfo.setProviderNpiID("ProviderNpiID995972882");
            _returnProviderTinInfo.setProviderTin("ProviderTin1420241660");
            _returnProviderTinInfo.setProviderTinName("ProviderTinName-863714043");
            _returnProviderTinInfo.setDataSource("DataSource150148436");
            _returnProviderTinInfo.setReturnCode(-859399507);
            _returnProviderTinInfo.setReturnCodeDesc("ReturnCodeDesc522267175");
            _return.setProviderTinInfo(_returnProviderTinInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException_Exception("ServiceException...");
    }

}
