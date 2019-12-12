
package com.optum.rqns.services.medicareEigiblityTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEligibleMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEligibleMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberHIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getEligibleMembers", propOrder = {
    "memberHIC",
    "rangeStrtDt",
    "rangeEndDt",
    "metaData"
})
public class GetEligibleMembers {

    protected String memberHIC;
    protected String rangeStrtDt;
    protected String rangeEndDt;
    protected ServiceMetaData metaData;

    /**
     * Gets the value of the memberHIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberHIC() {
        return memberHIC;
    }

    /**
     * Sets the value of the memberHIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberHIC(String value) {
        this.memberHIC = value;
    }

    /**
     * Gets the value of the rangeStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeStrtDt() {
        return rangeStrtDt;
    }

    /**
     * Sets the value of the rangeStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeStrtDt(String value) {
        this.rangeStrtDt = value;
    }

    /**
     * Gets the value of the rangeEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeEndDt() {
        return rangeEndDt;
    }

    /**
     * Sets the value of the rangeEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeEndDt(String value) {
        this.rangeEndDt = value;
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
