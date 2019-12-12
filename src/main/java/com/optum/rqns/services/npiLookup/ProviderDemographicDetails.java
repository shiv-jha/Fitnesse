
package com.optum.rqns.services.npiLookup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerDemographicDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerDemographicDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerModifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicianLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicianNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerEntityCapitationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerContractStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerContractEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerNPI" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providerTIN" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialtyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providerAffiliationInfo" type="{http://services.rqns.optum.com/}providerAffiliationInfo" minOccurs="0"/>
 *         &lt;element name="providerAddressInfo" type="{http://services.rqns.optum.com/}providerAddressInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerDemographicDetails", propOrder = {
    "dataSource",
    "clientGuid",
    "providerID",
    "globalProviderID",
    "providerModifier",
    "providerFullName",
    "physicianLastName",
    "providerFirstName",
    "providerMiddleName",
    "physicianNameSuffix",
    "providerEntityCapitationInd",
    "participatingStatus",
    "providerContractStartDate",
    "providerContractEndDate",
    "providerNPI",
    "providerTIN",
    "specialtyCode",
    "providerAffiliationInfo",
    "providerAddressInfo"
})
public class ProviderDemographicDetails {

    protected String dataSource;
    protected String clientGuid;
    protected String providerID;
    protected String globalProviderID;
    protected String providerModifier;
    protected String providerFullName;
    protected String physicianLastName;
    protected String providerFirstName;
    protected String providerMiddleName;
    protected String physicianNameSuffix;
    protected String providerEntityCapitationInd;
    protected String participatingStatus;
    protected String providerContractStartDate;
    protected String providerContractEndDate;
    @XmlElement(nillable = true)
    protected List<String> providerNPI;
    @XmlElement(nillable = true)
    protected List<String> providerTIN;
    @XmlElement(nillable = true)
    protected List<String> specialtyCode;
    protected ProviderAffiliationInfo providerAffiliationInfo;
    protected ProviderAddressInfo providerAddressInfo;

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
     * Gets the value of the clientGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGuid() {
        return clientGuid;
    }

    /**
     * Sets the value of the clientGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGuid(String value) {
        this.clientGuid = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the globalProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalProviderID() {
        return globalProviderID;
    }

    /**
     * Sets the value of the globalProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalProviderID(String value) {
        this.globalProviderID = value;
    }

    /**
     * Gets the value of the providerModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderModifier() {
        return providerModifier;
    }

    /**
     * Sets the value of the providerModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderModifier(String value) {
        this.providerModifier = value;
    }

    /**
     * Gets the value of the providerFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFullName() {
        return providerFullName;
    }

    /**
     * Sets the value of the providerFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFullName(String value) {
        this.providerFullName = value;
    }

    /**
     * Gets the value of the physicianLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicianLastName() {
        return physicianLastName;
    }

    /**
     * Sets the value of the physicianLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicianLastName(String value) {
        this.physicianLastName = value;
    }

    /**
     * Gets the value of the providerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFirstName() {
        return providerFirstName;
    }

    /**
     * Sets the value of the providerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFirstName(String value) {
        this.providerFirstName = value;
    }

    /**
     * Gets the value of the providerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderMiddleName() {
        return providerMiddleName;
    }

    /**
     * Sets the value of the providerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderMiddleName(String value) {
        this.providerMiddleName = value;
    }

    /**
     * Gets the value of the physicianNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicianNameSuffix() {
        return physicianNameSuffix;
    }

    /**
     * Sets the value of the physicianNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicianNameSuffix(String value) {
        this.physicianNameSuffix = value;
    }

    /**
     * Gets the value of the providerEntityCapitationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderEntityCapitationInd() {
        return providerEntityCapitationInd;
    }

    /**
     * Sets the value of the providerEntityCapitationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderEntityCapitationInd(String value) {
        this.providerEntityCapitationInd = value;
    }

    /**
     * Gets the value of the participatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipatingStatus() {
        return participatingStatus;
    }

    /**
     * Sets the value of the participatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipatingStatus(String value) {
        this.participatingStatus = value;
    }

    /**
     * Gets the value of the providerContractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderContractStartDate() {
        return providerContractStartDate;
    }

    /**
     * Sets the value of the providerContractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderContractStartDate(String value) {
        this.providerContractStartDate = value;
    }

    /**
     * Gets the value of the providerContractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderContractEndDate() {
        return providerContractEndDate;
    }

    /**
     * Sets the value of the providerContractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderContractEndDate(String value) {
        this.providerContractEndDate = value;
    }

    /**
     * Gets the value of the providerNPI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerNPI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderNPI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProviderNPI() {
        if (providerNPI == null) {
            providerNPI = new ArrayList<String>();
        }
        return this.providerNPI;
    }

    /**
     * Gets the value of the providerTIN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerTIN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderTIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProviderTIN() {
        if (providerTIN == null) {
            providerTIN = new ArrayList<String>();
        }
        return this.providerTIN;
    }

    /**
     * Gets the value of the specialtyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialtyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialtyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialtyCode() {
        if (specialtyCode == null) {
            specialtyCode = new ArrayList<String>();
        }
        return this.specialtyCode;
    }

    /**
     * Gets the value of the providerAffiliationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderAffiliationInfo }
     *     
     */
    public ProviderAffiliationInfo getProviderAffiliationInfo() {
        return providerAffiliationInfo;
    }

    /**
     * Sets the value of the providerAffiliationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderAffiliationInfo }
     *     
     */
    public void setProviderAffiliationInfo(ProviderAffiliationInfo value) {
        this.providerAffiliationInfo = value;
    }

    /**
     * Gets the value of the providerAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderAddressInfo }
     *     
     */
    public ProviderAddressInfo getProviderAddressInfo() {
        return providerAddressInfo;
    }

    /**
     * Sets the value of the providerAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderAddressInfo }
     *     
     */
    public void setProviderAddressInfo(ProviderAddressInfo value) {
        this.providerAddressInfo = value;
    }

}
