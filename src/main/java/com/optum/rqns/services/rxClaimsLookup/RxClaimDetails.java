
package com.optum.rqns.services.rxClaimsLookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for rxClaimDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rxClaimDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberGlobalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberModifierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ndcDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ndcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFilled" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateSupply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rxClaimDetails", propOrder = {
    "memberGlobalId",
    "memberIdentifier",
    "memberModifierId",
    "ndcDesc",
    "ndcCode",
    "dateFilled",
    "quantity",
    "dateSupply",
    "providerFirstName",
    "providerLastName",
    "providerMiddleName"
})
public class RxClaimDetails {

    protected String memberGlobalId;
    protected String memberIdentifier;
    protected String memberModifierId;
    protected String ndcDesc;
    protected String ndcCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFilled;
    protected String quantity;
    protected String dateSupply;
    protected String providerFirstName;
    protected String providerLastName;
    protected String providerMiddleName;

    /**
     * Gets the value of the memberGlobalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberGlobalId() {
        return memberGlobalId;
    }

    /**
     * Sets the value of the memberGlobalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberGlobalId(String value) {
        this.memberGlobalId = value;
    }

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
     * Gets the value of the memberModifierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberModifierId() {
        return memberModifierId;
    }

    /**
     * Sets the value of the memberModifierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberModifierId(String value) {
        this.memberModifierId = value;
    }

    /**
     * Gets the value of the ndcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcDesc() {
        return ndcDesc;
    }

    /**
     * Sets the value of the ndcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcDesc(String value) {
        this.ndcDesc = value;
    }

    /**
     * Gets the value of the ndcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdcCode() {
        return ndcCode;
    }

    /**
     * Sets the value of the ndcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdcCode(String value) {
        this.ndcCode = value;
    }

    /**
     * Gets the value of the dateFilled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFilled() {
        return dateFilled;
    }

    /**
     * Sets the value of the dateFilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFilled(XMLGregorianCalendar value) {
        this.dateFilled = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the dateSupply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSupply() {
        return dateSupply;
    }

    /**
     * Sets the value of the dateSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSupply(String value) {
        this.dateSupply = value;
    }

    /**
     * Gets the value of the providerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFirstName() {
        return providerFirstName;
    }

    /**
     * Sets the value of the providerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFirstName(String value) {
        this.providerFirstName = value;
    }

    /**
     * Gets the value of the providerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLastName() {
        return providerLastName;
    }

    /**
     * Sets the value of the providerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLastName(String value) {
        this.providerLastName = value;
    }

    /**
     * Gets the value of the providerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderMiddleName() {
        return providerMiddleName;
    }

    /**
     * Sets the value of the providerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderMiddleName(String value) {
        this.providerMiddleName = value;
    }

}
