
package com.optum.rqns.services.medicareEligiblity2Test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memberHicHistoryv2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memberHicHistoryv2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibilitySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subPlnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enrlEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parClntGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memberHicHistoryv2", propOrder = {
    "eligibilitySource",
    "hicNumber",
    "contrNbr",
    "subPlnId",
    "enrlStrtDt",
    "enrlEndDt",
    "parClntGuid",
    "parClientName"
})
public class MemberHicHistoryv2 {

    protected String eligibilitySource;
    protected String hicNumber;
    protected String contrNbr;
    protected String subPlnId;
    protected String enrlStrtDt;
    protected String enrlEndDt;
    protected String parClntGuid;
    protected String parClientName;

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
     * Gets the value of the hicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHicNumber() {
        return hicNumber;
    }

    /**
     * Sets the value of the hicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHicNumber(String value) {
        this.hicNumber = value;
    }

    /**
     * Gets the value of the contrNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrNbr() {
        return contrNbr;
    }

    /**
     * Sets the value of the contrNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrNbr(String value) {
        this.contrNbr = value;
    }

    /**
     * Gets the value of the subPlnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPlnId() {
        return subPlnId;
    }

    /**
     * Sets the value of the subPlnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPlnId(String value) {
        this.subPlnId = value;
    }

    /**
     * Gets the value of the enrlStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrlStrtDt() {
        return enrlStrtDt;
    }

    /**
     * Sets the value of the enrlStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrlStrtDt(String value) {
        this.enrlStrtDt = value;
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
     * Gets the value of the parClntGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParClntGuid() {
        return parClntGuid;
    }

    /**
     * Sets the value of the parClntGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParClntGuid(String value) {
        this.parClntGuid = value;
    }

    /**
     * Gets the value of the parClientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParClientName() {
        return parClientName;
    }

    /**
     * Sets the value of the parClientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParClientName(String value) {
        this.parClientName = value;
    }

}
