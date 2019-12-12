
package com.optum.rqns.services.demography;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAcaMemberDemographicInfoByMbrIDAndClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAcaMemberDemographicInfoByMbrIDAndClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acaMemberDemographicInfo" type="{http://services.rqns.optum.com/}acaMemberDemographicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAcaMemberDemographicInfoByMbrIDAndClientResponse", propOrder = {
    "acaMemberDemographicInfo"
})
public class GetAcaMemberDemographicInfoByMbrIDAndClientResponse {

    protected AcaMemberDemographicInfo acaMemberDemographicInfo;

    /**
     * Gets the value of the acaMemberDemographicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcaMemberDemographicInfo }
     *     
     */
    public AcaMemberDemographicInfo getAcaMemberDemographicInfo() {
        return acaMemberDemographicInfo;
    }

    /**
     * Sets the value of the acaMemberDemographicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcaMemberDemographicInfo }
     *     
     */
    public void setAcaMemberDemographicInfo(AcaMemberDemographicInfo value) {
        this.acaMemberDemographicInfo = value;
    }

}
