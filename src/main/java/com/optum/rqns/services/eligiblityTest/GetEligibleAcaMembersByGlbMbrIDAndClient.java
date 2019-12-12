
package com.optum.rqns.services.eligiblityTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleAcaMembersByGlbMbrIDAndClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleAcaMembersByGlbMbrIDAndClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getEligibleAcaMembersByGlbMbrIDAndClient", propOrder = {
    "globalMemberID",
    "clientName",
    "eligStrtDt",
    "eligEndDt",
    "metaData"
})
public class GetEligibleAcaMembersByGlbMbrIDAndClient {

    protected String globalMemberID;
    protected String clientName;
    protected String eligStrtDt;
    protected String eligEndDt;
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
     * Gets the value of the eligStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligStrtDt() {
        return eligStrtDt;
    }

    /**
     * Sets the value of the eligStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligStrtDt(String value) {
        this.eligStrtDt = value;
    }

    /**
     * Gets the value of the eligEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligEndDt() {
        return eligEndDt;
    }

    /**
     * Sets the value of the eligEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligEndDt(String value) {
        this.eligEndDt = value;
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
