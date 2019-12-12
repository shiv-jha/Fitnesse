
package com.optum.rqns.services.npiLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerAddressDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerAddressDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAddressStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerAddressEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerAddressDetails", propOrder = {
    "addressType",
    "providerAddress1",
    "providerAddress2",
    "providerCity",
    "providerState",
    "providerZipCode",
    "providerPhoneNumber",
    "providerFaxNumber",
    "providerAddressStartDate",
    "providerAddressEndDate",
    "emailAddress"
})
public class ProviderAddressDetails {

    protected String addressType;
    protected String providerAddress1;
    protected String providerAddress2;
    protected String providerCity;
    protected String providerState;
    protected String providerZipCode;
    protected String providerPhoneNumber;
    protected String providerFaxNumber;
    protected String providerAddressStartDate;
    protected String providerAddressEndDate;
    protected String emailAddress;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the providerAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAddress1() {
        return providerAddress1;
    }

    /**
     * Sets the value of the providerAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAddress1(String value) {
        this.providerAddress1 = value;
    }

    /**
     * Gets the value of the providerAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAddress2() {
        return providerAddress2;
    }

    /**
     * Sets the value of the providerAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAddress2(String value) {
        this.providerAddress2 = value;
    }

    /**
     * Gets the value of the providerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCity() {
        return providerCity;
    }

    /**
     * Sets the value of the providerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCity(String value) {
        this.providerCity = value;
    }

    /**
     * Gets the value of the providerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderState() {
        return providerState;
    }

    /**
     * Sets the value of the providerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderState(String value) {
        this.providerState = value;
    }

    /**
     * Gets the value of the providerZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderZipCode() {
        return providerZipCode;
    }

    /**
     * Sets the value of the providerZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderZipCode(String value) {
        this.providerZipCode = value;
    }

    /**
     * Gets the value of the providerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderPhoneNumber() {
        return providerPhoneNumber;
    }

    /**
     * Sets the value of the providerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderPhoneNumber(String value) {
        this.providerPhoneNumber = value;
    }

    /**
     * Gets the value of the providerFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFaxNumber() {
        return providerFaxNumber;
    }

    /**
     * Sets the value of the providerFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFaxNumber(String value) {
        this.providerFaxNumber = value;
    }

    /**
     * Gets the value of the providerAddressStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAddressStartDate() {
        return providerAddressStartDate;
    }

    /**
     * Sets the value of the providerAddressStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAddressStartDate(String value) {
        this.providerAddressStartDate = value;
    }

    /**
     * Gets the value of the providerAddressEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderAddressEndDate() {
        return providerAddressEndDate;
    }

    /**
     * Sets the value of the providerAddressEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderAddressEndDate(String value) {
        this.providerAddressEndDate = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}
