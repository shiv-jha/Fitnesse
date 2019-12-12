
package com.optum.rqns.services.hicTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hicDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hicDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hicStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hicEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hicSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hicDetails", propOrder = {
    "hicNumber",
    "hicStrtDt",
    "hicEndDt",
    "hicSource"
})
public class HicDetails {

    protected String hicNumber;
    protected String hicStrtDt;
    protected String hicEndDt;
    protected String hicSource;

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
     * Gets the value of the hicStrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHicStrtDt() {
        return hicStrtDt;
    }

    /**
     * Sets the value of the hicStrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHicStrtDt(String value) {
        this.hicStrtDt = value;
    }

    /**
     * Gets the value of the hicEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHicEndDt() {
        return hicEndDt;
    }

    /**
     * Sets the value of the hicEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHicEndDt(String value) {
        this.hicEndDt = value;
    }

    /**
     * Gets the value of the hicSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHicSource() {
        return hicSource;
    }

    /**
     * Sets the value of the hicSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHicSource(String value) {
        this.hicSource = value;
    }

}
