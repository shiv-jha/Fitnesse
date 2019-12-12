
package com.optum.rqns.services.eligiblity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acaMemberEligibilityDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acaMemberEligibilityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibilitySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlBegDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acaMemberEligibilityDetails", propOrder = {
    "returnCode",
    "returnCodeDesc",
    "eligibilitySource",
    "clientGuid",
    "memberID",
    "modifierID",
    "globalMemberID",
    "planNumber",
    "metalLevel",
    "subscriberID",
    "enrlEndDt",
    "enrlBegDt",
    "empGroupID"
})
public class AcaMemberEligibilityDetails {

    protected int returnCode;
    protected String returnCodeDesc;
    protected String eligibilitySource;
    protected String clientGuid;
    protected String memberID;
    protected String modifierID;
    protected String globalMemberID;
    protected String planNumber;
    protected String metalLevel;
    protected String subscriberID;
    protected String enrlEndDt;
    protected String enrlBegDt;
    protected String empGroupID;

    /**
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCodeDesc() {
        return returnCodeDesc;
    }

    /**
     * Sets the value of the returnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCodeDesc(String value) {
        this.returnCodeDesc = value;
    }

    /**
     * Gets the value of the eligibilitySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilitySource() {
        return eligibilitySource;
    }

    /**
     * Sets the value of the eligibilitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilitySource(String value) {
        this.eligibilitySource = value;
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
     * Gets the value of the modifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifierID() {
        return modifierID;
    }

    /**
     * Sets the value of the modifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifierID(String value) {
        this.modifierID = value;
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
     * Gets the value of the metalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetalLevel() {
        return metalLevel;
    }

    /**
     * Sets the value of the metalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetalLevel(String value) {
        this.metalLevel = value;
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
     * Gets the value of the enrlEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrlEndDt() {
        return enrlEndDt;
    }

    /**
     * Sets the value of the enrlEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrlEndDt(String value) {
        this.enrlEndDt = value;
    }

    /**
     * Gets the value of the enrlBegDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrlBegDt() {
        return enrlBegDt;
    }

    /**
     * Sets the value of the enrlBegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrlBegDt(String value) {
        this.enrlBegDt = value;
    }

    /**
     * Gets the value of the empGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpGroupID() {
        return empGroupID;
    }

    /**
     * Sets the value of the empGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpGroupID(String value) {
        this.empGroupID = value;
    }

}
