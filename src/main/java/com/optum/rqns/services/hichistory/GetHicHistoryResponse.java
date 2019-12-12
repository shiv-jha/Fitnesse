
package com.optum.rqns.services.hichistory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHicHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHicHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputHicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hicCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hicDetails" type="{http://services.rqns.optum.com/}hicDetails" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getHicHistoryResponse", propOrder = {
    "inputHicNumber",
    "hicCount",
    "hicDetails",
    "errorMsg"
})
public class GetHicHistoryResponse {

    protected String inputHicNumber;
    protected int hicCount;
    @XmlElement(nillable = true)
    protected List<HicDetails> hicDetails;
    protected String errorMsg;

    /**
     * Gets the value of the inputHicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputHicNumber() {
        return inputHicNumber;
    }

    /**
     * Sets the value of the inputHicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputHicNumber(String value) {
        this.inputHicNumber = value;
    }

    /**
     * Gets the value of the hicCount property.
     * 
     */
    public int getHicCount() {
        return hicCount;
    }

    /**
     * Sets the value of the hicCount property.
     * 
     */
    public void setHicCount(int value) {
        this.hicCount = value;
    }

    /**
     * Gets the value of the hicDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hicDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHicDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HicDetails }
     * 
     * 
     */
    public List<HicDetails> getHicDetails() {
        if (hicDetails == null) {
            hicDetails = new ArrayList<HicDetails>();
        }
        return this.hicDetails;
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
