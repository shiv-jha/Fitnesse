
package com.optum.rqns.services.npiLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerAffiliationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerAffiliationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerOrgAffiliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerOrgAffiliationStDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerOrgAffiliationEdDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerAffiliationDetails", propOrder = {
    "providerOrgAffiliation",
    "providerOrgAffiliationStDt",
    "providerOrgAffiliationEdDt"
})
public class ProviderAffiliationDetails {

    protected String providerOrgAffiliation;
    protected String providerOrgAffiliationStDt;
    protected String providerOrgAffiliationEdDt;

    /**
     * Gets the value of the providerOrgAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrgAffiliation() {
        return providerOrgAffiliation;
    }

    /**
     * Sets the value of the providerOrgAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrgAffiliation(String value) {
        this.providerOrgAffiliation = value;
    }

    /**
     * Gets the value of the providerOrgAffiliationStDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrgAffiliationStDt() {
        return providerOrgAffiliationStDt;
    }

    /**
     * Sets the value of the providerOrgAffiliationStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrgAffiliationStDt(String value) {
        this.providerOrgAffiliationStDt = value;
    }

    /**
     * Gets the value of the providerOrgAffiliationEdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderOrgAffiliationEdDt() {
        return providerOrgAffiliationEdDt;
    }

    /**
     * Sets the value of the providerOrgAffiliationEdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderOrgAffiliationEdDt(String value) {
        this.providerOrgAffiliationEdDt = value;
    }

}
