
package com.optum.rqns.services.gapTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addGapStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addGapStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceMetaData" type="{http://services.rqns.optum.com/}serviceMetaData" minOccurs="0"/>
 *         &lt;element name="gapStatusInfo" type="{http://services.rqns.optum.com/}gapStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addGapStatusInfo", propOrder = {
    "serviceMetaData",
    "gapStatusInfo"
})
public class AddGapStatusInfo {

    protected ServiceMetaData serviceMetaData;
    protected GapStatusInfo gapStatusInfo;

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
     * Gets the value of the gapStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GapStatusInfo }
     *     
     */
    public GapStatusInfo getGapStatusInfo() {
        return gapStatusInfo;
    }

    /**
     * Sets the value of the gapStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GapStatusInfo }
     *     
     */
    public void setGapStatusInfo(GapStatusInfo value) {
        this.gapStatusInfo = value;
    }

}
