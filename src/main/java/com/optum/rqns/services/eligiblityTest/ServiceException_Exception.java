
package com.optum.rqns.services.eligiblityTest;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-26T19:53:03.478+05:30
 * Generated source version: 2.7.18
 */

@WebFault(name = "ServiceException", targetNamespace = "http://services.rqns.optum.com/")
public class ServiceException_Exception extends Exception {
    
    private com.optum.rqns.services.eligiblityTest.ServiceException serviceException;

    public ServiceException_Exception() {
        super();
    }
    
    public ServiceException_Exception(String message) {
        super(message);
    }
    
    public ServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.eligiblityTest.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.eligiblityTest.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public com.optum.rqns.services.eligiblityTest.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
