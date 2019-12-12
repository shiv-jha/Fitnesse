
package com.optum.rqns.services.medicareDemography;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMedicareMemberLatestDemographicInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMedicareMemberLatestDemographicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mbrHicNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metaData" type="{http://services.rqns.optum.com/}serviceMetaData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicareMemberLatestDemographicInfo", propOrder = {
    "mbrHicNbr",
    "clientId",
    "metaData"
})
public class GetMedicareMemberLatestDemographicInfo {

    protected String mbrHicNbr;
    protected String clientId;
    protected ServiceMetaData metaData;

    /**
     * Gets the value of the mbrHicNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrHicNbr() {
        return mbrHicNbr;
    }

    /**
     * Sets the value of the mbrHicNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrHicNbr(String value) {
        this.mbrHicNbr = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMetaData }
     *     
     */
    public ServiceMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMetaData }
     *     
     */
    public void setMetaData(ServiceMetaData value) {
        this.metaData = value;
    }

}
