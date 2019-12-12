
package com.optum.rqns.services.medicareEligiblity2Test;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memberEligibilityInfov2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memberEligibilityInfov2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberInfo" type="{http://services.rqns.optum.com/}memberInfo" minOccurs="0"/>
 *         &lt;element name="memberHicHistoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="memberHicHistoryv2" type="{http://services.rqns.optum.com/}memberHicHistoryv2" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "memberEligibilityInfov2", propOrder = {
    "memberInfo",
    "memberHicHistoryList",
    "errorCd",
    "errorMsg"
})
public class MemberEligibilityInfov2 {

    protected MemberInfo memberInfo;
    protected MemberEligibilityInfov2 .MemberHicHistoryList memberHicHistoryList;
    protected Integer errorCd;
    protected String errorMsg;

    /**
     * Gets the value of the memberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MemberInfo }
     *     
     */
    public MemberInfo getMemberInfo() {
        return memberInfo;
    }

    /**
     * Sets the value of the memberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberInfo }
     *     
     */
    public void setMemberInfo(MemberInfo value) {
        this.memberInfo = value;
    }

    /**
     * Gets the value of the memberHicHistoryList property.
     * 
     * @return
     *     possible object is
     *     {@link MemberEligibilityInfov2 .MemberHicHistoryList }
     *     
     */
    public MemberEligibilityInfov2 .MemberHicHistoryList getMemberHicHistoryList() {
        return memberHicHistoryList;
    }

    /**
     * Sets the value of the memberHicHistoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberEligibilityInfov2 .MemberHicHistoryList }
     *     
     */
    public void setMemberHicHistoryList(MemberEligibilityInfov2 .MemberHicHistoryList value) {
        this.memberHicHistoryList = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="memberHicHistoryv2" type="{http://services.rqns.optum.com/}memberHicHistoryv2" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberHicHistoryv2"
    })
    public static class MemberHicHistoryList {

        protected List<MemberHicHistoryv2> memberHicHistoryv2;

        /**
         * Gets the value of the memberHicHistoryv2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberHicHistoryv2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberHicHistoryv2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MemberHicHistoryv2 }
         * 
         * 
         */
        public List<MemberHicHistoryv2> getMemberHicHistoryv2() {
            if (memberHicHistoryv2 == null) {
                memberHicHistoryv2 = new ArrayList<MemberHicHistoryv2>();
            }
            return this.memberHicHistoryv2;
        }

    }

}
