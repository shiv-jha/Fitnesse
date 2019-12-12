
package com.optum.rqns.services.npiLookup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNPI" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="provOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provEnumDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npiDeactDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="npiReactDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provAddrTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provAddrLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provAddrLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provSpecialtyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="provOtherID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerDetails", propOrder = {
    "dataSource",
    "providerNPI",
    "provOrgName",
    "provLastName",
    "provFirstName",
    "provMiddleName",
    "provEnumDate",
    "lastUpdateDate",
    "npiDeactDate",
    "npiReactDate",
    "provAddrTypeCode",
    "provAddrLine1",
    "provAddrLine2",
    "provCity",
    "provState",
    "provZip",
    "provSpecialtyCode",
    "provOtherID"
})
public class ProviderDetails {

    protected String dataSource;
    protected long providerNPI;
    protected String provOrgName;
    protected String provLastName;
    protected String provFirstName;
    protected String provMiddleName;
    protected String provEnumDate;
    protected String lastUpdateDate;
    protected String npiDeactDate;
    protected String npiReactDate;
    protected String provAddrTypeCode;
    protected String provAddrLine1;
    protected String provAddrLine2;
    protected String provCity;
    protected String provState;
    protected String provZip;
    @XmlElement(nillable = true)
    protected List<String> provSpecialtyCode;
    @XmlElement(nillable = true)
    protected List<String> provOtherID;

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the providerNPI property.
     * 
     */
    public long getProviderNPI() {
        return providerNPI;
    }

    /**
     * Sets the value of the providerNPI property.
     * 
     */
    public void setProviderNPI(long value) {
        this.providerNPI = value;
    }

    /**
     * Gets the value of the provOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvOrgName() {
        return provOrgName;
    }

    /**
     * Sets the value of the provOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvOrgName(String value) {
        this.provOrgName = value;
    }

    /**
     * Gets the value of the provLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvLastName() {
        return provLastName;
    }

    /**
     * Sets the value of the provLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvLastName(String value) {
        this.provLastName = value;
    }

    /**
     * Gets the value of the provFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvFirstName() {
        return provFirstName;
    }

    /**
     * Sets the value of the provFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvFirstName(String value) {
        this.provFirstName = value;
    }

    /**
     * Gets the value of the provMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvMiddleName() {
        return provMiddleName;
    }

    /**
     * Sets the value of the provMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvMiddleName(String value) {
        this.provMiddleName = value;
    }

    /**
     * Gets the value of the provEnumDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvEnumDate() {
        return provEnumDate;
    }

    /**
     * Sets the value of the provEnumDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvEnumDate(String value) {
        this.provEnumDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the npiDeactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpiDeactDate() {
        return npiDeactDate;
    }

    /**
     * Sets the value of the npiDeactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpiDeactDate(String value) {
        this.npiDeactDate = value;
    }

    /**
     * Gets the value of the npiReactDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpiReactDate() {
        return npiReactDate;
    }

    /**
     * Sets the value of the npiReactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpiReactDate(String value) {
        this.npiReactDate = value;
    }

    /**
     * Gets the value of the provAddrTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvAddrTypeCode() {
        return provAddrTypeCode;
    }

    /**
     * Sets the value of the provAddrTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvAddrTypeCode(String value) {
        this.provAddrTypeCode = value;
    }

    /**
     * Gets the value of the provAddrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvAddrLine1() {
        return provAddrLine1;
    }

    /**
     * Sets the value of the provAddrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvAddrLine1(String value) {
        this.provAddrLine1 = value;
    }

    /**
     * Gets the value of the provAddrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvAddrLine2() {
        return provAddrLine2;
    }

    /**
     * Sets the value of the provAddrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvAddrLine2(String value) {
        this.provAddrLine2 = value;
    }

    /**
     * Gets the value of the provCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvCity() {
        return provCity;
    }

    /**
     * Sets the value of the provCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvCity(String value) {
        this.provCity = value;
    }

    /**
     * Gets the value of the provState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvState() {
        return provState;
    }

    /**
     * Sets the value of the provState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvState(String value) {
        this.provState = value;
    }

    /**
     * Gets the value of the provZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvZip() {
        return provZip;
    }

    /**
     * Sets the value of the provZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvZip(String value) {
        this.provZip = value;
    }

    /**
     * Gets the value of the provSpecialtyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provSpecialtyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvSpecialtyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProvSpecialtyCode() {
        if (provSpecialtyCode == null) {
            provSpecialtyCode = new ArrayList<String>();
        }
        return this.provSpecialtyCode;
    }

    /**
     * Gets the value of the provOtherID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provOtherID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvOtherID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProvOtherID() {
        if (provOtherID == null) {
            provOtherID = new ArrayList<String>();
        }
        return this.provOtherID;
    }

}
