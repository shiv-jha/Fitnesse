
package com.optum.rqns.services.medicaideligiblityTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleMcaidMembersByMbrIDAndClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleMcaidMembersByMbrIDAndClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilityInfo" type="{http://services.rqns.optum.com/}medicaidMemberEligibilityInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEligibleMcaidMembersByMbrIDAndClientResponse", propOrder = {
    "eligibilityInfo"
})
public class GetEligibleMcaidMembersByMbrIDAndClientResponse {

    protected MedicaidMemberEligibilityInfo eligibilityInfo;

    /**
     * Gets the value of the eligibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MedicaidMemberEligibilityInfo }
     *     
     */
    public MedicaidMemberEligibilityInfo getEligibilityInfo() {
        return eligibilityInfo;
    }

    /**
     * Sets the value of the eligibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicaidMemberEligibilityInfo }
     *     
     */
    public void setEligibilityInfo(MedicaidMemberEligibilityInfo value) {
        this.eligibilityInfo = value;
    }

}
