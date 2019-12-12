
package com.optum.rqns.services.demographyTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acaMemberDemographicDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acaMemberDemographicDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberIDModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acaMemberDemographicDetails", propOrder = {
    "clientGuid",
    "memberID",
    "memberIDModifier",
    "globalMemberID",
    "planNumber",
    "subscriberID",
    "firstName",
    "middleName",
    "lastName",
    "originalStartDate",
    "latestEndDate",
    "homePhone",
    "addressLine1",
    "addressLine2",
    "addressCity",
    "addressState",
    "addressZipcode",
    "dateOfBirth",
    "gender",
    "uCardID"
})
public class AcaMemberDemographicDetails {

    protected String clientGuid;
    protected String memberID;
    protected String memberIDModifier;
    protected String globalMemberID;
    protected String planNumber;
    protected String subscriberID;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String originalStartDate;
    protected String latestEndDate;
    protected String homePhone;
    protected String addressLine1;
    protected String addressLine2;
    protected String addressCity;
    protected String addressState;
    protected String addressZipcode;
    protected String dateOfBirth;
    protected String gender;
    protected String uCardID;

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
     * Gets the value of the memberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * Sets the value of the memberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberID(String value) {
        this.memberID = value;
    }

    /**
     * Gets the value of the memberIDModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberIDModifier() {
        return memberIDModifier;
    }

    /**
     * Sets the value of the memberIDModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberIDModifier(String value) {
        this.memberIDModifier = value;
    }

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
     * Gets the value of the planNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Sets the value of the planNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNumber(String value) {
        this.planNumber = value;
    }

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberID(String value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the originalStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStartDate() {
        return originalStartDate;
    }

    /**
     * Sets the value of the originalStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStartDate(String value) {
        this.originalStartDate = value;
    }

    /**
     * Gets the value of the latestEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestEndDate() {
        return latestEndDate;
    }

    /**
     * Sets the value of the latestEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestEndDate(String value) {
        this.latestEndDate = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCity(String value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the addressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Sets the value of the addressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressState(String value) {
        this.addressState = value;
    }

    /**
     * Gets the value of the addressZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressZipcode() {
        return addressZipcode;
    }

    /**
     * Sets the value of the addressZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressZipcode(String value) {
        this.addressZipcode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the uCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCardID() {
        return uCardID;
    }

    /**
     * Sets the value of the uCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCardID(String value) {
        this.uCardID = value;
    }

}
