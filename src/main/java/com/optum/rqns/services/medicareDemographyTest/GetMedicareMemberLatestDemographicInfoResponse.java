
package com.optum.rqns.services.medicareDemographyTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMedicareMemberLatestDemographicInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMedicareMemberLatestDemographicInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicareMemberDemographicInfo" type="{http://services.rqns.optum.com/}medicareMemberDemographicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicareMemberLatestDemographicInfoResponse", propOrder = {
    "medicareMemberDemographicInfo"
})
public class GetMedicareMemberLatestDemographicInfoResponse {

    protected MedicareMemberDemographicInfo medicareMemberDemographicInfo;

    /**
     * Gets the value of the medicareMemberDemographicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MedicareMemberDemographicInfo }
     *     
     */
    public MedicareMemberDemographicInfo getMedicareMemberDemographicInfo() {
        return medicareMemberDemographicInfo;
    }

    /**
     * Sets the value of the medicareMemberDemographicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicareMemberDemographicInfo }
     *     
     */
    public void setMedicareMemberDemographicInfo(MedicareMemberDemographicInfo value) {
        this.medicareMemberDemographicInfo = value;
    }

}
