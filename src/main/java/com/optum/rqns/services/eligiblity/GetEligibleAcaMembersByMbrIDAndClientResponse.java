
package com.optum.rqns.services.eligiblity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleAcaMembersByMbrIDAndClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleAcaMembersByMbrIDAndClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilityInfo" type="{http://services.rqns.optum.com/}acaMemberEligibilityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleAcaMembersByMbrIDAndClientResponse", propOrder = {
    "eligibilityInfo"
})
public class GetEligibleAcaMembersByMbrIDAndClientResponse {

    protected AcaMemberEligibilityInfo eligibilityInfo;

    /**
     * Gets the value of the eligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcaMemberEligibilityInfo }
     *     
     */
    public AcaMemberEligibilityInfo getEligibilityInfo() {
        return eligibilityInfo;
    }

    /**
     * Sets the value of the eligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcaMemberEligibilityInfo }
     *     
     */
    public void setEligibilityInfo(AcaMemberEligibilityInfo value) {
        this.eligibilityInfo = value;
    }

}
