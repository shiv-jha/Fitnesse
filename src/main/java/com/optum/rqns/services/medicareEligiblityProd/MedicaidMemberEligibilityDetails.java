
package com.optum.rqns.services.medicareEligiblityProd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicaidMemberEligibilityDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicaidMemberEligibilityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eligibilitySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lobIDDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classIDDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlBegDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicaidMemberEligibilityDetails", propOrder = {
    "returnCode",
    "returnCodeDesc",
    "eligibilitySource",
    "memberID",
    "modifierID",
    "globalMemberID",
    "planNumber",
    "planDesc",
    "lobID",
    "lobIDDesc",
    "programTypeCd",
    "classID",
    "classIDDesc",
    "enrlBegDt",
    "enrlEndDt"
})
public class MedicaidMemberEligibilityDetails {

    protected int returnCode;
    protected String returnCodeDesc;
    protected String eligibilitySource;
    protected String memberID;
    protected String modifierID;
    protected String globalMemberID;
    protected String planNumber;
    protected String planDesc;
    protected String lobID;
    protected String lobIDDesc;
    protected String programTypeCd;
    protected String classID;
    protected String classIDDesc;
    protected String enrlBegDt;
    protected String enrlEndDt;

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
     * Gets the value of the planDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanDesc() {
        return planDesc;
    }

    /**
     * Sets the value of the planDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanDesc(String value) {
        this.planDesc = value;
    }

    /**
     * Gets the value of the lobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLobID() {
        return lobID;
    }

    /**
     * Sets the value of the lobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLobID(String value) {
        this.lobID = value;
    }

    /**
     * Gets the value of the lobIDDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLobIDDesc() {
        return lobIDDesc;
    }

    /**
     * Sets the value of the lobIDDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLobIDDesc(String value) {
        this.lobIDDesc = value;
    }

    /**
     * Gets the value of the programTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramTypeCd() {
        return programTypeCd;
    }

    /**
     * Sets the value of the programTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramTypeCd(String value) {
        this.programTypeCd = value;
    }

    /**
     * Gets the value of the classID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassID() {
        return classID;
    }

    /**
     * Sets the value of the classID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassID(String value) {
        this.classID = value;
    }

    /**
     * Gets the value of the classIDDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassIDDesc() {
        return classIDDesc;
    }

    /**
     * Sets the value of the classIDDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassIDDesc(String value) {
        this.classIDDesc = value;
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

}
