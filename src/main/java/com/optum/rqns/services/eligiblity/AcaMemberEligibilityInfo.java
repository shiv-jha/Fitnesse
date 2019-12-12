
package com.optum.rqns.services.eligiblity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acaMemberEligibilityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acaMemberEligibilityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acaMemberEligibilityDetails" type="{http://services.rqns.optum.com/}acaMemberEligibilityDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acaMemberEligibilityInfo", propOrder = {
    "acaMemberEligibilityDetails",
    "errorMsg"
})
public class AcaMemberEligibilityInfo {

    @XmlElement(nillable = true)
    protected List<AcaMemberEligibilityDetails> acaMemberEligibilityDetails;
    protected String errorMsg;

    /**
     * Gets the value of the acaMemberEligibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acaMemberEligibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcaMemberEligibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcaMemberEligibilityDetails }
     * 
     * 
     */
    public List<AcaMemberEligibilityDetails> getAcaMemberEligibilityDetails() {
        if (acaMemberEligibilityDetails == null) {
            acaMemberEligibilityDetails = new ArrayList<AcaMemberEligibilityDetails>();
        }
        return this.acaMemberEligibilityDetails;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

}
