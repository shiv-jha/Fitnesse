
package com.optum.rqns.services.medicareDemographyTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMedicareMemberListInfoByCardIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMedicareMemberListInfoByCardIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicareMemberDemographicInfoList" type="{http://services.rqns.optum.com/}medicareMemberDemographicInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicareMemberListInfoByCardIdResponse", propOrder = {
    "medicareMemberDemographicInfoList"
})
public class GetMedicareMemberListInfoByCardIdResponse {

    protected MedicareMemberDemographicInfoList medicareMemberDemographicInfoList;

    /**
     * Gets the value of the medicareMemberDemographicInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link MedicareMemberDemographicInfoList }
     *     
     */
    public MedicareMemberDemographicInfoList getMedicareMemberDemographicInfoList() {
        return medicareMemberDemographicInfoList;
    }

    /**
     * Sets the value of the medicareMemberDemographicInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicareMemberDemographicInfoList }
     *     
     */
    public void setMedicareMemberDemographicInfoList(MedicareMemberDemographicInfoList value) {
        this.medicareMemberDemographicInfoList = value;
    }

}
