
package com.optum.rqns.services.tinTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProviderTinInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProviderTinInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.rqns.optum.com/}providerTinInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProviderTinInfoResponse", propOrder = {
    "providerTinInfo"
})
public class GetProviderTinInfoResponse {

    @XmlElement(namespace = "http://services.rqns.optum.com/")
    protected ProviderTinInfo providerTinInfo;

    /**
     * Gets the value of the providerTinInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTinInfo }
     *     
     */
    public ProviderTinInfo getProviderTinInfo() {
        return providerTinInfo;
    }

    /**
     * Sets the value of the providerTinInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTinInfo }
     *     
     */
    public void setProviderTinInfo(ProviderTinInfo value) {
        this.providerTinInfo = value;
    }

}
