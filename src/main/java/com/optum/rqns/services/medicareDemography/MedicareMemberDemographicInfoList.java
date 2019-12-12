
package com.optum.rqns.services.medicareDemography;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicareMemberDemographicInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicareMemberDemographicInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://services.rqns.optum.com/}memberDemographicInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorCd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "medicareMemberDemographicInfoList", propOrder = {
    "memberDemographicInfo",
    "errorCd",
    "errorMsg"
})
public class MedicareMemberDemographicInfoList {

    @XmlElement(namespace = "http://services.rqns.optum.com/")
    protected List<MedicareMemberDemographicInfo> memberDemographicInfo;
    protected Integer errorCd;
    protected String errorMsg;

    /**
     * Gets the value of the memberDemographicInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberDemographicInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberDemographicInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicareMemberDemographicInfo }
     * 
     * 
     */
    public List<MedicareMemberDemographicInfo> getMemberDemographicInfo() {
        if (memberDemographicInfo == null) {
            memberDemographicInfo = new ArrayList<MedicareMemberDemographicInfo>();
        }
        return this.memberDemographicInfo;
    }

    /**
     * Gets the value of the errorCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCd() {
        return errorCd;
    }

    /**
     * Sets the value of the errorCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCd(Integer value) {
        this.errorCd = value;
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
