
package com.optum.rqns.services.medicaideligiblity;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-07-25T16:51:33.538+05:30
 * Generated source version: 2.7.18
 */

@WebFault(name = "ServiceException", targetNamespace = "http://services.rqns.optum.com/")
public class ServiceException_Exception extends Exception {
    
    private com.optum.rqns.services.medicaideligiblity.ServiceException serviceException;

    public ServiceException_Exception() {
        super();
    }
    
    public ServiceException_Exception(String message) {
        super(message);
    }
    
    public ServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.medicaideligiblity.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.medicaideligiblity.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public com.optum.rqns.services.medicaideligiblity.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
