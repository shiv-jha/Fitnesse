
package com.optum.rqns.services.npiLookup;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-07T15:06:15.019+05:30
 * Generated source version: 2.7.18
 */

@WebFault(name = "ServiceException", targetNamespace = "http://services.rqns.optum.com/")
public class ServiceException_Exception extends Exception {
    
    private com.optum.rqns.services.npiLookup.ServiceException serviceException;

    public ServiceException_Exception() {
        super();
    }
    
    public ServiceException_Exception(String message) {
        super(message);
    }
    
    public ServiceException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.npiLookup.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException_Exception(String message, com.optum.rqns.services.npiLookup.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public com.optum.rqns.services.npiLookup.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}
