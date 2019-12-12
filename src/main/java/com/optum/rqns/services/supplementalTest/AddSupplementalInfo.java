
package com.optum.rqns.services.supplementalTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addSupplementalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addSupplementalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceMetaData" type="{http://services.rqns.optum.com/}serviceMetaData" minOccurs="0"/>
 *         &lt;element name="supplementalInfo" type="{http://services.rqns.optum.com/}supplementalInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addSupplementalInfo", propOrder = {
    "serviceMetaData",
    "supplementalInfo"
})
public class AddSupplementalInfo {

    protected ServiceMetaData serviceMetaData;
    protected SupplementalInfo supplementalInfo;

    /**
     * Gets the value of the serviceMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMetaData }
     *     
     */
    public ServiceMetaData getServiceMetaData() {
        return serviceMetaData;
    }

    /**
     * Sets the value of the serviceMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMetaData }
     *     
     */
    public void setServiceMetaData(ServiceMetaData value) {
        this.serviceMetaData = value;
    }

    /**
     * Gets the value of the supplementalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalInfo }
     *     
     */
    public SupplementalInfo getSupplementalInfo() {
        return supplementalInfo;
    }

    /**
     * Sets the value of the supplementalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalInfo }
     *     
     */
    public void setSupplementalInfo(SupplementalInfo value) {
        this.supplementalInfo = value;
    }

}
