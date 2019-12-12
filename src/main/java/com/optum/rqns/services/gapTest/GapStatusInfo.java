
package com.optum.rqns.services.gapTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gapStatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gapStatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clntGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subGapId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gapId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcRecId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcRecIdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusChgUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbstncProvId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gapStatusInfo", propOrder = {
    "clntGuid",
    "subGapId",
    "gapId",
    "actionDate",
    "actionResult",
    "status",
    "statusSrc",
    "srcRecId",
    "srcRecIdTyp",
    "statusChgUser",
    "sbstncProvId"
})
public class GapStatusInfo {

    protected String clntGuid;
    protected String subGapId;
    protected String gapId;
    protected String actionDate;
    protected String actionResult;
    protected String status;
    protected String statusSrc;
    protected String srcRecId;
    protected String srcRecIdTyp;
    protected String statusChgUser;
    protected String sbstncProvId;

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
     * Gets the value of the subGapId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGapId() {
        return subGapId;
    }

    /**
     * Sets the value of the subGapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGapId(String value) {
        this.subGapId = value;
    }

    /**
     * Gets the value of the gapId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGapId() {
        return gapId;
    }

    /**
     * Sets the value of the gapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGapId(String value) {
        this.gapId = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDate(String value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the actionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionResult() {
        return actionResult;
    }

    /**
     * Sets the value of the actionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionResult(String value) {
        this.actionResult = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSrc() {
        return statusSrc;
    }

    /**
     * Sets the value of the statusSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSrc(String value) {
        this.statusSrc = value;
    }

    /**
     * Gets the value of the srcRecId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcRecId() {
        return srcRecId;
    }

    /**
     * Sets the value of the srcRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcRecId(String value) {
        this.srcRecId = value;
    }

    /**
     * Gets the value of the srcRecIdTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcRecIdTyp() {
        return srcRecIdTyp;
    }

    /**
     * Sets the value of the srcRecIdTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcRecIdTyp(String value) {
        this.srcRecIdTyp = value;
    }

    /**
     * Gets the value of the statusChgUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusChgUser() {
        return statusChgUser;
    }

    /**
     * Sets the value of the statusChgUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusChgUser(String value) {
        this.statusChgUser = value;
    }

    /**
     * Gets the value of the sbstncProvId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbstncProvId() {
        return sbstncProvId;
    }

    /**
     * Sets the value of the sbstncProvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbstncProvId(String value) {
        this.sbstncProvId = value;
    }

}
