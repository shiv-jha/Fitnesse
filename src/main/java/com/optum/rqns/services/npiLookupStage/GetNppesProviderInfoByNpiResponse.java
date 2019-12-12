
package com.optum.rqns.services.npiLookupStage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNppesProviderInfoByNpiResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNppesProviderInfoByNpiResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerInfo" type="{http://services.rqns.optum.com/}providerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNppesProviderInfoByNpiResponse", propOrder = {
    "providerInfo"
})
public class GetNppesProviderInfoByNpiResponse {

    protected ProviderInfo providerInfo;

    /**
     * Gets the value of the providerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderInfo }
     *     
     */
    public ProviderInfo getProviderInfo() {
        return providerInfo;
    }

    /**
     * Sets the value of the providerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderInfo }
     *     
     */
    public void setProviderInfo(ProviderInfo value) {
        this.providerInfo = value;
    }

}
