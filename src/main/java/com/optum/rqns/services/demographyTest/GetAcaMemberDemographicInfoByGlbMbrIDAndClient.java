
package com.optum.rqns.services.demographyTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAcaMemberDemographicInfoByGlbMbrIDAndClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAcaMemberDemographicInfoByGlbMbrIDAndClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getAcaMemberDemographicInfoByGlbMbrIDAndClient", propOrder = {
    "globalMemberID",
    "clientName",
    "metaData"
})
public class GetAcaMemberDemographicInfoByGlbMbrIDAndClient {

    protected String globalMemberID;
    protected String clientName;
    protected ServiceMetaData metaData;

    /**
     * Gets the value of the globalMemberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalMemberID() {
        return globalMemberID;
    }

    /**
     * Sets the value of the globalMemberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalMemberID(String value) {
        this.globalMemberID = value;
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
