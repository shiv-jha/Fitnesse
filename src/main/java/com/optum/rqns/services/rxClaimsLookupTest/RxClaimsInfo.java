
package com.optum.rqns.services.rxClaimsLookupTest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rxClaimsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rxClaimsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxClaimDetails" type="{http://services.rqns.optum.com/}rxClaimDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rxClaimsInfo", propOrder = {
    "returnCode",
    "returnCodeDesc",
    "rxClaimDetails"
})
public class RxClaimsInfo {

    protected Integer returnCode;
    protected String returnCodeDesc;
    @XmlElement(nillable = true)
    protected List<RxClaimDetails> rxClaimDetails;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnCode(Integer value) {
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
     * Gets the value of the rxClaimDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rxClaimDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRxClaimDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RxClaimDetails }
     * 
     * 
     */
    public List<RxClaimDetails> getRxClaimDetails() {
        if (rxClaimDetails == null) {
            rxClaimDetails = new ArrayList<RxClaimDetails>();
        }
        return this.rxClaimDetails;
    }

}
