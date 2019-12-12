
package com.optum.rqns.services.npiLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientProviderInfoByProviderIDAndClientName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientProviderInfoByProviderIDAndClientName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://services.rqns.optum.com/}serviceMetaData" minOccurs="0"/>
 *         &lt;element name="healthPlanProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientProviderInfoByProviderIDAndClientName", propOrder = {
    "metaData",
    "healthPlanProviderID",
    "modifierID",
    "clientName"
})
public class GetClientProviderInfoByProviderIDAndClientName {

    protected ServiceMetaData metaData;
    protected String healthPlanProviderID;
    protected String modifierID;
    protected String clientName;

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

    /**
     * Gets the value of the healthPlanProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthPlanProviderID() {
        return healthPlanProviderID;
    }

    /**
     * Sets the value of the healthPlanProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthPlanProviderID(String value) {
        this.healthPlanProviderID = value;
    }

    /**
     * Gets the value of the modifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifierID() {
        return modifierID;
    }

    /**
     * Sets the value of the modifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifierID(String value) {
        this.modifierID = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

}
