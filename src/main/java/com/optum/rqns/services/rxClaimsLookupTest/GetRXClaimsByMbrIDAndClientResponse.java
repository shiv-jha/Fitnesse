
package com.optum.rqns.services.rxClaimsLookupTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRXClaimsByMbrIDAndClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRXClaimsByMbrIDAndClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rxClaimInfo" type="{http://services.rqns.optum.com/}rxClaimsInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRXClaimsByMbrIDAndClientResponse", propOrder = {
    "rxClaimInfo"
})
public class GetRXClaimsByMbrIDAndClientResponse {

    protected RxClaimsInfo rxClaimInfo;

    /**
     * Gets the value of the rxClaimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RxClaimsInfo }
     *     
     */
    public RxClaimsInfo getRxClaimInfo() {
        return rxClaimInfo;
    }

    /**
     * Sets the value of the rxClaimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RxClaimsInfo }
     *     
     */
    public void setRxClaimInfo(RxClaimsInfo value) {
        this.rxClaimInfo = value;
    }

}
