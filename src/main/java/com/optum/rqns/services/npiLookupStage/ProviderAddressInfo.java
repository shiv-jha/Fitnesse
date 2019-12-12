
package com.optum.rqns.services.npiLookupStage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerAddressDetails" type="{http://services.rqns.optum.com/}providerAddressDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerAddressInfo", propOrder = {
    "providerAddressDetails"
})
public class ProviderAddressInfo {

    @XmlElement(nillable = true)
    protected List<ProviderAddressDetails> providerAddressDetails;

    /**
     * Gets the value of the providerAddressDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerAddressDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderAddressDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderAddressDetails }
     * 
     * 
     */
    public List<ProviderAddressDetails> getProviderAddressDetails() {
        if (providerAddressDetails == null) {
            providerAddressDetails = new ArrayList<ProviderAddressDetails>();
        }
        return this.providerAddressDetails;
    }

}
