
package com.optum.rqns.services.tinservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerTinInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerTinInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerNpiID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerTinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerTinInfo", propOrder = {
    "providerNpiID",
    "providerTin",
    "providerTinName",
    "dataSource",
    "returnCode",
    "returnCodeDesc"
})
public class ProviderTinInfo {

    protected String providerNpiID;
    protected String providerTin;
    protected String providerTinName;
    protected String dataSource;
    protected int returnCode;
    protected String returnCodeDesc;

    /**
     * Gets the value of the providerNpiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderNpiID() {
        return providerNpiID;
    }

    /**
     * Sets the value of the providerNpiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderNpiID(String value) {
        this.providerNpiID = value;
    }

    /**
     * Gets the value of the providerTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderTin() {
        return providerTin;
    }

    /**
     * Sets the value of the providerTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderTin(String value) {
        this.providerTin = value;
    }

    /**
     * Gets the value of the providerTinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderTinName() {
        return providerTinName;
    }

    /**
     * Sets the value of the providerTinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderTinName(String value) {
        this.providerTinName = value;
    }

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
     * Gets the value of the returnCode property.
     * 
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     */
    public void setReturnCode(int value) {
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

}
