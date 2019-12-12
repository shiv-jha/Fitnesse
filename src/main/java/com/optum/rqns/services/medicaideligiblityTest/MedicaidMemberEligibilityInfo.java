
package com.optum.rqns.services.medicaideligiblityTest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicaidMemberEligibilityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicaidMemberEligibilityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicaidMemberEligibilityDetails" type="{http://services.rqns.optum.com/}medicaidMemberEligibilityDetails" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "medicaidMemberEligibilityInfo", propOrder = {
    "medicaidMemberEligibilityDetails",
    "errorMsg"
})
public class MedicaidMemberEligibilityInfo {

    @XmlElement(nillable = true)
    protected List<MedicaidMemberEligibilityDetails> medicaidMemberEligibilityDetails;
    protected String errorMsg;

    /**
     * Gets the value of the medicaidMemberEligibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicaidMemberEligibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicaidMemberEligibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicaidMemberEligibilityDetails }
     * 
     * 
     */
    public List<MedicaidMemberEligibilityDetails> getMedicaidMemberEligibilityDetails() {
        if (medicaidMemberEligibilityDetails == null) {
            medicaidMemberEligibilityDetails = new ArrayList<MedicaidMemberEligibilityDetails>();
        }
        return this.medicaidMemberEligibilityDetails;
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
