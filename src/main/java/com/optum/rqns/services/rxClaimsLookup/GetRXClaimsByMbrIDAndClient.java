
package com.optum.rqns.services.rxClaimsLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRXClaimsByMbrIDAndClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRXClaimsByMbrIDAndClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getRXClaimsByMbrIDAndClient", propOrder = {
    "memberIdentifier",
    "memberModifier",
    "clientGuid",
    "metaData"
})
public class GetRXClaimsByMbrIDAndClient {

    protected String memberIdentifier;
    protected String memberModifier;
    protected String clientGuid;
    protected ServiceMetaData metaData;

    /**
     * Gets the value of the memberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberIdentifier() {
        return memberIdentifier;
    }

    /**
     * Sets the value of the memberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberIdentifier(String value) {
        this.memberIdentifier = value;
    }

    /**
     * Gets the value of the memberModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberModifier() {
        return memberModifier;
    }

    /**
     * Sets the value of the memberModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberModifier(String value) {
        this.memberModifier = value;
    }

    /**
     * Gets the value of the clientGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGuid() {
        return clientGuid;
    }

    /**
     * Sets the value of the clientGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGuid(String value) {
        this.clientGuid = value;
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
