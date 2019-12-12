
package com.optum.rqns.services.npiLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientProviderInfoByProviderIDAndClientNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientProviderInfoByProviderIDAndClientNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerDemographicInfo" type="{http://services.rqns.optum.com/}providerDemographicInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientProviderInfoByProviderIDAndClientNameResponse", propOrder = {
    "providerDemographicInfo"
})
public class GetClientProviderInfoByProviderIDAndClientNameResponse {

    protected ProviderDemographicInfo providerDemographicInfo;

    /**
     * Gets the value of the providerDemographicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderDemographicInfo }
     *     
     */
    public ProviderDemographicInfo getProviderDemographicInfo() {
        return providerDemographicInfo;
    }

    /**
     * Sets the value of the providerDemographicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderDemographicInfo }
     *     
     */
    public void setProviderDemographicInfo(ProviderDemographicInfo value) {
        this.providerDemographicInfo = value;
    }

}
