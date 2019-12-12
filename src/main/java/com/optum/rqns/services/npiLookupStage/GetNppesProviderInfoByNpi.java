
package com.optum.rqns.services.npiLookupStage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNppesProviderInfoByNpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNppesProviderInfoByNpi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metaData" type="{http://services.rqns.optum.com/}serviceMetaData" minOccurs="0"/>
 *         &lt;element name="providerNpiID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNppesProviderInfoByNpi", propOrder = {
    "metaData",
    "providerNpiID"
})
public class GetNppesProviderInfoByNpi {

    protected ServiceMetaData metaData;
    protected Long providerNpiID;

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
     * Gets the value of the providerNpiID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProviderNpiID() {
        return providerNpiID;
    }

    /**
     * Sets the value of the providerNpiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProviderNpiID(Long value) {
        this.providerNpiID = value;
    }

}
