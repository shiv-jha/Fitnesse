
package com.optum.rqns.services.supplementalTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supplementalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplementalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcSsys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clntGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberGlbId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberAltTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberAltIdValtxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDataCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDataValTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDataNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplDataUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usrOptumId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usrLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplementalInfo", propOrder = {
    "srcSsys",
    "clntGuid",
    "memberId",
    "memberGlbId",
    "memberAltTypeCd",
    "memberAltIdValtxt",
    "supplDataType",
    "supplDataCd",
    "supplDos",
    "supplDataValTxt",
    "supplDataNum",
    "supplDataUnit",
    "transTimeStamp",
    "usrOptumId",
    "usrLastName",
    "userFirstName",
    "recordStatus"
})
public class SupplementalInfo {

    protected String srcSsys;
    protected String clntGuid;
    protected String memberId;
    protected String memberGlbId;
    protected String memberAltTypeCd;
    protected String memberAltIdValtxt;
    protected String supplDataType;
    protected String supplDataCd;
    protected String supplDos;
    protected String supplDataValTxt;
    protected String supplDataNum;
    protected String supplDataUnit;
    protected String transTimeStamp;
    protected String usrOptumId;
    protected String usrLastName;
    protected String userFirstName;
    protected String recordStatus;

    /**
     * Gets the value of the srcSsys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcSsys() {
        return srcSsys;
    }

    /**
     * Sets the value of the srcSsys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcSsys(String value) {
        this.srcSsys = value;
    }

    /**
     * Gets the value of the clntGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntGuid() {
        return clntGuid;
    }

    /**
     * Sets the value of the clntGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntGuid(String value) {
        this.clntGuid = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the memberGlbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberGlbId() {
        return memberGlbId;
    }

    /**
     * Sets the value of the memberGlbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberGlbId(String value) {
        this.memberGlbId = value;
    }

    /**
     * Gets the value of the memberAltTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAltTypeCd() {
        return memberAltTypeCd;
    }

    /**
     * Sets the value of the memberAltTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberAltTypeCd(String value) {
        this.memberAltTypeCd = value;
    }

    /**
     * Gets the value of the memberAltIdValtxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberAltIdValtxt() {
        return memberAltIdValtxt;
    }

    /**
     * Sets the value of the memberAltIdValtxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberAltIdValtxt(String value) {
        this.memberAltIdValtxt = value;
    }

    /**
     * Gets the value of the supplDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDataType() {
        return supplDataType;
    }

    /**
     * Sets the value of the supplDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDataType(String value) {
        this.supplDataType = value;
    }

    /**
     * Gets the value of the supplDataCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDataCd() {
        return supplDataCd;
    }

    /**
     * Sets the value of the supplDataCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDataCd(String value) {
        this.supplDataCd = value;
    }

    /**
     * Gets the value of the supplDos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDos() {
        return supplDos;
    }

    /**
     * Sets the value of the supplDos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDos(String value) {
        this.supplDos = value;
    }

    /**
     * Gets the value of the supplDataValTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDataValTxt() {
        return supplDataValTxt;
    }

    /**
     * Sets the value of the supplDataValTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDataValTxt(String value) {
        this.supplDataValTxt = value;
    }

    /**
     * Gets the value of the supplDataNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDataNum() {
        return supplDataNum;
    }

    /**
     * Sets the value of the supplDataNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDataNum(String value) {
        this.supplDataNum = value;
    }

    /**
     * Gets the value of the supplDataUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplDataUnit() {
        return supplDataUnit;
    }

    /**
     * Sets the value of the supplDataUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplDataUnit(String value) {
        this.supplDataUnit = value;
    }

    /**
     * Gets the value of the transTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTimeStamp() {
        return transTimeStamp;
    }

    /**
     * Sets the value of the transTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTimeStamp(String value) {
        this.transTimeStamp = value;
    }

    /**
     * Gets the value of the usrOptumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrOptumId() {
        return usrOptumId;
    }

    /**
     * Sets the value of the usrOptumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrOptumId(String value) {
        this.usrOptumId = value;
    }

    /**
     * Gets the value of the usrLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrLastName() {
        return usrLastName;
    }

    /**
     * Sets the value of the usrLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrLastName(String value) {
        this.usrLastName = value;
    }

    /**
     * Gets the value of the userFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Sets the value of the userFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFirstName(String value) {
        this.userFirstName = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatus(String value) {
        this.recordStatus = value;
    }

}
