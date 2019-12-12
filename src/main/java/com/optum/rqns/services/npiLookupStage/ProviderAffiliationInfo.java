
package com.optum.rqns.services.npiLookupStage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerAffiliationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerAffiliationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerAffiliationDetails" type="{http://services.rqns.optum.com/}providerAffiliationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerAffiliationInfo", propOrder = {
    "providerAffiliationDetails"
})
public class ProviderAffiliationInfo {

    @XmlElement(nillable = true)
    protected List<ProviderAffiliationDetails> providerAffiliationDetails;

    /**
     * Gets the value of the providerAffiliationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerAffiliationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderAffiliationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderAffiliationDetails }
     * 
     * 
     */
    public List<ProviderAffiliationDetails> getProviderAffiliationDetails() {
        if (providerAffiliationDetails == null) {
            providerAffiliationDetails = new ArrayList<ProviderAffiliationDetails>();
        }
        return this.providerAffiliationDetails;
    }

}
